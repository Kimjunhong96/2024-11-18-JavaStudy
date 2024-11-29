import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;
public class 배열_문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println("===국어 점수를 입력하세요===");
//		int[] arr = new int[5];
//		int[] rank = new int[5];
//		Scanner scan=new Scanner(System.in);
//		int score = scan.nextInt();
//		for (int i = 0; i < arr.length; i++)
//		{
//			
//			arr[i]=(int)(Math.random()*101)+1;
//			System.out.println(Arrays.toString(arr));
//		}
		
		
		
//		int[] arr=new int[10];
//		int max=0;
//		int min=100;
//		// 배열 초기화
//		for(int i = 0; i<arr.length; i++)
//		{
//			arr[i]=(int)(Math.random()*100)+1;
//			
//		}
//		// 최대값 , 최소값
//		for(int i:arr)
//		{
//			if(max<i)
//				max=i;
//			if(min>i)
//				min=i;
//		}
//		System.out.println("최대값:"+max);
//		System.out.println("최소값:"+min);
		
		// 1. 배열선언
//		int[] arr = new int[10];
//		// 2. 초기화
//		for(int i = 0; i<arr.length; i++)
//		{
//			arr[i]=(int)(Math.random()*100)+1;
//			
//		}
//		System.out.println(Arrays.toString(arr));
//		// 3.
//		System.out.println(arr[1]); // 두번째 값을 출력 
//		System.out.println(arr[arr.length-1]);
		// arr.length-1 => 마지막 인덱스 
		
		
//		int sum = 0;
//		double avg= 0.0;
//		int[] arr=new int[10];
//		// 초기화 => 난수
//		for(int i=0; i<arr.length; i++)
//		{
//			arr[i]=(int)(Math.random()*100)+1;
//		}
//		//확인
//		System.out.println(Arrays.toString(arr));
//		// 문제 처리 => 합/평균
//		for(int i:arr)
//		{
//			sum+=i;
//		}
//		avg=sum/10.0;
//		System.out.println("총합:"+sum);
//		System.out.println("평균:"+avg);
		
		int sum = 0;
		int[] arr= new int[10];
		for (int i = 0; i < arr.length; i++)	
		{
			arr[i]=(int)(Math.random()*100)+1;
			//System.out.println(Arrays.toString(arr));
			if(arr[i]%3==0);
			System.out.println(arr[i]+" ");
		}
		

	}

}
