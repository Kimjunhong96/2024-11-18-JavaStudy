
/* 
 *    프로그램
 *    요구사항분석
 *    (벤치마킹)
 *       |
 *      기능 설정
 *     피룡한 데이터를 추출
 *     ================ ==============      ===================. 구현 =/
 *       |                   |
 *     클래스 설계           메모리 메모리할당
 *     => 메소드            => new
 *     => 변수 
 *         |
 *       유스케이스 다이어그램  정규화 (1~3)   
 *       
 *     객체 : 
 *     
 *     new => 사용시마다 클래스 크기많큼 메모리를 생성한다
 *     ----------------------------------------
 *     1. 클래스는 한개만 설계
 *     2. new  여러개를 저장해서 사용
 *     3. 사용자 정의 클래스 => 일반 변수와 동일 
 *        ---------------- 사용자 정의 데이터형 : 배열 ,읽기 , 쓰기 , 변경
 */

import java.text.DecimalFormat;
class Recipe
{
		String poster;
		String title;
		String chef;
		String chef_poster;
		int star;
		int hit;
}
public class 클래스_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. recipe 저장
		// 2. 데이터를 저장할 메모리 공간 (메모리 할당)
		Recipe recipe1=new Recipe(); // 24byte 메모리 생성
		// => 기본형, 클래스형 => 4byte
		// => 데이터 초기화
		recipe1.poster= "https://recipe1.ezmember.co.kr/cache/recipe/2019/07/02/e619096726a2452b3887e7638ed17ac51_m.jpg";
		recipe1.title = "치킨너겟 교촌 허니콤보 만들기";
		recipe1.chef= "태형제맘";
		recipe1.chef_poster= "https://recipe1.ezmember.co.kr/cache/rpf/2023/03/04/4db307c661cc92cf77a30bf530d2a0a81.f4d975082303ba44f752108dd76d5a6c";
		recipe1.hit = 1845;
		recipe1.star=5;
		// 변수값 지정
		// 저장된 데이터 출력 => 메모리 구조가 2중


System.out.println("레시피 포스터:"+recipe1.poster);
		System.out.println("레시피 제목:"+recipe1.title);
		System.out.println("쉐프명:"+recipe1.chef);
		System.out.println("쉐프 포스터:"+recipe1.chef_poster);
		DecimalFormat df = new DecimalFormat("###,###");
		System.out.println(df.format(recipe1.hit));
		for(int i=1; i<=recipe1.star; i++)
		{
			System.out.println("★");
		}
		

	}

}
