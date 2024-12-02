/*
 *   버블정렬
 *    => 인접한 데이터끼리 비교
 *    => 선택 정렬 => 앞에서부터 고정
 *    => 버블 정렬 => 뒤에서부터 고정 
 *    
 *   방식
 *    20 30 50 10
 *    -- --
 *    30  20
 */
public class 배열응용_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr =new int [5];
		for (int i = 0; i< arr.length; i++)
		{
			arr[i]=(int)(Math.random()*100)+1;
			
		}
		System.out.println("정렬전:");
		for(int i:arr)
		{
			System.out.println(i+" ");
		}
		System.out.println("\n정렬휴:");
		for(int i = 0; i<arr.length; i++)
		{
		//	for(int i=0; i<arr.length-1-i; i++)
		}

	}

}
