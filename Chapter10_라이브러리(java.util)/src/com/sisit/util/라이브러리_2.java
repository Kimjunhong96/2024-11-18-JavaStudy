package com.sisit.util;

import java.util.StringTokenizer;

// StringTokenizer
/*
 *    1. 자른 데이터를 읽기 => nextToken()
 *    2. 총 자른 갯수 : counterTokens()
 *    3. 자른 데이터가 있는 동안 : hasMoreTokens()
 *       => 영화 출연진 => ,
 *    4. 일반 데이터형 => 사용빈도가 많다 
 *    5. 네트워크 입출력 
 */
public class 라이브러리_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String data="현빈 ,  박정민 ,  조우진 ,  전여빈 ,  박훈 ,  유재명 ,  릴리 프랭키 ,  이동욱";
		StringTokenizer st=new StringTokenizer(data,","); 
		//new StringTokenizer(data) => " "
		System.out.println("출연 총인원:"+st.countTokens());
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken().trim());
		}
		
		String make="팥을 500g 준비해서 찬물에 부어서 6시간을 불려줍니다.\r\n"
				+ "여기서 물위로 떠오르는것은 과감히 버려주세요.";
		System.out.println("레시피 제작법:"+st.nextToken());
		System.out.println("레시피 이미지:"+st.nextToken());
	}
	/*
	 *    1. 클라이언트 => 서버로 데이터 전송
	 *       100|admin|1234
	 *       switch(protocol){
	 *        case 100: 
	 *            로그인 한다 
	 *       }
	 *       
	 *       200| 
	 */

}
