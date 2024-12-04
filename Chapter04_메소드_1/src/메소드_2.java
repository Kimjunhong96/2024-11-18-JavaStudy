// 사칙연산자 ==> 4개의 메소드
// 회원가입 ~  회원 
public class 메소드_2 {
    // 1) 리턴형 / 매개변수 =>0
	// + 
	static int plus(int a , int b)
	{
		int c=a+b;
		return c;
	}
	// - 
	static int minus(int a , int b)
	{
		int c=a-b;
		return c;
	}
	
	static int gop (int a , int b)
	{
		int c=a*b;
		return c;
	}
	static String div (int a , int b)
	{
		String result="";
		if(b==0)
			result="0으로 나눌수 없습니다";
		else
			result=String.valueOf(a/(double)b);
		          // String  으로 변환
		return result; // 리턴형에 선언된 데이터형과 일치
		
	}
	// 조립 => 다른 클래스에서 사용이 가능
	
	public static void main(String[] args) {
		// TODO Auto-generated method 
		

	}

}
