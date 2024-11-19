// 데이터 저장 ==> 데이터 가공
//              사용자 요청에 따라 변경 => 연산처리
/*
 *   연산자 => 연산자
 *   피연산자 => 대상
 *   ------ 1: 단한연산자
 *             => 증감연산자 (++ , --)
 *             a++  a--
 *             => 부정연산자 (!)
 *             => 형변환 연산자 ((데이터형))
 *                (int)20.5
 *             => 부호연산자 ( + , - ) -10 10
 *             => 반전연산자 (~) 양수=>음수
 *          2: 이항연산자
 *             => 산술연산자 (+,-,*,/,%) 5%2 ==> 1
 *             => 비교연산자 (==,!=,<,>,<=,>=)
 *                               ========= 왼쪽기준
 *             => 논리연산자 ( && : 직렬연산자, ㅣㅣ : 병렬연산자)
 *             => 대입연산자 (=)
 *             => 복합대입연산자 (+=,-=,*=,/=,%=.....)
 *          3: 삼항연산자
 *              (조건)?값1:값2
 *              -----
 *               true => 값1
 *               false => 값2
 *               
 *               sex==1ㅣㅣsex==3?"남자":"여자" => 소스간결
 *                           => 웹 / 게임
 */
// 41페이지
// 증감 연산자 => +1 , -1 a++ a--
/*
 *   int a=10;
 *   a++;   11 //후치연산자
 *   
 *   a--;  9
 *   ++a;  11  //전치연산자
 *   --a;  9
 *   
 *   int a=10;
 *   int b=a ++; => 다른연산수행 나중에 증가
 *       --- ---
 *        1   2 
 *        
 *        
 *   int a=10;
 *   int b=++a;
 *       --- ---
 *        2   1
 *     a=11
 *     b=11
 *    
 *     int a=10;
 *     int b=a++ + a++ + a++ => 33
 *           ---  ----   ---
 *           10    11     12   
 *     
 *     int a=10;
 *     int b=a++ + ++a + a++ => 34
 *           ---  ----   ---
 *           10    12     12   
 *  
 */
public class 변수_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //char a='A';
        //System.out.println(++a);
	}

}
