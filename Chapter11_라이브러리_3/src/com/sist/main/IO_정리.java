package com.sist.main;
/*
 *   IO => java.io => CheckException => 예외처리후 사용 
 *                    --------------
 *                    | java.sql / java.net / java.lang(Thread)
 *   1) 특징
 *      = 단방향 => Input / Output (빨대)
 *        => 읽기/쓰기 => 쓰레드 이용해서 처리 
 *        => 네트워크 : 전송(쓰기) => 수신(읽기) 
 *                    -------    -------- Thread
 *        => Thread 는 프로그램안에서 다른 프로그램 여러개를 동시에 수행 
 *        => 예) 비행기 / 총알 => 시분할 (시간 나눠서 처리) 
 *      = 데이터 이동하는 통로 : Stream 
 *      = Queue 방식이다 => FIFO (먼저 들어간 것이 먼저 나오게) 
 *   2) 종류
 *       = 바이트 송수신 = 바이트 스트림 
 *          => 1byte읽기 / 1byte쓰기 
 *          => 동영상 / 이미지 / zip ... 
 *          => ~InputStream / ~OutputStream 
 *          => 웹) 업로드 / 다운로드 / 웹 데이터 읽기 
 *             네트워크에서 주로 사용 
 *       = 문자 송수신 = 문자 스트림
 *        => 2byte읽기 / 2byte쓰기 
 *        => 한글이 포함한 한글제어
 *        => ~Reader / ~Writer
 *      = ~InputStream / ~OutputStream 
 *        => FileInputStream / FileOutputStream 
 *        => ObjectInputStream / ObjectOutputStream 
 *      = ~Reader / ~Writer
 *        => FileReader / FileWriter 
 *      = 속도를 최적화 => 필터스트림
 *        => BufferedInputStream / BufferedOutputStream
 *        => BufferedReader / BufferedWriter
 *   3) 사용되는 곳
 *              입력스트림                  출력스트림 
 *      사용자  ============= 자바 프로그램 ============= 화면 
 *      (키보드,마우스)          응용프로그램              모니터/브라우저
 *      
 *      메모리에서 입출력 : BufferedReader => readLine()
 *      파일에서 입출력 
 *        바이트 스트림 (~InputStream,~OutputStream)
 *           => read() => 한글자씩 읽어온다
 *              => int =>  글자의 코드번호
 *           => read(bytte[],int off,int len)
 *              => 한번에 여러개의 글자 읽기 
 *              => int => 읽은 글자수 
 *           => write(int)
 *           => write(byte[]) => String 을 byte[] 로 변환 => getBytes() 
 *           => byte 를 읽어서 출력 => 한글파일 
 *           => close
 *         문자 스트림 (~Reader , ~Writer)
 *           => read() => int 
 *           => read(char[],int,int)
 *           => write(int)
 *           => write(char[])
 *           => ******write(String)
 *           => 파일 제어 => 읽기/쓰기 
 *      네트워크 입출력 
 *      --------------------- 스트림을 이용한다
 *      스트림 => 안정성 
 *       | 메모리에 저장된 데이터를 읽어온다 => 절대 잊어버리지 않는다 
 *       | 소켓프로그램 => 신뢰성이 좋다 
 *         | 이메일 (smtp) 파일업로드(FTP) ,TELNET 
 *         
 *      표준 입출력
 *        = System.in / System.out
 *        public final class System 
 *        {
 *           public static InputStream in; 
 *                         => read()
 *           public static OutputStream out;
 *                         => print
 *        }
 *      4) 파일 모드 
 *         r => ~InputStream/~Reader => 읽기 전용
 *         w => ~OutputStream/~Writer => Create
 *               => 덮어쓴다
 *         a => new FileWriter("파일명",true)
 *                                    ----- 
 *      5) 객체 단위 저장
 *         ----------
 *         ObjectInputStream / ObjectOutputStream 
 *         --------------------------------------
 *         | 읽기 / 쓰기 / 수정 / 삭제 / 검색 
 *         | 제어는 ArrayList => 저장 (ArrayList를 통으로 저장) 
 *         | 직렬화 / 역직렬화 
 *           --------------
 *        
 */
// 키보드로 입력을 받아서 처리 
import java.util.*;
import java.io.*;
public class IO_정리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
//			// 웹 => 데이터 / HTML 
//			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
//			// Scanner  => 가장 단순한 입력 클래스 
//			System.out.print("문자열 입력:");
//			String msg=in.readLine(); // enter => 메모리에 저장 
//			System.out.println(msg);
//			// 명령프롬프트 (X) => 입력창 / 출력창 
//			//                  브라우저 (윈도우) 
			System.out.print("입력:");
			int data=System.in.read();
			System.out.println((char)data);
			
		}catch(Exception ex) {}
	}

}
