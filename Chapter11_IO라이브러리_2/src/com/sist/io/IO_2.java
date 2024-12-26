package com.sist.io;
import java.io.*;
public class IO_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileInputStream fis=null;
		FileOutputStream fos=null; 
		try {
			fis=new FileInputStream("c:\\javaDev\\movie.txt");
			fos=new FileOutputStream("c:\\java_data\\movie.txt");
			//                        => 파일이 없는 경우에 자동으로 생성 
			/*
			 *    mode
			 *     r => read
			 *     w => write => create 
			 *     a => append 
			 */
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		finally {
			
		}
	}

}
