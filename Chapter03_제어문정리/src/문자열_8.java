//  대문자 변환 => toUpperCase()   
import java.util.Scanner;
/*
 *   함수 : function
 *   메소드 : method
 *   =============== 기능상으로는 똑같다
 *   class종속
 *   C/C++/Python => function (함수)
 *   Java / Kotlin => method
 *   
 *   String data = "Hello Java"
 *   data.replace('a' , 'b') => Hello Jbvb
 *   replace(문자,문자)
 *           ---  ---
 *           old  new
 *           
 *   String data = "Hello Java"        
 *   data.replace("Java" , "Oracle") => Hello Oracle       
 *   replace(문자열,문자열)
 *           ----  ----
 *           old   new
 */
public class 문자열_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "Hong Gil Dong";
		System.out.println(name.toLowerCase());
		// Upper / Lower => 오라클 
		// 데이터 관리 => 자바+오라클 => JSP에서 HTML로 변환
		String data="Hello Java";
		System.out.println(data.replace('a', 'k'));
		System.out.println(data.replace("Java", "Oracle"));
		// 오라클 연동할때
		// 이미지 , 줄거리 , 내용 
		// |(or) , & (and) , '' => 오라클에서 첨부할 수 없다
		// & => replace
		// & => Scanner
		// || => 문자열 결합
		// 문자열 => ''

	}

}
