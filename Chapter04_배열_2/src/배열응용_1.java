/*
 *   3명의 학생
 *     => 국어/영어/수학 점수를 입력 받아서
 *     => 총점 / 평균 / 학점 / 등수를 출력한다
 */
import java.util.Scanner;
public class 배열응용_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// int [][] arr=new int [3][7];
		int [] kor = new int [3];
		int[]eng=new int[3]; // 1번 / 2번 / 3번 => 인덱스 번호 일치
		int[]math=new int [3];
		
		int[]total = new int[3];
		double[] avg = new double[3]; // 0.0.0.0.0.0
		char[] score = new char [3]; // '\0'
		int [] rank = new int [3];
		
		// 점수입력을 받아서 => 초기화 => avg 
		Scanner scan = new Scanner(System.in);
		for(int i=0; i < kor.length; i++)
		{
			System.out.print((i+1)+" '국어 입력:");
			kor[i]=scan.nextInt();
			
			System.out.print((i+1)+" 영어 입력:");
			eng[i]=scan.nextInt();
			
			System.out.print((i+1)+"'수학 입력:");
			math[i]=scan.nextInt();
			
			total[i]=kor[i]+eng[i]+math[i];
			
			avg[i]=total[i]/3.0;
		}
		// 학점 계산
		for(int i=0; i < kor.length; i++)
		{
			switch((int)(avg[i]/10)) // 정수 , 문자 , 문자열
			{
			case 10,9:
				score[i]='A';
			case 8:
				score[i]='B';
				break;
			case 7 : 
				score[i]='C';
				break;
			case 6:
				score[i]='D';
				break;
				default : 
					score[i]='F';
				
			}
		}
		//등수 계산
		for(int i = 0; i <kor.length; i++)
		{
			rank[i]=1;
			for(int j=0; j<kor.length; j++)
			{
				if(total[i]<total[j])
				{
					rank[i]++;
				}
			}
		}
		//출력
		for(int i=0; i<kor.length; i++)
		{
			// 출력 서식을 만드는 메소드 => 원하는 스타일로 출력
			
			// -5d ==>d=왼ㅉㄱ 정렬 => 공백울 출력 => 3자리
			System.out.printf("%-5d%-5d%-5d%-7d%7.2f\n",kor[i],eng[i],math[i],total[i],avg[i],score[i]);
		}

	}

}
