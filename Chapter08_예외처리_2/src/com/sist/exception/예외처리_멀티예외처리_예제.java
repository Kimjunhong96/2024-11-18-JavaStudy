package com.sist.exception;
import java.util.Scanner;
public class 예외처리_멀티예외처리_예제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Scanner scan=new Scanner(System.in);
			System.out.println("첫번째 정수 입력:");
			String num1=scan.next();
			System.out.println("두번째 정수 입력:");
			String num2=scan.next();
			
			// 정수 변환 => 윈도우 , 웹 (문자열 , 네트워크)
			//
			
			int n1=Integer.parseInt(num1);
			int n2=Integer.parseInt(num2);
			
			System.out.println(n1/n2);
			
		}catch(NumberFormatException | ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
//		catch(RuntimeException e) {
//			System.out.println(e.getMessage());
//		}
//		catch(NumberFormatException e) {
//			System.out.println(e.getMessage());
//		}catch(ArithmeticException e) {
//			System.out.println(e.getMessage());
//		}
	}

}
