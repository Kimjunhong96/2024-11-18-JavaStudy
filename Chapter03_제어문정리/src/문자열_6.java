/*
 *   문자 자르기
 *   ***** X 1000000
 *   
 *   substring : 문자열을 자르기 
 *   | 지정된 위치부터 마지막까지 자르기
 *     Hello Java 
 *     0123456789
 *     substring(6) =>6~9  Java
 *   | 중간에서 자르기
 *     substring(1,4) => ell
 *                 -- endIndex-1
 *       
 *      trim() 
 *   ----------------------------- JavaScript 동일 
 *   
 */
public class 문자열_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String data = "Hello.Hello.java";
//		//             0123456789~
//		System.out.println(data.substring(data.lastIndexOf(".")+1));
		
		
		String data = "ID:admin,PWD:1234";
		String id=data.substring(data.indexOf(":")+1, data.indexOf(",")); // ,는 제외
		System.out.println(id);
		
		String pwd=data.substring(data.lastIndexOf(":")+1);
		System.out.println(pwd);
		System.out.println("data="+data);
		
		String address = "서울 강남구 역삼동 642-1 [새주소] 서울 강남구 테헤란로25길 20 (역삼동)";
		String addr1= address.substring(0,address.indexOf("["));
		System.out.println(addr1);
		String addr2= address.substring(address.indexOf("]")+1);
		System.out.println(addr2.trim());
		System.out.println(address);
		
		String s = "Hello Java";
		s=s.substring(s.indexOf(" ")+1);
		System.out.println(s);
		// trim() => 좌우의 공백을 제거
		

	}

}
