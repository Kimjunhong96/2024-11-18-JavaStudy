package com.sist.exception;

import java.util.Scanner;

// 사용자 정의 예외처리 => 호출 => throw: 예외를 찾아라 
// => 1. 기존에 만들어져 있는 예외처리 , 사용자 정의는 찾지 못한다 
/*
 *   1.데이터형 => 클래스 => new 
 *     int / double / long => 메모리 크기 확인 
 *     class A {
 *       int a,b;
 *       double d;
 *     }
 *     => new => int malloc (sizeof()) 
 *   2. 사용자 정의 => 호출
 *   
 *   => 283page
 *   	=> 사용자 정의 예외처리 : 기존의 예외처리클래스 상속 
 *   	   Exception / Throwable 
 *   	=> class MyException extends Exception {
 *   		}
 *   	=> try ~ catch => 에러 처리 => 정상 수행
 *   		=> 일반 소스 코딩
 *   	=> throws : 선언 => 어떤 에러가 발생하는지 알려주는 경우
 *   		=> 라이브러리에서 주로 나온다
 *   	=> throw : 직접 에외발생
 *   		=> 사용자 정의 예외처리 => 실무 
 *   		=> if~else
 *        ---------------------------------------
 *        
 *        에러 처리 => if 우선시 
 *                
 */
class MyException extends Exception {
	public MyException(String msg) {
		super(msg);
	}
}
public class 예외처리_사용자정의 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Scanner scan=new Scanner(System.in);
			System.out.println("점수 입력:");
			int score=scan.nextInt();
			if(score<0 || score>100) {
				throw new MyException("잘못된 입력입니다");
				// catch 호출
			}
		}catch(MyException e) {
			System.out.println(e.getMessage());
		}
	}

}
