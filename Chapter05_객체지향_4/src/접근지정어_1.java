// 127page 
/*
 *   1. 주의점 
 *      1) static 메소드에서는 인스턴스변수,인스턴스메소드를
 *         사용할 수 없다
 *         => 사용시에는 객체 생성후에 사용이 가능 
 *      2) static 메소드 , static 변수는 this 를 사용할 수 없다
 *      3) static 블록은 static 변수만 초기화가 가능 
 *      4) 인스턴스 메소드에서는 인스턴스변수 , static을 사용할 수 있다 
 *      5) 초기화 => 생성자를 이용하는 이유 
 *                 ---- this, 인스턴스 , static 
 *   2. 접근 지정어 => 객체 사용 범위 지정 
 *   
 *     => 맴버변수 : 다른 클래스에서 사용 가능  
 *        [접근지정어] 데이터형 변수명 
 *        ---------
 *        [접근지정어] [제어어] 리턴형 메소드명 (매개변수)
 *        ---------
 *     => 지역변수에는 접근 지정어를 사용할 수 없다
 *        ------ 메소드안에서 사용
 *        => final 만 사용이 가능 => 상수/변수  
 *    클래스 , 맴버변수 , 메소드 => 접근 제어
 *  ---------------------------------------------------------------------------------
 *   접근지정어    적용 대상           접근 가능 대상                접근 불가 대상
 *  ---------------------------------------------------------------------------------
 *  public     클래스,필드(맴버변수)     모든 대상                      X
 *             생성자 , 메소드 
 *  ---------------------------------------------------------------------------------
 *  protected   맴버변수 , 생성자      같은 폴더(패키지)          다른 폴더에서 사용이 불가능
 *                 메소드          또는 상속받은 클래스
 *                               => 다른 폴더에 있는 경우
 *  ----------------------------------------------------------------------------------
 *  default      클래스 , 맴버변수     같은 폴더에서만 접근 가능     다른 폴더에서 사용이 불가능
 *                생성자 , 메소드 
 *  ----------------------------------------------------------------------------------
 *  private    맴버변수 , 생성자     자신의 클래스 내부             클래스 외부에서 사용금지
 *              메소드 
 *  ----------------------------------------------------------------------------------
 *  => 크기
 *     private < default < protected < public
 *     ---------------------------------------
 *     | 오버라이딩 => 접근지정어 처리 
 *        => 접근 지정어는 확장은 가능 => 축소는 안된다
 *    *** 많이 사용
 *        맴버변수 => 은닉화 private
 *        생성자 , 클래스 , 메소드 => 모든 클래스 연결 : public
 *        ------------------- 다른 클래스에서 사용
 *                            ---------
 *                            다른 폴더에 존재할 수 있다 
 *   제어어 
 *    => static | abstract | final
 *    static => 공통적인 => 공통으로 사용되는 메소드 / 변수 있을때
 *    final => 마지막 => 변수(상수) , 메소드 (중단) , 클래스(종단)
 *                               -----------------------
 *                               | 있는 그대로 사용
 *                               | String , Math , Scanner , System
 *                               
 *    abstract : 추상적인 => 공통기능 => 선언 
 *              => 추상클래스 , 인터페이스 => 구현(x)
 *                 ------------------ 미완성 클래스 
 *                 ----- 서로 다른 클래스를 연결해서 사용
 *                 ----- 클래스 여러개 제어 
 *    -------- 클래스 , 메소드에서만 사용이 가능
 *    기능 설계 
 *    -------
 *    데이터베이스 : 데이터를 저장하는 장소
 *         = 메모리 : 변수,배열 , 클래스 => 휘발성
 *         = 파일 : 여러개를 동시에 처리 (X)
 *         = 오라클 : 여러개의 데이터를 연결해서 사용
 *    게시판 =======> CRUD 
 *                  Insert Select Update Delete
 *                  Create Read Update Delete => SQL
 *                  ------ ----
 *                   생성   목록
 *    ---- 글쓰기 , 목록 , 상세보기 , 수정 , 삭제 , 검색 
 *    
 *     클래스 : public / default => public : 모든 클래스 사용
 *     메소드 : public / default / private / protected
 *            => 메소드의 역할
 *            => 다른 클래스 통신 (메세지) => public 
 *     생성자 : public 
 *     맴버변수 : => private (데이터 보호) => 은닉화 
 *              가정 => 메모리에서 보이지 않는다 
 *              => 어떻게 통신
 *              => 변수 : 쓰기 (메모리 저장) , 읽기 ( 메모리에서 데이터 가지고 오기)
 *                      => 메소드로 처리 : getter/setter
 *     지역변수 : 접근지정어가 필요없다 ( 메소드안에서만 사용이 가능) 
 *              => 상수 (final) 
 *     *** 객체지향의 3대특성 (권장)
 *         1. 캡슐화 : 외부로부터 데이터 보호
 *                     데이터 손상 (id,pwd...)
 *                 => 데이터 손상을 방지
 *                    데이터를 감춘다
 *                    => 필요한 경우에 메소드 기능을 이용해서 
 *                       사용이 가능하게 만든다 
 *         2. 상속 : 재사용 
 *         3. 다형성 : 기능 추가 , 기능 변경 
 *                   오버로딩     오버라이딩 
 *         4. 추상화 : 중복 제거 (공통적인 내용 모아서 관리)
 *                   => 공통모듈
 */
class Member{
	private String id; // Member 클래스 안에서만  red
	protected String pwd; // 같은 폴더   yellow
	int age; // 같은폴더   blue
	public String name; // 모든 클래스  green 
}
public class 접근지정어_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Member m =new Member();
        
	}

}
