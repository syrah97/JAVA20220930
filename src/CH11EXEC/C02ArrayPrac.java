package CH11EXEC;

import java.util.Scanner;

public class C02ArrayPrac {

	public static void main(String[] args) {
		//문제
		//5명의 학생의 국/영/수 점수를 입력받아 출력을 해봅시다
		//이차원배열
		//int score[5][3]
		int [][] score = new int[5][3];
		//반복문을 이용해서 값을 입력받기
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<score.length;i++) {
			for(int j=0;j<score[i].length;j++) {
				score[i][j]=sc.nextInt();	//이차원배열 각요소에 값넣기
			}
		}
		//학생별 총점 구하기
//		int std[] = new int[5]; 
//		int cnt=0;
//		for(int tmp[] :score)
//		{			
//			for(int n:tmp) {
//				std[cnt]+=n;
//			}
//			cnt++;
//		}
//		for(int i=0;i<std.length;i++) {
//			System.out.println(i+"번째 학생 총점 : " + std[i]);
//		}
		//학생별 평균 구하기
		int k=0, e=0, m=0, kAvg=0, eAvg=0, mAvg=0;
		for(int i=0;i<score.length;i++) {
			int sum=0,avg=0;
			System.out.print(i+ 1 +"학생 점수 입력(국/영/수 순서)\n");
			for(int j=0;j<score[i].length;j++) {
				score[i][j] = sc.nextInt();
				sum += score[i][j];
				avg=sum/3;
			}
			k +=score[i][0];
			e +=score[i][1];
			m +=score[i][2];
			kAvg=k/5;
			eAvg=e/5;
			mAvg=m/5;
			
			System.out.println(i + 1 + "학생총점" +sum);
			System.out.println(i + 1 + "학생평균" +avg);
			
		}
		System.out.println();
		System.out.printf("국어 총점%d\n", k);
		System.out.printf("영어 총점%d\n", e);
		System.out.printf("수학 총점%d\n", m);
		System.out.printf("국어 평균%d\n", kAvg);
		System.out.printf("영어 평균%d\n", eAvg);
		System.out.printf("수학 평균%d", mAvg);
		
		//생략
		
		
		//과목별 총점 구하기
//		int subject[] = new int[3];//0 : 국어총점,1 : 영어총점,2 : 수학총점
//		for(int j=0;j<3;j++) {
//			for(int i=0;i<score.length;i++) {
//				subject[j]+=score[i][j];
//			}
//		}
		//과목별 평균 구하기
		//셍략
		
		//각 행의 합 과 전체 합 // 각행의 평균 전체 평균을 출력하세요		
		//출력에
		//1 학생 점수입력(국/영/수 순서) : 100 70 60
		//2 학생 점수입력(국/영/수 순서) : 99 98 66
		//3 학생 점수입력(국/영/수 순서) : 99 88 77
		//4 학생 점수입력(국/영/수 순서) : 100 55 66
		//5 학생 점수입력(국/영/수 순서) : 55 66 77
		//1 학생 총점 : ? 평균 ?
		//2 학생 총점 : ? 평균 ?
		//3 학생 총점 : ? 평균 ?
		//4 학생 총점 : ? 평균 ?
		//5 학생 총점 : ? 평균 ?
		//국어 총점 : ? 국어 평균 :?
		//영어 총점 : ? 영어 평균 :?
		//수학 총점 : ? 수학 평균 :?
		
		
//		int sum=0;
//		double avg=0.0;
//		
//		score[0][0]=100;
//		score[0][1]=70;
//		score[0][2]=60;
//		
//		score[1][0]=99;
//		score[1][1]=98;
//		score[1][2]=66;
//		
//		score[2][0]=99;
//		score[2][1]=88;
//		score[2][2]=77;
//		
//		score[3][0]=100;
//		score[3][1]=55;
//		score[3][2]=66;
//		
//		score[4][0]=55;
//		score[4][1]=66;
//		score[4][2]=77;
//		
//		System.out.println("행개수 : " + score.length);
//		System.out.println("열개수 : " + score[0].length);
//				
//		
//		avg=(double)sum/score[0].length;
//		
//		System.out.printf("평균 : %f" ,avg);
//		
		
		
		
		
		
		
		
		
	
		
		

	}

}
