package com.sist.main;
/*
 *   DAO => 오라클 , Manager => 파일
 *   ----------------------------
 *   => 예외처리 
 *   => 사용자 정의 데이터형 => VO => 캡슐화
 *   => 멤버변수 / 상수 / static
 *   => 메소드 
 *      ---- 리턴형 / 매개변수 
 *           ----   ------ 사용자가 보내준 값 
 *           결과값 => 
 *                   1. 목록 ===> List
 *                   2. 상세보기 => VO
 *                   3. 총페이지 => int 
 *                   -----------------
 *    컬렉션 
 *    ---- IO => 2차 (문법 => 형식) => DAO (웹) 
 *                                  ------- JSP/Spring 
 *    public void insert() 
 *    {
 *       try {
 *       	getConnection()
 *          conn.setAutoCommit(false)
 *          SQL
 *          SQL
 *          conn.commit()
 *       }catch(Exception ex) {
 *       }
 *       finally{
 *       }
 *    }
 *    
 *    컬렉션 (Collection)
 *      => 배열 (고정적) => 데이터추가 => 새로운 배열
 *         => 동적 배열 => 저장 갯수 확인 
 *         ------------------------ 가변 
 *      => 많은 데이터 저장 할 수 있다 
 *      => 표준화 => 개발자 모두가 같은 코딩을 한다 
 *      => 단점 : 모든 데이터를 저장할 수 있다 
 *               -------- 데이터형이 틀린 경우도 있다 
 *               => 형변환 / 제어문이 어렵다 
 *               => 같은 데이터만 첨부 => 배열
 *                  --------------
 *                  명시적 => 어떤 데이터가 들어가는 알려준다
 *                  ==> 제네릭
 *                  List<String> : 가독성이 좋다
 *                  ==> 저장되는 모든 데이터가 통일
 *                Collection(CRUD) => 자료구조
 *                    |
 *            --------------------------
 *            |            |            |
 *          List          Set          Map
 *          =ArrayList   =HashSet     =HashMap
 *         | 단순한 목록    | 장바구니      | 관리 (클래스관리, 회원관리)
 *                          중복이 없는 데이터
 *         
 *         List
 *           ***add() : 추가 
 *           remove() : 삭제
 *           set() : 수정
 *           ***get() : 데이터 가지고 오기 
 *           isEmpty() : 값이 있는지 여부 
 *           ***clear() : 전체 삭제 
 *           ***size() : 저장 갯수 
 *           
 *         Set
 *           **add() : 추가
 *           remove() : 삭제
 *           **isEmpty()
 *           **clear()
 *           **size()
 *           
 *         Map
 *           put("key","value") : 추가
 *           get(key) : 값읽기
 *           isEmpty()
 *           clear()
 *           size()
 *           keySet() : 저장된 키 전체
 *           values() : 저장된 값 
 *       ---------------------------------
 *       복사 => addAll() : Set / List 
 *       교집함 => retainAll() 
 *       차집합 => removeAll()
 *       ---------------------------------
 *       
 *       java.lang 
 *         Object / String / StringBuffer
 *         Wrapper / System / Math 
 *       java.util 
 *          Date / Calendar / StringTokenizer
 *          ArrayList / HashSet / HashMap
 *       java.text
 *         SimpleDateFormat
 *         DecimalFormat
 *       ------------------
 *       ***java.io : 파일입출력 => 다운로드 / 업로드 
 *       ***java.sql : 데이터베이스 입출력
 *       java.net : 네트워크 입출력 
 *                  => 웹 (네트워크) => 한글 변환 
 */
import java.util.*;
public class 컬렉션정리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list = new ArrayList();
		list.add("aaa1"); //0
		list.add("aaa2"); //0
		list.add("aaa3"); //0
		list.add("aaa4"); //0
		list.add("aaa5"); //0
		list.add(10); //0
		
		
		
	}

}
