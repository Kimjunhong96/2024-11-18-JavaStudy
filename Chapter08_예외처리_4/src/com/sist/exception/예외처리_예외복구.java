package com.sist.exception;
/*
 *   1) 예외방법과 방식
 *      -----------
 *      CheckException => 컴파일시 
 *        => java.io / java.net / java.sql
 *        => 반드시 예외처리를 사용
 *        => 컴파일시에 예외처리를 작성했는지 확인 
 *      UnCheckException => 런타임(실행시)
 *        => java.lang / java.util
 *          => Object => clone() => 예외처리가 필요 
 *                     ----------- 메모리 복제 (prototype)
 *        => 예외처리를 필요시에만 작성
 *                   --------  사용자가 자주 발생하는 에러가 있는 경우
 *                   
 *        => 예외 종류 / 형식
 *           1) 직접처리 (예외복구)
 *           	try
 *           	{	
 *           		실행이 가능한 소스 코딩 (정상수행)
 *           		=> 에러가 발생할 수 있다 => 사전에 방지하는 목적 
 *           		=> 에러가 난 경우 => 스킵 => catch 로 이동 
 *           		=> if => else 
 *           	}catch(예외 클래스) {
 *           		1. 에러확인이 가능 
 *           			getMessage() => 에러메세지 확인 
 *           			printStackTrace() => 실행과정 => 에러위치 확인 
 *           		2. 복구 여부 => 에러에 대한 영역 
 *           	}
 *           	finally => 생략이 가능 {
 *           		try~catch 와 상관없이 무조건 수행
 *           		--------- 에러(x),에러(o) 뭐든 수행 
 *           		=> 서버 닫기 / 오라클 닫기 / 파일 닫기 
 *           	}
 *           
 *           ** catch => 에러가 발생시 처리하는 영역
 *           	----- 다중 catch 가 가능
 *           	----- 에러 종류에 따라 따로 잡는 경우도 있다 
 *           	----- 한개로 통합할땐 (최상의 예외 클래스를 이용한다)
 *           		  ----------- Exception / Throwable 
 *           					  --------    ---------
 *           					  예외만가능     예외+에러
 *           	----- 순서가 존재한다 => 작은 예외 클래스~큰 예외 클래스 
 *           		  ----------- 계층도 (클래스 크기가 정해진다)
 *           		  
 *           		  Throwable
 *           			  |
 *           ---------------------------
 *           |							|
 *          Error					Exception
 *          							|
 *          				------------------------
 *          				|						|
 *          			IOException				RuntimeException
 *          			SQLException				|
 *          			ClassNotFoundException	 NullPointerException
 *          									 NumberFormatException
 *          									 ....
 *          
 *          *** try에서 정상수행을 하면 => catch는 수행하지 않는다 
 *          	------------ finally 가 있는 경우에는 finally 는 수행 
 *          *** try에 있는 문장을 수행하는 과정에서 에러가 난 경우에만 
 *          	catch 수행
 *          
 *          예)  
 *          	문장 1 
 *          	문장 2
 *          	---------------- 예외처리와 관련 없다 (에러가 없는 소스만)
 *          	---------------- 변수선언 / 클래스 객체선언 
 *          	try {
 *          		문장 3
 *          		문장 4
 *          		문장 5
 *          	}	
 *          	catch() --> else {
 *          		문장 6 --> 어떻게 처리할지
 *          	}
 *          	종료문장 => 수행 (정상 종료) 
 *          
 *          2) 간접 처리 (예외회피) => 컴파일시에 통과 
 *             => 특별한 경우가 아니면 사용자 정의에서는 많이 사용하지 않는다 
 *                -------- 소스가 많은 경우 (try 설정이 어려운 경우) 
 *                		  -------------
 *                		  | 유지보수 => 추가하는 기능에 예외처리가 필요하다 
 *                			------ 기능 추가 / 기능 수행 
 *             => 시스템 자체에서 처리 => 복구(x) , 정상수행도 불가능 
 *             
 *             예) 
 *             	 public void display() throws Exception {
 *             
 *             	 }
 *             
 *             	 public void main () throws Exception {
 *             		문장 1 
 *             		display(); ==> 에러 발생 (종료)
 *             		문장 2
 *             		문장 종료
 *             	}
 *              ** try~catch 를 주로 사용하는게 좋다 
 *              
 *       static => 변수,메소드 => 컴파일시에 메모리에 저장
 *       instance => 변수,메소드
 *       			 객체가 생성이 되면 => 메모리에 저장 
 *       
 *       
 *       
 *       *** 자바에서 예외처리는 전체를 제공하지 않는다
 *       *** 필요에 따라 사용자 정의 예외처리 제작이 가능 
 *       		      ---------------
 *       			  | 자바시스템에서 인식이 안됨 
 *       			  | 예외처리를 불러서 사용 
 *       			  | throw : 임의 호출 
 *       ------------- 자주 사용하지 않는다 
 *                     --------------> if
 *       => 업체에서 라이브러리 제작 ( 사용자 예외처리가 존재할 수 없다 )
 *       
 *       => throws : 예상되는 에러를 선언만 한다
 *       => throw : 고의로 예외를 발생 (테스트) => 견고성 
 */
public class 예외처리_예외복구 {
	public void display() throws Exception {
		System.out.println(10/0);
	}
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		// 인스턴스는 사용이 불가능 => 사용시에는 반드시 객체생성후 사용
		// static 은 바로 사용 가능 
		예외처리_예외복구 a=new 예외처리_예외복구();
		// a는 메모리 주소 (객체)
		// a => display 가 저장됨 
		a.display();
//		try {
//		a.display(); // 메소드호출시에는 예외처리후 사용 
//		}catch(Exception ex) {
//			ex.printStackTrace();
//		}
		System.out.println("정상 수행");
	}
	/*
	 *   웹
	 *   메뉴 => 에러
	 *   메인화면
	 *   푸터 
	 */

}
