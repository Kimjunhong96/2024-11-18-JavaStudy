package com.sisit.util;
import java.util.*;
public class 라이브러리_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar today = Calendar.getInstance();
		
				System.out.println("년도:"+today.get(Calendar.YEAR));
				System.out.println("월:"+today.get(Calendar.MONTH)+1);
				// MONTH => 0 => 저장 : -1 , 읽기:+1
				System.out.println("일:"+today.get(Calendar.DATE))
				// week => 1
				String[] strWeek= {"","일","월","화","수","목","금","토"};
	}

}
