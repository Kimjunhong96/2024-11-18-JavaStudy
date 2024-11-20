/*
 *   자바에서 지원하는 연산자
 *   => 연산자 , 피연산자
 *      10 + 20
 *      --   --
 *       ㅣ   ㅣ
 *       -------- 피연산자
 *    1. 피연산자 1개인 경우 : 단항연산자
 *    2. 피연산자 2개인 경우 : 이항연산자
 *    3. 피연산자 3개인 경우 : 삼항연산자
 *    
 *    => 데이터 저장 ==> 연산처리 / 제어처리 ==> 처리 결과 출력
 *                    ---------------
 *                    ㅣ 소스코딩이 많다 (알고리즘)
 *                    ㅣ 재사용 => 관련된 소스를 묶어서 관리
 *                              ===================
 *                              ㅣ 메소드
 *    => 변수 / 연산자 / 제어문
 *    변수 : 한개를 저장해서 가공후에 출력
 *    --- 데이터형을 어떻게 선택
 *        점수 => 국어,영어,수학 ...  int
 *        평균 => double 
 *        학점 => String
 *     변수에서 가장 많이 사용되는 데이터형
 *     정수 : int / long 
 *           byte b1=10;
 *           byte b2=127;
 *           int b3=(b1+b2);
 *     실수 : double
 *     문자 : char
 *     논리 : boolean 
 *     문자열 : String 
 *     =============== 웹 / 윈도우 ==> 문자열 
 *                           ㅣ
 *                         JTextField
 *                         <input type="text"> => int
 *     연산처리 ==> 38page
 *     
 *     1. 단항연산자
 *        증감연산자 (++,--) : 1증가 , 1감소
 *          => 반복문에서 주로 사용
 *          => 총알 , 아바타 이동 (게임)
 *          => 전치연산자 / 후치연산자
 *             ================== 1 증가 , 1 감소
 *          int a=10;
 *          a++;
 *          
 *          int a=10;
 *          ++a;
 */
public class 연산자_단항연산자1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //int a=10;
        //System.out.println(a++);
        //System.out.println(a);
		/*int a=10;
		System.out.println(++a);//증가후에 출력
		System.out.println(a);*/
		//for(int i=1;i<=10;i++);
		int a=10;
		a++;
		a++;
		a++;
		--a;
		--a;
		System.out.println(a);//5변증가
		
			
	}

}
