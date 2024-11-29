// 가급적 => 같은 기능의 변수가 3개 이상이면 => 배열 
//         다른 기능의 변수가 3개 이상이면 => 클래스
/*
 *   int kor1,kor2,kor3;   int[3] kor
 *   int eng1,eng2,eng3;
 *   
 *   변수 여러개 ==> 일차원 배열
 *                =========> 이차원
 *                           ====
 *                              삼차원
 *   =================================
 *   1. 배열 생성
 *      배열
 *      
 *      인덱스
 *      배열 선언
 *      배열 초기화
 *      => 종류 
 *      1.정수 : int[] 배열형
 *      2.char : char[] 배열형
 *      3.실수 : double[] 배열형
 *      4.논리 : boolean[] 배열형
 *      5.문자열 : String[] 배열형
 *      
 *      =>생성 => 86 page
 *      new 데이터형[배열크기] 
 *                ======= 고정적 메모리
 *      new int[5]
 *      
 *      데이터형 [] 배열명
 *      --------  ----
 *      | => 배열에 저장되는 데이터의 종류
 *           정수 : 정수형  이름 : String , 평균 : double
 *           학점 : char 통계 : long , 예약여부 : boolean
 *      [] = > 배열 기호
 *      [0] => 
 *      --- 배열 인덱스 => 저장 위치
 *          배열 점자
 *       배열명 : 실제 저장되어있는 주소를 참조 => 창조 변수
 *       
 *     => 가장 많이 사용되는 배열 생성
 *        => 데이터형[] 배열명 = new 데이터형[배열갯수지정]
 *                                    -----------
 *                            => 데이터 접근 : 배열명.length-1
 *                            => 배열의 인덱스를 벗어나면
 *                               ArrayIndexOutOfBoundsException
 */
public class 배열_생성_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[5];
		//           ------ 배열 (int => 5개를 모아서 관리)
		System.out.println(arr[4]);
		for(int i = 0; i<arr.length; i++)
		{
			arr[i]=(int)(Math.random()*100)+1;
			// i = 0 ~ i=4
		}
		//실제값을 확인
		for (int i = 0; i < arr.length; i++)
		{
			System.out.println("arr["+i+"]="+arr[i]);
		}
		System.out.println("====배열값 출력====");
		/*
		 *   => 출력용으로 사용 => for-each : 향상된 for 문
		 *   for(데이터형 변수 : 배열명(컬렉션)) => 92page 
		 *                    ---------배열 / 컬렉션만 사용이 가능
		 *   {   -----        ---- 배열에 선언된 데이터형과 동일
		 *        | 인덱스를 이용하지 않는다 => 실제 저장된 값을 순차적으로 가지고 온다
		 *        | 마지막 값을 읽어오면 자동 종료
		 *        | WEB의 Front의 핵심
		 *        | => 배열의 값을 변경이 불가능 , 추가 불가능
		 *             ----------- 인덱스 번호
		 *   }
		 *   
		 *   ing[] arr = {1,2,3,4,5}
		 *     arr(Stack)         Heap
		 *                       arr[0] arr[1] arr[2] arr[3] arr[4]
		 *     -----              ---------------
		 *     0x100               1  2  3  4  5
		 *     -----              --------------
		 */

	}

}
