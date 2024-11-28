// 1. 대소문자가 있는 문자열을 입력받아서
//    대문자는 소문자로 소문자는 대문자 변경
//    예) abdDeF ==> ABDdEf
// 2. 문자열을 입력받아서 역순으로 출력하는 프로그램 작성
//    에) abcde => edcba
import java.util.Scanner;
// toString() : 객체의 주소 => 오버라이딩
/*
 *   length()
 *   substring()
 *   equals()
 *   contains()
 *   indexOf() / lastIndexOf()
 *   valueOf()
 *   trim()
 *   --------------------------
 *   replace()
 *   -----------------------
 *   split()
 *   ---------------------- 필수적인 것들 *****
 */
public class 문자열_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("문자열 입력:");
		Scanner scan = new Scanner(System.in);
		String text=scan.next();
		String change="";
		for (int i = 0; i < text.length(); i++) 
		{
			char c = text.charAt(i);
			if(c>='A' && c<='Z')
			{
				System.out.println(c-32);
			}
		}
		
		String msg=scan.next();
		System.out.println(new StringBuilder(msg).reverse());
		for (int j = msg.length()-1; j>0; j--)
		{
			System.out.println(msg.charAt(j));
		}

	}

}
