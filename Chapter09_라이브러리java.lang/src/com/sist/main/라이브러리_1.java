package com.sist.main;
/*
 *   자바에서 지원하는 라이브러리 
 *                -------- 프로그램에 필요한 클래스를 모아서 개발시에 사용이 가능하게 한다 
 *   => 라이브러리중심 => 조립 
 *   => Scanner / System / String .... 
 *   
 *   => 라이브러리 
 *   	1) 자바에서 지원 
 *         java.lang = 9
 *           Object
 *           System
 *           **String
 *           StringBuffer
 *           Math
 *           **Wrapper
 *           -------
 *           	***=> Integer
 *           	***=> Double
 *           	***=> Boolean
 *              => Byte
 *              => Float
 *              ***=> Long
 *         java.util = 10
 *              => Scanner
 *              => Date / Calendar
 *              => Collection
 *                 -----------> 배열대체
 *                 List / Set / Map
 *                 ----------------- interface
 *                 List : ***ArrayList,Vector,LinkedList,Stack
 *                                                |
 *                                              Queue
 *                 Set : TreeSet / ***HashSet : 중복없는 데이터
 *                 Map : ***HashMap / Hashtable 
 *         java.io   = 11
 *            => FileReader / FileWriter
 *            => InputStream / OutputStream
 *            => BufferReader / BufferedWriter
 *            => BufferedInputStream / BufferedOutputStream 
 *            => 입출력 : 파일 / 메모리 / 네트워크 
 *            => ~Stream , Reader/Writer
 *               -------   -------------
 *               1byte       2byte(한글포함)
 *                 | 네트워크 , 파일업로드/다운로드
 *           => File
 *        
 *         java.sql  = 12 
 *             => Connection
 *             => Statement
 *             => ResultSet
 *         ------------------
 *         java.net
 *              => URL / ServerSocket / Socket
 *         java.text
 *         		=> SimpleDateFormat / MessageFormat / DecimalFormat
 *         java.lang.reflect
 *         		=> 리플렉션 => 메소드 / 클래스 / 변수 / 생성자
 *         **** Annotation, 열거형
 *              -----------
 *          J2SE
 *          웹 라이브러리 : JSP / Servlet / Spring => 2차 자바 
 *          J2EE
 *          
 *          J2ME (X) => Kotlin => Dart (fullter)
 *         ------------------
 *         java.swing (X) 
 *         ------------------ 1.0
 *         => javax.http
 *         => javax.servlet.http
 *         ----------------------- 2.0
 *         => org.springframework
 *         
 *         Java / Oracle / JSP / Spring / Spring-Boot
 *               | MyBatis / JPA
 *               | Oracle / MySQL(MariaDB)
 *         ------------------------------------------ Back
 *         HTML / CSS / JavaScript => TypeScript 
 *         ----------------------- 
 *         
 *         
 *         1. 데이터 분석 : 파이썬 (넘파이 , 판다스 , Matplotlib)
 *                       Spring <==> 파이썬
 *                                     |
 *                                   Django
 *         2. 
 *         
 *   	2) 외부업체 지원 : Jsoup / lombok / Spring 
 *    		=> mvnrepository.com 
 *          => simple-json / bson ....
 *   	3) 사용자 정의 
 *   
 *   =====================================================
 *    9장 
 *       java.lang패키지
 *       1) import 를 생략할 수 있다 => 자동 추가 
 *       2) 대표클래스 
 */
class Student {
	private String name; 
	private String phone;
	private String address;
	
	// 접근 가능 => 메소드 
	public Student(String name,String phone,String address) {
		// 지역변수 / 매개변수
		/*
		 *  1. 지역변수 , 매개변수 찾기
		 *  2. 멤버변수 
		 */
		this.name=name;
		this.phone=phone;
		this.address=address;
	}
	public void print () {
		System.out.println("이름:"+name);
		System.out.println("주소:"+address);
		System.out.println("전화:"+phone);
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		System.out.println("이름:"+name);
		System.out.println("주소:"+address);
		System.out.println("전화:"+phone);
		return super.toString();
	}
}
public class 라이브러리_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student("홍길동","010-1111-1111","서울");
		Student s2=new Student("심청이","010-1234-1222","부산");
		//s1.print();
		System.out.println(s1); // 메모리 주소 => 묵시적
		//s2.print();
		System.out.println(s2.toString()); //=> 명시적
	}

}
