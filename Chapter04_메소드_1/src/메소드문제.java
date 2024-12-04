import java.text.ChoiceFormat;

public class 메소드문제 {
	// 매개변수 (x) , 리턴형 (x)
	static void num()
	{
		for(int i=1; i<=10; i++)
		{
			System.out.print(i+" ");
		}
		System.out.println();
	}
	
	
	static int plus()
	{
		int sum = 0;
		for(int i =1; i<=10; i++)
		{
			sum+=i;
			System.out.println(sum);
		}
		return sum;
	}
	static int print3(int n)
	{
		int sum = 0;
		for(int i =1; i<=n; i++)
		{
			sum+=i;
			
		}
		return sum;
	}
	
	
	static String print4(int a, int b)
	{
		if(b==0)
			return "0으로 나눌수 없다"; // B가 0이면 종료
		return String.valueOf(a/(double)b);
		// 메소드 종료 => 메소드안에서 return은 여러개 사용이 가능 
		//return a/(double)b;
	}
	
	static void change(String s)
	{
		// 자체에서 처리 => 영역에서 출력
		s=s.toUpperCase();
		System.out.println(s);
	}
	static String change2(String s)
	{
		return s.toUpperCase();
	}
	
	static void reverse(String s)
	{
		System.out.println(new StringBuilder(s).reverse());
	}
	
	static String change3(String s)
	{
		if(s.length()%2!=0)
			return "문자열 갯수가 짝수가 아닙니다";
		
		String res=""; // 둘중에 한개만 전송
		boolean bCheck=true;
		for(int i=0; i<s.length()/2; i++)
		{
			char start = s.charAt(i);
			char end = s.charAt(s.length()-1-i);
			if(start!=end)
			{
				bCheck=false;
				break;
			}
		}
		if(bCheck==true)
			res="좌우 대칭 입니다";
		else
			res="좌우 대칭이 아닙니다";
		return res;
	}
	
	static void score(int kor)
	{
		char c='A';
		switch(kor/10)
		{
		case 10,9:
			c='A';
			break;
		case 8:
			c='B';
			break;
		case 7:
			c='C';
			break;
		case 6:
			c='D';
			break;
		default:
			c='F';
		}
		System.out.println("학점:"+c);
	}
	
	static void score2(int kor)
	{
		double[]limit= {50,60,70,80,90};
		String[] grade= {"F","D","C","B","A"};
		ChoiceFormat cf= new ChoiceFormat(limit, grade);
		System.out.println(cf.format(kor));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		num();
		plus();
		print3(100);
		
		String d =print4(10,2);
		System.out.println(d);
		
		change("abcdzEKAN");
		reverse("abcdefz");
		String ss=change3("ABBA");
		System.out.println(ss);
		
		score(80);
		score2(77);
		
		
	}

}
