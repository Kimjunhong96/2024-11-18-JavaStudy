/*
 *  일차 for , while 
 *  => break;
 *  조건문 : 단일조건문 / 선택조건문
 *  ------------------------------- 필수 공부**
 */
public class 반복제어문_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 1; i <= 3; i++)
		{
			for(int j =1; j <= 3; j++)
			{
				if(j==2) // j 가 2면 제외
					continue; // while에서 가끔 잘못된 입력이있는 경우
				System.out.println("i="+i+",j="+j);
			}
		}

	}

}
