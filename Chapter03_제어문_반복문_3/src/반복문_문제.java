import java.util.Scanner;

public class 반복문_문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//	5번문제	for (int a = 1; a <= 6 ; a++)
//		{
//			for (int i = 1; i <= 6; i++)
//			{
//				if(a+i==6)
//				System.out.println(a+"+"+i+"="+(a+i));
//			}
//	6번	Scanner scan=new Scanner(System.in);
//		System.out.println("첫번째 정수입력:");
//		int start=scan.nextInt();
//		int end = 0;
//		while(true)
//		{
//		System.out.println("두번째 정수입력:");
//		end=scan.nextInt();
//		if(start<end)
//			break;
//		}
//		int gop=1;
//		for(int i=start; i <= end; i++)
//		{
//			gop*=i;
//		}
//		System.out.println(start+"~"+end+"까지"+gop);
//				
//				
//		}
//	7번	int sum = 0;
//		for (int i = 5; i <=16; i++)
//		{
		    //sum+=i;
//			System.out.println(sum);
//			
//		}
//	8번	int sum = 0;
//		for (int i = 3; i <=4462; i++) 
//		{
//			if(i%2==0);
//			sum+=i;
//		
//		}
//	9번	System.out.println(sum);
//		int sum = 0;
//		int num = 0;
//		for (int i = 0; i <=12; i++) 
//		{
//			if(i%2==0)
//			sum+=i;
//			if(i%3==0)
//			num+=i;
//		}
//		System.out.println(sum); // 2 4 6 8 10 12
//		System.out.println(num);
//	10번	int sum = 0;
//		for(int i = 1; i <=100; i++)
//		{
//			if(i%4==0)
//			sum+=i;
//		}
//		System.out.println(sum);
		char c= '☆';    char x= '★';
		for (int i = 1; i<=5; i++)
		{
			for (int j = 1; j <=5 ; j++)
			{
				if((i==1 && j==1) ||(i==5 && j==1)
					|| (i==5 && j==1)||(i==5 && j==5))
				System.out.print("★");
				else
					System.out.print("☆");
			}
			System.out.println();
		}
		
		
	}
	

}
