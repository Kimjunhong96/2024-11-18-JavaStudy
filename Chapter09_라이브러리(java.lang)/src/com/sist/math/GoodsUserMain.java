package com.sist.math;

public class GoodsUserMain {
	
	public static void main(String[] args) {
//		GoodsDAO dao=GoodsDAO.newInstance();
//		// newInstance(),getInstance()
//		// Calendar cal=Calendar.getInstance() 
//		int count = dao.goodsTotalPage();
//		int totalpage = (int)(Math.ceil) 
//	}
	 // 객체 생성 
	GoodsDAO dao=GoodsDAO.newInstance();
	// newInstance(),getInstance()
	// Calendar cal=Calendar.getInstacne()
	int count=dao.goodsTotalPage();
	int totalpage=(int)(Math.ceil(count/15.0));
	System.out.println("총페이지:"+totalpage);
}
}
