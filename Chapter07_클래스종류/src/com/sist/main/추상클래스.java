package com.sist.main;
/*
 *    추상클래스 
 *     = 주목적
 *       관련된 클래스를 모아서 한개의 객체명으로 관리 
 *       (서로 다른 클래스를 연결해서 사용)
 *     예) 
 *        게시판
 *        ---- 글쓰기 , 목록 , 수정 , 상세보기 , 삭제 , 검색
 *        | 묻고답하기 : 답하기
 *        | 자료실 : 다운로드 / 업로드
 *        | 댓글형게시판 : 댓글
 *        | 갤러리게시판 : 이미지 
 *        
 *        => 요구사항 분석 / 설계 
 *      => 단점
 *        = 단일 상속만 가능 
 *        = 미완성 (메소드구현이 안된경우)
 *          new 를 이용해서 객체를 생성할 수 없다 
 *        = 상속을 받아서 메소드를 구현후에 사용
 *          new 구현된 클래스의 생성자() 
 *          -------------------------> 오버라이딩
 *        = 선언된 메소드 + 선언된 안된 메소드 
 *     형식)
 *        public abstract class A 
 *        public class B extends B{
 *        
 *        } 
 *        A a =new B ();
 *        
 *        추상클래스 => 공통점을 가기고있==   
 *                   --------------------
 */
import java.util.Scanner;
abstract class 도형 {
	
}
class 네모 extends 도형{
	
}
class 삼각형 extends 도형 { 
	
	
}
class 원 extends 도형 {
	public void draw() {
		System.out.println("원을 그린다!!");
	}
	public void colorSelect() {
		System.out.println("파란색을 사용한다");
	}
	
}
public class 추상클래스 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 관련된 클래스를 모아서 한개 객체명으로 제어
		//도형 a = new 네모();
		//      ------- 상속받아서 메소드를 구현한 클래스
		// 오버라이딩 : 기능을 변경해서 사용
		/*
		 *   오버라이딩 
		 *   1) 상속 => 익명의 클래스 (상속없이 사용)
		 *   2) 메소드명 , 매개변수 , 리턴형이 동일
		 *   3) 접근지정어는 확대만 가능 ...
		 *   4) 유지보수에서 주로 사용
		 *   5) 웹 => 유사한 기능이 많다
		 *      회원가입 / 로그인 / 로그아웃 
		 *      게시판 / 공지사항 /목록 => 상세보기 
		 *      댓글 ...
		 *      예약 / 추천 / 결제 ....
		 *      여행 => 코스
		 *    => 재사용 
		 */
//		a.draw();
//		a.colorSelect();
//		
//		a=new 삼각형();
		Scanner scan=new Scanner(System.in);
		System.out.println("도형 선택: 네모(1),삼각형(2),원(3):");
		int mode = scan.nextInt();
		
//		if(mode==1) {
//			네모 a=new 네모();
//			a.colorSelect();
//			a.draw();
//		}
//		else if(mode==2) {
//			삼각형 a=new 삼각형();
//			a.colorSelect();
//			a.draw();
//		}
//		else if(mode==3) {
//			원 a=new 원();
//			a.colorSelect();
//			a.draw();
//		}
		도형 a=null;
		if(mode==1)
			a=new 네모();
		else if(mode==2)
			a=new 삼각형();
		else if(mode==3)
			a=new 원();
		
//		a.colorSelect();
//		a.draw();
//		도형[] a= {null,new 네모(),new 삼각형(),new 원()};
//		a[mode].colorSelect();
//		a[mode].draw();

	}

}
