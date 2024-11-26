import java.util.Scanner;
public class 반복문_문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("점수입력:");	
		int score=scan.nextInt();
		switch(score / 10) {
		case 10 : case 9 :
		
		System.out.println(score+"은A등급입니다");
		break;
		
		case 8 :
				System.out.println(score+"은B등급입니다");
				break;
		case 7 :
			System.out.println(score+"은C등급입니다");
			break;
		case 6 :
			System.out.println(score+"은D등급입니다");
			break;
		default : 
			System.out.println(score+"은F등급입니다");
		
		
		}
				
		
			  

	}

}
