//1~100 사이의 3의배수 합 , 5의배수 합 , 7의 배수의 합
import java.util.Scanner;
public class 반복문_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int sum=0,even=0,odd=0; 
		for(int i=1;i<=100;i++)
		{
			if(i%3==0)
				sum+=i;
			if(i%5==0)
				even+=i;
			if(i%7==0)
				odd+=i;
		}

	}

}
