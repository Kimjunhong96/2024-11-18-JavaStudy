import java.util.Scanner;
public class 반복문_문제2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("첫번째 숫자 입력");
		int a=scan.nextInt();
		System.out.println("두번째 숫자 입력");
		int b=scan.nextInt();
		System.out.println("+,-,*,/ 중에 입력");
		switch (scan.next())
		{
		case "+" :
			System.out.println(a+"+"+b+"="+(a+b));
			break;
		case "-" :
			System.out.println(a+"-"+b+"="+(a-b));
			break;
		case "*" :
			System.out.println(a+"*"+b+"="+a*b);
			break;
		case "/" :
			System.out.println(a+"/"+b+"="+a/b);
			break;
		
		
		}

	}

}
