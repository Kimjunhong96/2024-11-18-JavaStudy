// A C E G .....
public class 반복문_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//for(char c+'A';c<='Z';c+=2)
		for(int i=1;i<=10;i++)
		{
			if(i%2==1)
				System.out.print(i+" ");
		}
		System.out.println();
		for(int i=1;i<=10;i+=2) // 여러개 동시에 증가 => 총알 발사
			System.out.print(i+" ");
		
		System.out.println();
		
		for(int i = 5; i <= 100; i += 5)
			
				System.out.print(i+" ");
		
		System.out.println();
		// 1~100=> 5의 배수를 다 출력하시오
		for (int i = 0; i < args.length; i++) {
			
		}

	}

}
