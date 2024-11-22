/*
 *   1장 : 자바 특징 / 자바 설치 / 주의점
 *                 jdk.java.net/17
 *                 classpath: .;c:\jdk-17.0.2\lib
 *                 path : c:\jdk-17.0.2\bin
 *                 
 *                 => 대소문자 구분
 *                 => {} 들여쓰기
 *                 => 주석 : 프로그램 분석이 쉽도록
 *                 => ctrl+shift+/
 *                    ctrl+shift+\
 *                    
 *                    ctrl+/ 한줄 주석
 *                    ctrl+\ 해체
 *        ======= 호환성 , 메모리 자동 회수 (가비지컬렉션) , 멀티쓰레드
 *   2장 : 변수 / 연산자
 *        ===
 *        1) 한개의 데이터를 저장하는 메모리 공간의 별칭
 *                              ==== 주소
 *          => 역할 : 쓰기(메모리 저장=대입) , 읽기 , 수정
 *             int a=10                  a     a=100
 *             변경이 가능한 값 / 변경이 안되는 값 (상수)
 *             변수)
 *                 데이터형 변수명;
 *             상수)
 *                 final 데이터형 변수명=10; 
 *                 => 배열의 갯수 => 상수
 *                 => 상수 : 데이터형의 최대값,최소값
 *         
 *         2) 메모리 크기 결정
 *            => 기본형 / 참조형
 *               ====   =====| 사용자의 정의 => class
 *               |자바에서 지원
 *               정수형
 *                 byte : 1byte , 네트워크 전송 , 파일읽기
 *                        -127~128
 *                        ** 8bit - 1byte
 *                           ----- 0,1을 채우는 공간
 *               문자형
 *                  char : 2byte => 0~65535 => 멀티바이트(unicode)
 *                         => 표기법 '' => 한글자 설정
 *                                 --
 *                  => 한글자만 저장이 가능 => 불편 => 여러개 동시에 저장
 *                                               --------------
 *                                               |String : 문자열 ""
 *               실수형 
 *                 double : 8byte => 소수점 15자리
 *                 
 *               논리형
 *                 boolean : 1byte => true/false
 *                 
 *            byte < char < int < long < double
 *            ------------------------------------ 암기 
 *         => 식별자
 *            1. 알파벳,한글로 시작
 *              => 알파벳 => 대소문자 구분
 *              => 한글 (자바) , 웹에서는 알파벳
 *            2. 변수의 길이 => 제한은 없다 (3~10)
 *            3. 숫자는 사용이 가능 (단 앞에 사용이 불가능)
 *            4. 특수문자 ( _ , $ )
 *               _ : 임시변수 , 임시 클래스 , 단어 여러개인 경우 구분자로 사용
 *            5. 공백을 사용할 수 없다
 *            6. 키워드는 사용이 금지
 *            7. 약속 사항
 *               변수,메소드 => 소문자 시작
 *               클래스 , 인터페이스 => 대문자 시작
 *               상수 : 대문자 사용
 *            => 변수 / 상수 / 메소드 / 클랫 / 인터페이스 / 추상클래스
 *               ==========================================
 *            => 변수 선언
 *               데이터형 변수명;
 *               (정수,문자,실수,논리)
 *               
 *            => 변수의 초기화
 *               1. 정수형
 *                  byte b=10; => 127
 *                         ---  일반숫자
 *                  int i=10; => 21억 4천
 *                  char c='A' ==> 한글도 가능
 *                         ''=> null (값이 없는 상태)
 *                  long 1=10L
 *                  
 *              2. 실수형
 *                 double d=10.9D => D생략이 가능
 *                          -----
 *              3. 논리형
 *                 boolean   true/false 가능
 *                 
 *                 
 *              => 연산자
 *                 단항연산자
 *                  ++ , __ (증감연산자) 1증가 , 1감소
 *                  ----------상세보기 , 찜하기 , 좋아요
 *                  int a=10;
 *                  a++; => 후치연산자
 *                   --- 다른 연산을 먼저 수행 => 증가
 *                  ++a; => 전치연산자
 *                  -- 먼저 증가하고 나중에 다른연산 수행
 *                  
 *                  int a=10;
 *                  int b=a++;
 *                    1)다른 연산 수행
 *                       b=a => b=10
 *                    2)a값 1증가
 *                       a=a+1 => a=11
 *                       
 *                    int a=10;
 *                    int b=++a;
 *                      1) a값을 증가
 *                         a=a+1 ==> a=11
 *                      2) b에 대입
 *                         b=a ==> b=11
 *                         
 *                   ! (부정연산자) => boolean만 사용
 *                      boolean b=false;
 *                      !b => true
 *                      => 조건문에서 사용 if,for,while (제어문에서 주로 사용)
 *                      
 *                   형변환 연산자
 *                     => 데이터 크기 확인
 *                     
 *                        byte < char < int < long < double
 *                        
 *                      long 1=10
 *                           == int ==> 자동으로 10L
 *                      int a='A'
 *                          === char ==> 자동으로 int 65
 *                      int a=10.5 => (int)10.5
 *                            ----
 *                  이항연산자 : 가장 많이 사용되는 연산자
 *                    1. 산술연산자 ( + , - , * , / , % )
 *                       + : 문자열 결합 , 더하기
 *                           "6"+7 => "67"
 *                           7+"6" => 76
 *                           
 *                  삼항연산자
 *                    => if ~ else => true/false를 나눠서 처리
 *                    ? : 
 *                    
 *                    => (조건)?값1:값2
 *                       true => 값1
 *                       false => 값2
 *                       => 복잡한 소스가 있는 경우에 간결하게 만든다
 *                          웹 (HTML+Java)
 *                             ==========
 *              => 사용자 요청 맞게 출력 , 데이터 전송 => 제어문
 *                  
 *   3장 : 제어문
 *   4장 : 배열
 *   5장 : 객체지향 프로그램
 *   6장 : 상속
 *   7장 : 추상클래스 / 인터페이스
 *   8장 : 예외처리 
 *   9장 ~ 라이브러리
 *        ***java.util / java.lang / ***java.io / java.net / ***java.sql
 */
import java.util.*;
public class 정리_1주차 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 모든 데이터형에 대한 정보를 가지고 있는 클래스 => Wrapper
        //System.out.println(Integer.MAX_VALUE);
		int[] arr= {30,40,20,50,10};
		Arrays.sort(arr); // => 정의 
		
		System.out.println(Arrays.toString(arr));
		// 소시지 채소 볶음
		char a1
	}

}
