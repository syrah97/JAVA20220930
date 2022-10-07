package Ch06EXEC;

import java.util.Scanner;

import Ch04.C01Scanner;

public class PRAC {

	public static void main(String[] args) {
		//문제 (IF만 써보고 IF ELSE 둘다 써보기)
		// 정수 한개값을 입력받아 3의 배수이면 해당 수를 출력하세요
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 :");
		 int num = sc.nextInt();
		
		if(num%3==0)
			System.out.println("3의 배수입니다");
		else
			System.out.println("3의 배수가 아닙니다.");
		
		
			
			
		
	
		

		//문제
		// 두수를 입력받아 두수 중에 큰수를 출력
		
		//문제
		// 세 정수를 입력받아 세 정수 중에 가장 큰수와 가장 작은수를 출력
		
		//문제
		// 세개의 정수를 입력받아 해당수의 합과 평균을 출력
	}

}
