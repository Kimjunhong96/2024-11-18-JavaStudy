/*
 *  break; ==> 사용하는 위치 반복문, 선택문에서만 사용이 가능
 *             조건문에서는 사용이 불가능
 *  continue : 반복문에서만 사용이가능
 *             조건문 / 선택문에서는 사용이 불가능
 *             => 특정부분을 제외할때 사용
 *             => for 문에서는 증가식으로 이동
 *             => while 문에서는 조건식으로 이동
 *    *** break , continue 가 있는 경우에 다음에는 소스 코딩할 수 없다
 *             
 */
public class 반복제어문_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 1; i <= 10; i++)
		{
			if(i==5 || i == 7)
				//break;
				continue; // i++ 로 이동 => 6부터 출력한다
			System.out.print(i+" ");
		}

	}

}
