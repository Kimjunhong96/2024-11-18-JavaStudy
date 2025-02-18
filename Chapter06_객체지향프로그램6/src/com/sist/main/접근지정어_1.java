package com.sist.main;
import java.util.*;
import java.util.Arrays;

/*
 *    패키지 : 관련된 클래스를 모아서 관리 영역
 *    ---- 폴더
 *      com.회사명.클래스종류
 *              => vo : 사용자 정의 데이터형
 *              => dao ; 오라클 연동
 *                =====> 테이블당 1개 
 *              => manager ; Open API , 크롤링
 *              => model : 브라우저 연결 => 데이터 전송
 *              ***=> commons : 공통으로 사용되는 기능
 *                => 중복 제거 => static => 공통모듈
 *              ***=> service : dao+model
 *              ***=> controller : 사용자 요청 => model
 *        => view : 화면 UI
 *        => dao / vo / controller
 *        
 *        => client / server
 *    => 자바 소스 
 *    
 *    
 *    접근 지정어
 *    --------
 *    public / protected / default / private 
 *    
 *    protected : 메소드 , 필드 , 생성자 (클래스는 사용이 불가능)
 *             => 같은 패키지에서만 사용이 가능
 *                -------- 프랜들리 
 *             => 다른 패키지 => 상속받은 클래스
 *             => 사용빈도가 거의 없다 
 *             
 *    default : 메소드 , 필드 , 생성자 , 클래스
 *            => 같은 패키지에서만 사용이 가능
 *            => 윈도우 : Button , Menu ...
 *            
 *    private : 메소드 , 필드 , 생성자
 *            => 자신의 클래스 영역에서만 사용이 가능
 *            => 데이터 은닉화 => 필드(멤버변수)는 거의 대부분이 private 를 사용
 *    
 *    public : 클래스 , 메소드 , 필드 , 생성자 
 *            => 다른 클래스와 연결
 *               -------------- 다른 패키지 연결
 *               => 클래스 , 메소드 , 생성자 
 *            => 모든 클래스에서 사용이 가능
 *            
 *   => 클래스 => public (다른 클래스외 연동)
 *   => 메소드 => public (다른 통신 담당)
 *   => 생성자 => public
 *   => 멤버변수(필드) => private
 *   
 *    class A{
 *      void display(){
 *         B b=new B();
 *         b.display();
 *      }
 *    }
 *    
 *    패키지가 만들어지면 => 다른 패키지에 있는 클래스 사용시 
 *    반드시 import 를 이용한다 
 *    import com.sist.main.클래스명
 *    import com.sist.main.*
 *    
 *    ***140page 
 *    메소드 : 한개의 기능을 수행하는 명령문의 집합
 *           => 종류
 *              1. 인스턴스 메소드 : 객체마다 따로 저장되는 메소드
 *              2. static 메소드 : 여러개 객체가 공통으로 사용되는 메소드
 *                               => 한개만 저장 => 공통모듈
 *              
 *              3. abstract 메소드 : 추상클래스 
 *              4. final 메소드  : 거의 사용빈도가 없음 
 *              
 *              회원가입
 *                오라클 연결 => static
 *                데이터를 오라클 전송 => INSERT
 *                오라클 닫기 => static
 *              회원수정
 *                오라클 연결 => static
 *                데이터를 오라클 전송 => UPDATE
 *                오라클 닫기 => static
 *              회원탈퇴
 *                오라클 연결 =>static
 *                데이터를 오라클 전송 => DELETE
 *                오라클 닫기 => static
 *                
 *          *** 반복 제거 ... => 메소드화 => public
 *          
 *          [접근지정어][제어어] 리턴형 메소드명 (매개변수...) {
 *              
 *          }
 *    
 *    제어어
 *    ----
 *    static / abstract / final
 */
class Util { 
	// 중복없는 난수 => 예약 가능한 날
	/*
	 *   값 읽기 getXxx()
	 *   값 설정 setXxx()
	 *   존재여부 isXxx() => boolean
	 *   삭제 remove() , delete() 
	 *       text
	 *       => 윈도우 / 웹 
	 */
	public  int [] getRand(int count) {
		int[] com = new int [count];
		for(int i = 0; i<com.length; i++) {
			com[i]=(int)(Math.random()*31)+1;
			for(int j=0; j<i; j++) {
				if(com[i]==com[j]) {
					i--;
				break;
				}
				}
		}
		return com; 
	}
//	public void getRand(int[]com) {
//	for(int i = 0; i<com.length; i++) {
//		com[i]=(int)(Math.random()*31)+1;
//		for(int j=0; j<i; j++) {
//			if(com[i]==com[j]) {
//				i--;
//			break;
//			}
//		}
//		
//	}
	

	// 정렬 => ASC/DESC 
	// 패키지가 없는 경우 => JSP사용이 안됨 , jar 파일을 못 만든다 
	public void display() {
		System.out.println("display() 진입");
		System.out.println("display() 기능처리");
		System.out.println("display() 종료");
	}

	

public class 접근지정어_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
//		Util util = new Util();
//		int day = (int)(Math.random()*15)+5; 
//		int[]arr=util.getRand(day);
//		//         객체명.메소드(값)
//		Arrays.sort(arr);
//		for(int i:arr) {
//			System.out.println(i+" ");
//		}
//		System.out.println("main에서 display 호출 전");
//	    util.display);
//		System.out.println("main에서 display 호출 완료");
//		util.display();
//		

	
	}
}
}
	


	

	
