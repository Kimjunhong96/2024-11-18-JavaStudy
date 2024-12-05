// 메소드형 숫자야구 게임
public class 메소드응용_변경 {
    // 중복없는 난수 (3개의 정수)
	static int[] rand()
	{
		int[] com = new int [3];
		for(int i=0; i<com.length; i++)
		{
			com[i]=(int)(Math.random()*9)+1;
			// double random()
			for(int j=0; j<i; j++)
			{
				// 중복되어있는지 검사
				if(com[i]==com[j])
				{
					i--; // 같은 정수가 있다면 다시 난수 발생
					break;
				}
			}
			
		}
		return com;
		
	}
	// 사용자 입력 => 유효성 검사
	// 힌트 제공
	// 종료 여부
	// 전체 조립 => 새로운 게임여부 확인 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
