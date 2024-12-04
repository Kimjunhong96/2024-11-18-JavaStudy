//  메소드 재사용
import java.util.Scanner;
public class 메소드_3 {
//	static void gugudan(int dan)
//	{
//		for(int i=1; i<=9; i++)
//		{
//			System.out.println(dan+"*"+i+"="+(dan*i));
//		}
//	}
	static void gugudan(int dan)
	{
		String result="";
		for(int i=1; i<=9; i++)
		{
			result+=dan+"*"+i+"="+(dan*i);
		}
	}
	static void process()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("단 입력(2~9):");
	    int dan = scan.nextInt();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}

}
