package com.sist.dao;
import java.util.*;
import java.sql.*;
import com.sist.vo.*;
import lombok.*;


public class ReplyBoardDAO {
	
	// 연결 => 오라클
	private Connection conn;
	// 송수신 => SQL문장 전송 , 결과값 받기
	private PreparedStatement ps;
	// 메모리 절약 / Connection 객체 생성 조절
	private static ReplyBoardDAO dao;
	// 오라클 연결 주소
	private final String URL ="jdbc:oracle:thin:@localhost:1521:XE";
	
	// 드라이버 등록 => 한번만 사용
	public ReplyBoardDAO() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// 리플렉션 => 클래스이름으로 메모리할당 / 메소드 제어 ..
			// new 역할 => 메소드명을 모르는 경우에도 호출 가능
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
	}
		// 싱글턴
		public static ReplyBoardDAO newInstance() {
			if(dao==null)
				dao=new ReplyBoardDAO();
			return dao;
		}
		// 연결
		public void getConnection() {
			try {
				conn = DriverManager.getConnection(URL,"hr","happy");
			}
			catch(Exception ex) {
				ex.printStackTrace();
			}
			
		}
		public void disConnection() {
			try {
				if(ps!=null)
					ps.close();
			}
			catch(Exception ex) {
				ex.printStackTrace();
			}
		}
		
		
		public List<ReplyBoardVO> boardListData(int page) {
			List<ReplyBoardVO> list = new ArrayList<ReplyBoardVO>();
			try {
				// 1. 연결
				getConnection();
				// 2. SQL 문장 제작
				String sql = "SELECT no,subject,name,to_CHAR(regdate,'YYYY-MM-DD'),hit,group_tab,num "
						+ "FROM (SELECT no,subject,name,regdate,hit,group_tab,rownum as num "
						+ "FROM (SELECT no,subject,name,regdate,hit,group_tab "
						+ "FROM replyBoard ORDER BY group_id DESC,group_step ASC)) "
						+ "WHERE num BETWEEN ? AND ?";
				ps = conn.prepareStatement(sql);
				int rowSize=10;
				int start = (rowSize*page)-(rowSize-1);
				int end = rowSize*page;
				
				ps.setInt(1, start);
				ps.setInt(2, end);
				
				// 실행요청
				ResultSet rs = ps.executeQuery();
				while(rs.next()) {
					ReplyBoardVO vo = new ReplyBoardVO();
					vo.setNo(rs.getInt(1));
					vo.setSubject(rs.getString(2));
					vo.setName(rs.getString(3));
					vo.setDbday(rs.getString(4));
					vo.setHit(rs.getInt(5));
					vo.setGroup_tab(rs.getInt(6));
					
					list.add(vo);
				}
				rs.close();
			}
			catch(Exception ex) {
				ex.printStackTrace();
			}
			finally {
				disConnection();
			}
			
			return list;
		}
		public int boardRowCount() {
			int total=0;
			try {
				getConnection();
				String sql="SELECT CEIL(COUNT(*)/10.0) FROM replyBoard";
				ps = conn.prepareStatement(sql);
				ResultSet rs = ps.executeQuery();
				rs.next();
				total=rs.getInt(1);
			}
			catch (Exception ex) {
				
			}
			return total;
		}
		// 2. 글쓰기 => INSERT 
		// 매개변수가 3개이상 => 배열 / VO를 이용한다
		public void boardInsert(ReplyBoardVO vo) {
			try {
				getConnection();
				String sql = "INSERT INTO replyBoard(no,name,subject,content,pwd,group_id)"
						+ "VALUES(rb_no_seq.nextval,?,?,?,?,"
						+ "(SELECT NVL(MAX(group_id)+1,1) FROM replyBoard))";
				ps = conn.prepareStatement(sql);
				ps.setString(1, vo.getName());
				ps.setString(2, vo.getSubject());
				ps.setString(3, vo.getContent());
				ps.setString(4, vo.getPwd());
				ps.executeUpdate(); // commit() 을 수행
			}catch(Exception ex) {
				ex.printStackTrace();
			}finally
			{
				disConnection();
			}
		}
		// 3. 상세보기 => WHERE
		public ReplyBoardVO boardDetailData(int type,int no) {
			// => 상세보기 : 반드시 사용자로부터 Primary key 
			ReplyBoardVO vo=new ReplyBoardVO();
			try {
				getConnection();
				// SQL 1. 조회수 증가
				if(type==1) {
				String sql = "UPDATE replyBoard SET "
						+ "hit=hit+1 "
						+ "WHERE no="+no;
				ps = conn.prepareStatement(sql);
				ps.executeUpdate();
				}
				// SQL 2. 상세보기 내용 읽기
				String sql = "SELECT no,name,subject,content, "
						+ "TO_CHAR(regdate,'YYYY-MM-DD HH24:MI:SS'),hit "
						+ "FROM replyBoard "
						+ "WHERE no ="+no;
				ps=conn.prepareStatement(sql);
				// 한 기능을 수행할때 => SQL은 여러개일 수 있다
				ResultSet rs=ps.executeQuery();
				rs.next();
				vo.setNo(rs.getInt(1));
				vo.setName(rs.getString(2));
				vo.setSubject(rs.getString(3));
				vo.setContent(rs.getString(4));
				vo.setDbday(rs.getString(5));
				
			}catch(Exception ex) {
				ex.printStackTrace();
			}finally {
				disConnection();
			}
			return vo;
		}
		// 4. 수정
		public ReplyBoardVO boardUpdateData(int no) {
			ReplyBoardVO vo = new ReplyBoardVO();
			try {
				getConnection();
				String sql = "SELECT no,name,subject,content "
						+ "FROM replyBoard "
						+ "WHERE no="+no;
				ps = conn.prepareStatement(sql);
				ResultSet rs=ps.executeQuery();
				rs.next();
				vo.setNo(rs.getInt(1));
				vo.setName(rs.getString(2));
				vo.setSubject(rs.getString(3));
				vo.setContent(rs.getString(4));
			}catch(Exception ex) {
				ex.printStackTrace();
			}
			finally {
				disConnection();
			}
			return vo;
		}
		// 4-1 실제수정
		public boolean boardUpdate(ReplyBoardVO vo) {
			boolean bCheck=false; // 비밀번호 처리 
			/*
			 * 	메소드 : 사용자 요청 처리 => 벤치마킹 : 메뉴 , 버튼 
			 * 	1) 사용자 요청값을 받는다
			 * 		=> 매개변수 
			 * 	2) 요청처리후에 결과값 
			 * 		=> 경우의 수
			 * 		1. 목록 : List<~VO>
			 * 		2. 상세보기 : ~VO
			 * 		3. 비밀번호가 맞다 / 아니다 
			 * 					--------- boolean 
			 * 		4. 경우의 수가 3개이상일때
			 * 			String / int 
			 * 			------ 알아볼 수 있게 처리 
			 * 			| 로그인 처리
			 */
			try {
				getConnection();
				
				String sql = "SELECT pwd FROM replyBoard WHERE no="+vo.getNo();
				ps = conn.prepareStatement(sql);
				ResultSet rs = ps.executeQuery();
				rs.next();
				String db_pwd = rs.getString(1);
				rs.close();
				
				// 오라클에 존재 사용자가 보내준 비밀번호
				if(db_pwd.equals(vo.getPwd())) {
					bCheck=true;
					// 실제 수정
					sql="UPDATE replyBoard SET "
							+ "name=?,subject=?,content=? "
							+ "WHERE no=?";
					ps=conn.prepareStatement(sql);
					ps.setString(1, vo.getName());
					ps.setString(2, vo.getSubject());
					ps.setString(3, vo.getContent());
					ps.setInt(4, vo.getNo());
					
					// 수정해라 
					ps.executeUpdate();
					// INSERT / UPDATE / DELETE 가 여러개인 경우 =>
					// SELECT : 검색 => COMMIT 이 필요없다
				}
				else 
				{
					bCheck=false;
				}
			}catch(Exception ex) {
				ex.printStackTrace();
			}finally {
				disConnection();
			}
			return bCheck;
		}
		// 5. 답변
		public void replyInsert(int pno,ReplyBoardVO vo) {
			try {
				getConnection();
				conn.setAutoCommit(false);
				// SQL => 4개
				String sql = "SELECT group_id,group_step,group_tab "
						+ "FROM replyBoard "
						+ "WHERE no="+pno;
				ps=conn.prepareStatement(sql);
				ResultSet rs = ps.executeQuery();
				rs.next();
				int gi=rs.getInt(1);
				int gs=rs.getInt(2);
				int gt=rs.getInt(3);
				rs.close();
				
				// 2. SQL => group_step 변경 => 답변핵심
				sql="UPDATE replyBoard SET group_step=group_step+1 WHERE group_id=? AND group_step>?";
				ps=conn.prepareStatement(sql);
				ps.setInt(1, gi);
				ps.setInt(2, gs);
				ps.executeUpdate();
				
				// 3. SQL => INSERT
				sql = "INSERT INTO replyBoard(no,name,subject,content,pwd,group_id,group_step,group_tab,root)"
						+ "VALUES(rb_no_seq.nextval,?,?,?,?,?,?,?,?)";
				ps=conn.prepareStatement(sql);
				ps.setString(1, vo.getName());
				ps.setString(2, vo.getSubject());
				ps.setString(3, vo.getContent());
				ps.setString(4, vo.getPwd());
				ps.setInt(5, gi);
				ps.setInt(6, gs+1);
				ps.setInt(7, gt+1);
				ps.setInt(8, pno);
				ps.executeUpdate();
				// 4. SQL => UPDATE
				sql="UPDATE replyBoard SET "
						   +"depth=depth+1 "
						   +"WHERE no="+pno;
						ps=conn.prepareStatement(sql);
						ps.executeUpdate();
				
				conn.commit();
			}catch(Exception ex) {
				// 트랜잭션을 일괄처리 => 스프링 (1파트)
				try {
					conn.rollback(); // 명령문 전체 취소
				}catch (Exception e) {}
				ex.printStackTrace();
			}
			finally
			{
				try
				{
					conn.setAutoCommit(true);//원상복귀
				}catch(Exception ex) {}
				disConnection();
			}
		}
		
		
		
		// 6. 삭제 
			public boolean replyDelete(int no,String pwd)
			{
				boolean bCheck=false;
				/*
				 *   1. 비밀번호 확인  select
				 *   2. depth 
				 *      => 0 ==> delete 
				 *      => >0 ==> update
				 *   3. depth 감소 update 
				 */
				try
				{
					getConnection();
					conn.setAutoCommit(false);
					// SQL
					String sql="SELECT pwd,root,depth "
							  +"FROM replyBoard "
							  +"WHERE no="+no;
					ps=conn.prepareStatement(sql);
					ResultSet rs=ps.executeQuery();
					rs.next();
					String db_pwd=rs.getString(1);
					int root=rs.getInt(2);
					int depth=rs.getInt(3);
					rs.close();
					/*
					 *    AAAAA => 2
					 *     =>BBBBB => 1
					 *      =>CCCCC (O) => 0
					 *     =>DDDDD (O) => 0
					 *    EEEEE (O) => 0
					 */
					if(db_pwd.equals(pwd))
					{
						bCheck=true;
						
						sql="SELECT depth FROM replyBoard "
								   +"WHERE no="+root;
						ps=conn.prepareStatement(sql);
						rs=ps.executeQuery();
						rs.next();
						int d=rs.getInt(1);
						rs.close();
						// 삭제 
						if(depth==0) // 답변이 없는 경우
						{
							sql="DELETE FROM replyBoard "
							   +"WHERE no="+no;
							ps=conn.prepareStatement(sql);
							ps.executeUpdate();
						}
						else // 답변이 있는 경우 
						{
							String msg="관리자가 삭제한 게시물입니다";
							sql="UPDATE replyBoard SET "
							   +"subject=?,content=? "
							   +"WHERE no=?";
							ps=conn.prepareStatement(sql);
							ps.setString(1, msg);
							ps.setString(2, msg);
							ps.setInt(3, no);
							ps.executeUpdate();
						}
						
						//if(d>0)
						{
							sql="UPDATE replyBoard SET "
							   +"depth=depth-1 "
							   +"WHERE no="+root;
							ps=conn.prepareStatement(sql);
							ps.executeUpdate();
						}
						// 메소드 한개 => SQL한개만 사용하는 것은 아니다 
						// DML 여러개 => 트랜잭션처리 
						// INSERT / UPDATE / DELETE 
					}
					else
					{
						bCheck=false;
					}
					
					conn.commit();// 저장
				}catch(Exception ex)
				{
					try
					{
						conn.rollback();// SQL을 실행하지 않는다
					}catch(Exception e) {}
					ex.printStackTrace();
				}
				finally
				{
					try
					{
						conn.setAutoCommit(true);
					}catch(Exception e) {}
					disConnection();
				}
				// @Transactional
				return bCheck;
			}

}
