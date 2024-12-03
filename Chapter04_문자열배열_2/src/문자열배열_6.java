// 문자열 배열 => 웹에서 데이터 추출 (크롤링) 
// => 달력 
// => 이후에는 모든 데이터는 오라클에 존재 
/*
 * 
 * 
 * 
 *   = 몇개저장 => 데이터형
 *     ---------------- 선언
 *   = 초기화
 *   = 요청된 데이터를 구하기
 *   = 결과값 출력 
 */


import java.util.*;
public class 문자열배열_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int total=0;
//		int max=0;
//		int min=0;
//		int[]score = {100,90,85};
//		System.out.println("1번 학생:"+score[0]);
//		System.out.println("2번 학생:"+score[1]);
//		System.out.println("3번 학생:"+score[2]);
//		
//		
//		
//		int[] s= {50, 45, 35, 12, 70};
//		
//		
//		for(int i=0; i<s.length; i++)
//		{
//			System.out.println((i+1)+"사원:"+s[i]);
//			total+=s[i];
//		}
//		System.out.println("총점:"+total);
//		System.out.printf("평균:%.2f\n",total/(double)s.length);
//	
//		
//		
//		int[]arr = new int [10];
//		int sum=0;
//		for(int i=0; i<arr.length; i++)
//		{
//			arr[i]=i; // 0~9 
//			sum+=arr[i];
//			System.out.println("0~9까지의 합:"+sum);
//		}
		
		
		
//		
//		int[] arr = {10, 20, 30, 40, 50};
//		int sum = 0;
//
//		for(int i:arr)
//		{
//			sum+=i;
//		}
//		System.out.println("sum="+sum);
		
		
//		int[] arr=new int[10]; // 정수를 10개 저장
//		// 초기화
//		for(int i = 0; i<arr.length; i++)
//		{
//			arr[i]=(int)(Math.random()*100)+1;
//		}
//		System.out.println(Arrays.toString(arr));
//		
//		int evenTotal=0;  // 짝수
//		int oddTotal=0; // 홀수
//		for (int i : arr)
//		{
//			if(i%2==0)
//				evenTotal+=i;
//			else
//				oddTotal+=i;
//		}
//		System.out.println("짝수의 합:"+evenTotal);
//		System.out.println("홀수의 합:"+oddTotal);
		
		
//		int[] arr=new int [100];
//		// 초기값 = 0~9사이의 값을 저장
//		for (int i=0; i<arr.length; i++)
//		{
//			arr[i]=(int)(Math.random()*10);
//		}
//		System.out.println(Arrays.toString(arr));
//		
//		int [] result = new int[10];
//		for(int i=0; i<arr.length; i++)
//		{
//			result[arr[i]]++;
//		}
		
		
		 int[] arr = new int[10];
	        for (int i = 0; i < 100; i++)
	        {
	            int num = (int)(Math.random() * 10);
	            System.out.print(num + " ");
	            arr[num]++;
	        }
	        System.out.println();
	        
	        System.out.println(Arrays.toString(arr));
	        
	        for (int i = 0; i < arr.length; i++) 
	        {
				System.out.println(i + "의 개수 : " + arr[i]);
			}
	        
	        
	        
//			char[] arr = new char[5];
//			
//			for (int i = 0; i < arr.length; i++) {
//				arr[i] = (char) ((int)(Math.random() * 26) + 65);
//			}
//			Arrays.sort(arr);
//			System.out.println(Arrays.toString(arr));
			
	        

	}

}
