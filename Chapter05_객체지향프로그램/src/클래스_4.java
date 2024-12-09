//class Recipe
//{
//	int rno;//구분자
//	String title;
//	String chef;
//	String poster;
//}
class RecipeSite
{
	static Recipe[] recipes = new Recipe[40];
	// 사용자 정의 데이터은 일반 데이터형과 사용하는 방법 유사 
	// 시작과 동시에 recipes의 초기화 
	static // 초기화 블록
	{
		try
		{
			int i=0;
				
		}catch(Exception ex) {}
	}
}
public class 클래스_4 {
	
    // 사용자가 볼 수 있는 위치 => main => 브라우저 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RecipeSite rs=new RecipeSite();
		System.out.println("====레시피 목록====");
		for(Recipe r:rs.recipes){
			System.out.println(r.title);
		}

	}

}
