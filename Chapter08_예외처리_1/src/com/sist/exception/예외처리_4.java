package com.sist.exception;
import java.util.Scanner;
/*
 *   UnCheck
 *   -------
 *       Throwable
 *          |
 *       Exception : 예외처리의 모든 것을 잡을 수 있다
 *          |
 *     RuntimeException => 배열범위 초과,0으로나누는경우,정수변환,형변환
 *          |
 *    -----------------------
 *    |
 *   ArrayIndexOutOfBoundsException => 배열범위 초과
 *   ArithmeticException => 0으로 나누는 경우
 *   NumberFormatException => 정수변환
 *   ClassCastException => 형변환
 *   ...
 *   ...
 *   
 *   try {
 *     int a = 10;
 *   }catch (Exception e)
 *   {
 *     int b = 20;
 *   }
 *   
 *   a,b => 사라진다  
 */
public class 예외처리_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int[] arr=new int[2]; // 배열범위 , 0
		try {
			System.out.println("첫번째 정수 입력:");
			String s1=scan.next();
			System.out.println("두번째 정수 입력:");
			String s2=scan.next(); //오류발생
			
			arr[0]=Integer.parseInt(s1); // 정수 변환
			arr[1]=Integer.parseInt(s2);
			
			int result=arr[0]/arr[1];
			System.out.println("result="+result);
		
		}catch (ArrayIndexOutOfBoundsException ex) {
			//System.out.println(ex.getMessage());
			ex.printStackTrace();
			// 에러시 => 에러 위치 확인 
		}catch(ArithmeticException e) {
			//System.out.println(e.getMessage());
			e.printStackTrace();
		}
		catch(RuntimeException e2) {
			//System.out.println(e2.getMessage());
			e2.printStackTrace();
		}
		System.out.println("정상 수행");
		// 정상수행시 catch 는 수행하지 안흔ㄴ다
		// try 안에서 오류 발생시 catch 로 가서 수행
	}

}
