import java.util.Scanner;
import java.util.Arrays;
public class 배열응용_문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		char[]c=new char[10];
//		for (int i=0; i<=5; i++)
//		{
//			
//		}
		Scanner scan= new Scanner(System.in);
		
		
		int []arr= new int[10];
		double avg = 0.0; 
		int total = 0;
		//int i=scan.nextInt
		for(int i=0; i<10; i++ ) 
		{
			arr[i]=(int)(Math.random()*10)+1;
			total+=arr[i];
			avg=total%10;
		}
		System.out.println(Arrays.toString(arr));
		System.out.println(total);
	    System.out.println(avg);
	    
	    
		
	    int[]num= {94, 85, 95, 88, 90 };
	    int max=num[0];
	    int min = num[0];
	    
	    for(int i :num)
	    {
	    	if (max<i)
	    		max=i;
	    	if(min>i)
	    		min=i;
	    }
	    System.out.println("최대값:"+max);
	    System.out.println("최소값:"+min);
	
		// int[1]=20;
	    
	    int[] arr1 = {10,20,30,50,3,60,-3};
	    int index=0;
	    for(int j=0; j<arr1.length; j++)
	    {
	    	if(arr[j]==60)
	    	{
	    		break;
	    	}
	    }
	   /*
	    *  System.out.println("인덱스:"+j);
	    *  
	    *  
	    *  
	    */
	    	

		
			

	}

}
