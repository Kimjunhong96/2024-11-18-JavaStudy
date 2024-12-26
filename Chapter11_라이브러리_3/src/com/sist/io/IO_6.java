package com.sist.io;

import java.io.FileInputStream;
import java.io.*;

// => FileInputStream ==> Reader 형식으로 변경
// 
public class IO_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileInputStream fis=new FileInputStream("c:\\javaDev\\seoul_nature.txt");
			BufferedReader br=new BufferedReader(new InputStreamReader(fis));
			// 웹을 읽는 경우
			// 1byte => 2byte 변환 => InputStream
//			int i = 0;
//			while((i=br.read())!=-1) {
//				System.out.println((char)i);
//			}
			while(true) {
				String msg=br.readLine();
				// 
				if(msg==null);
				System.out.println(msg);
			}
//			fis.close();
		}catch(Exception ex) {
			
		}
	}

}
