import java.util.Calendar;
import java.util.Scanner;
public class 메소드_3 {
	// 사용빈도가 많을수 있다 => 예약 / 개인 일정....
	// => 재사용 
    static boolean isYear(int year)
    {
    	/*
    	 *   4년마다
    	 *   100년마다 제ㅗ이
    	 *   400년 마다
    	 *   
    	 *   윤년 => 공식적으로 사용
    	 */
    	boolean bCheck=false;
    	if((year%4==0 && year%100!=0) || (year%400==0))
              bCheck=true;
    	return bCheck;
    }
    static void maxPrint(int a , int b)
    {
    	System.out.println("큰값:"+Math.max(a, b));
    	//System.out.println(a>b?a:b); // 삼항연산자 
    	/*
    	 *  if(a>b) 
    	 *    System.out.println(a)
    	 *  else
    	 *    System.out.println(b)
    	 */
    }
    static void print(int a)
    {
    	if(a%2==0)
    		System.out.println(a+"는(은) 짝수입니다");
    	else
    		System.out.println(a+"는(은) 홀수입니다");
    }
    
    static char weekData(int year,int month, int day)
    {
//    	char c=' ';
    	char[] strWeek= {' ','일','월','화','수','목','금','토'};
//    	// 1. 1년도 1월 1일 ~~ 전년도 까지의 총 날수
//    	int total = (year-1)*365
//    			+(year-1)/4
//    			-(year-1)/100
//    			+(year-1)/400;
//    	// 2. 전달까지의 총 날수
//    	int [] lastday= {31,28,31,30,31,30,31,31,30,31,30,31};
//    	if(isYear(year))
//    	{
//    		lastday[1]=29;
//    	}
//    	else
//    	{
//    		lastday[1]=28;
//    				
//    	}
//    	for(int i=0; i<month-1; i++)
//    	{
//    		total+=lastday[i];
//    	}
//    	// 3. 입력된 일
//    	total+=day;
//    	// -------------------------------- 총합 % 7 
//    	int week = total%7; // 0~6
    	Calendar cal=Calendar.getInstance();
    	cal.set(Calendar.YEAR, year);
    	cal.set(Calendar.MONTH, month-1); // month = 0
    	cal.set(Calendar.DATE, day);
    	int week=cal.get(Calendar.DAY_OF_WEEK);
    	// week => 1~7
    	// substring(1,5) => 1,2,3,4
    	return strWeek[week];
    	
    	
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
//		System.out.print("년도 입력:");
//		int year=scan.nextInt();
//		
//		boolean bCheck=isYear(year);
//		if(bCheck==true)
//			System.out.println(year+"년도는 윤년입니다");
//		else
//			System.out.println(year+"년도는 윤년이 아닙니다");
		//System.out.print("정수 입력(10 20):");
		//int a = scan.nextInt();
		//int b = scan.nextInt();
		//print(a);
		//maxPrint(a,b);
		System.out.print("년 월 일 을 입력 (2024 11 20):");
		int year=scan.nextInt();
		int month=scan.nextInt();
		int day=scan.nextInt();
		
		char c=weekData(year,month,day);
		System.out.println("===결과===");
		System.out.println(year+"년도"+month+"월"+day+"일"+c+"요일입니다");

	}

}
