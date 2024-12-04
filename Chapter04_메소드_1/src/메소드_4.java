import java.util.Scanner;
public class 메소드_4 {
	static String gugudan(int dan)
	{
		String result="";
		for(int i=1; i<=9; i++)
		{
			result+=dan+"*"+i+"="+(dan*i);
		}
		return result;
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
