import java.util.Scanner;
public class 반복문정리문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("==구구단==");
		Scanner scan =new Scanner(System.in);
//	1.	int dan = scan.nextInt();
//		int i = 1;
//		while (i <= 9)
//		{
//			System.out.println(dan+"x"+i+"="+dan*i);
//			i++;
//			
//		}
//	2.	int i = 1;
//		while (i <= 100)
//		{
//			if(i%8==0)
//			System.out.println(i);
//			i++;
//		}
//	3.	int i = 1;
//		while ( i <= 100)
//		{
//			if(i%4==0 || i%7==0)
//			System.out.println(i);
//			i++;
//		}
//	4.	int i = 1;
//		while ( i<=100 )
//		{
//			if(i%10==3 || i%10==6 || i%10==9 )
//			System.out.println(i);
//			i++;
//		}
		
//		int j = 0;
//		int a = 0 ,e=0 , k=0, o=0, u=0 ;
////	5.	int text = scan.nextLine();
////		while(j<str.length())
//		{
//			char c = str.charAt(j);
//			if(c=='a')
//				a++;
//			else if(c=='e')
//				e++;
//			else if (c=='i')
//				k++;
//		}
		
		
//	6.	int num = scan.nextInt();
//		int i = 1;
//		while ( i <= 99 )
//		{
//			int a = i/10;
//		    int b = i%10;
//		    if(a+b==num)
//		    	System.out.println(i+" ");
//		    i++;
//		}
		
//	7.	int i = 10;
//		while ( i <= 20)
//		{
//			System.out.println(i);
//			i++;
//		}
		
//	8.	int i = 20;
//		while ( i >= 10)
//		{
//			System.out.println(i);
//			i--;
//		}
		
	//9.
//		int num = scan.nextInt();
	
	
	
	//10. 
	    int i = 1;
	    int sum = 0;
	    String strMax="";
	    int max = 0;
	    while(i<=3)
	    {
	    	System.out.println("문자열 입력:");
	    	String str = scan.nextLine();
	    	sum+=str.length();
	    	if ( max< str.length())
	    	{
	    		strMax=str;
	    	}
	    	i++;
	    }
	    System.out.println("총 문자열 길이:"+sum);
	    System.out.println("긴 문자열 출력:"+strMax);
	    
		
			

	}

}
