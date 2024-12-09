/*
 *   프로그램 : 설계
 *   설계 
 *    = 변수 : 데이터
 *    = 메소드 : 기능
 *    -------------
 *     class ======> 메모리에 저장 =======> 활용 =====> 객체 소멸 
 *                   객체 / 인스턴스 
 *     설계 
 *     class 클래스명
 *     {
 *         사용할 데이터 설정 : 웹 => 상세보기 => 변수 
 *         데이터 활용도 : 메소드
 *         변수 => 데이터 수집 => 생성자 , 초기화 블럭
 *     }
 *     
 *     메모리에 저장
 *     클래스명 객체명 = new 클래스명()
 *     -----  ----   ---- 클래스 크기에 맞게 메모리 생성
 *                        => 객체명에 생성된 주소를 넘겨준다
 *                        new => 리턴형 => 메모리 주소(정수형) 
 *                     new => 메소드
 *                            int malloc(클래스)
 *                            ------------ 메모리에 저장 => 주소리턴
 *                            => 승격 => new 
 *                            => 메모리 해제 => free() => delete
 *                                                      | 사용하지 않는다
 *                                                      | GC
 *             변수 => 여러개 변수를 제어
 *     데이터형 (사용자 정의) 
 *     
 *     객체활용 
 *     객체명.변수 , 객체명.메소드.....
 *     
 *     객체소멸
 *     객체명=null
 *     
 *     => 생명주기
 *     설계 ====> 저장 ==> 활용 ===> 소멸
 *     ------------------------------
 *     소멸 => GC바로 회수하지 않는다 => 프로그램 종료시에 회수
 *     => 윈도우 / 웹 => 최적화 
 *     ----------------------------------------------
 *     눈에 보이거나 / 가상 => 객체화 가능하다 
 *     현실세계 / 비현실 세계도 객체화가 가능 ====> 시뮬레이션 
 *     --------------------------------------------
 *     | 개발자만 알면 된다 
 *     | 개발자마다 변수 설정 / 메소드 설정 
 *     | => 중요한 데이터는 감춰져 있다 
 *     
 *     자바 (프로그램 언어) => 데이터 관리 
 *       1) 메모리 저장
 *          ---------
 *            언제까지 사용이 가능
 *               => 인스턴스 / 정적변수 / 지역변수 / 매개변수
 *                   --------------  ---------------
 *                   프로그램 종료시       메소드 종료시
 *            어느 클래스에서 접근 가능
 *              => 인스턴스 / 정적변수 / 지역변수 / 매개변수
 *                ----------------  ----------------
 *                다른 클래스 까지      메소드안에서만 사용이 가능
 *                = 전체 클래스에서 사용
 *                = 같은 폴더에서 
 *                = 자신 클래스 
 *                ------------------- 제어어 => 접근지정어
 *                
 *     3) 관리 시작 => 메소드 이용 
 *        = 추가 / 변경 / 밝기 => 메소드 (기능)
 *     2) 변수 => 필요시마다 초기화 
 *               생성자 / 초기화 블록
 *               
 *      ==> 변수는 메모리 공간 
 *          -------------- 값이 설정 
 *          1. 기본 초기 값 
 *          2. 초기값 지정
 *          --------------- class 블럭에서 가능
 *          3. 외부에서 읽어서 초기화 (크롤링,오라클,파일)
 *          4. 입력값을 받아서 초기화
 *          -------------- class 블럭에서 사용이 안된다
 *             => 생성자 / 초기화 블럭
 *          *** class ClassName
 *              {
 *                	1. 선언
 *                      => 기본값으로 초기화 
 *                      int = 0
 *                      long = 0:
 *                      double = 0.0
 *                      boolean = false
 *                      String = null (주소가 없는 상태)
 *                  2. 선언과 동시에 값을 지정 
 *                      int a =10; => 명시적 초기화
 *                  => 연산처리 , 메소드 호출 , 제어문 (X) => 구현
 *                     구현 : 메소드안에서 , {} 
 *                  예) 
 *                     int a;
 *                     a = 10; ==> 오류 
 *                     
 *                     int a = 10; = 가능
 *                     
 *                     int a;
 *                     {
 *                        a=10;  => 인스턴스 블록
 *                     }
 *              }
 *       *** 클래스 <=> 클래스
 *                  | 맴버변수 / 메소드 => 메모리에 있는 데이터 공유  
 *      클래스 영역에 선언되는 변수
 *      1) 인스턴스 변수 : new 를 사용할떄마다 따로 저장되는 변수 
 *      2) 정적 변수 (static)
 */
class Music{
	String title;
	String singer;
	int rank;
	String album;
	int like;
	String poster;
	
	String state;  // 상태
	int idcrement; //등폭
}
class Recipe1{
	String chef;
	String title;
	int view;
	int score;
	String poster;
	String chef_poster;
}
class Restaurant{
	String poster;
	String[] subposter =new String[7];
	String name;
	String type;
	String tel;
	String adr;
	double score;
	String theme;
	int like;
}
class info{
	String time;
	String rank;
	String holiday;
	String table;
	String drink;
	String smoke;
	String toilet;
	String parking;
	String reservation;
	String detail;
	String etc;
}
class signIn{
	String id;
	String pwd;
	String name;
	String sex;
	String birth;
	String mail;
	String zip;
	String adr;
	String detail;
	String num;
	String info;
}
class FoodHouse{
	String[] poster=new String [5];
	String name,tel,addr,type,time,parking;
	String[] menu; // 동적으로 생성
	double score; 
}
public class 클래스_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
