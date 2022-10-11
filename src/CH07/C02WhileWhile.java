package CH07;

import java.util.Scanner;

public class C02WhileWhile {

	public static void main(String[] args) {
		
		//전체 구구단(2단-9단) 출력하기
//		int dan=2;
//		while(dan<=9)
//		{
//			int i = 1;
//			
//			System.out.printf(" --%d단--\n", dan);
//			
//			while (i<=9)
//			{
//				System.out.printf("%d X %d = %d\n", dan, i , dan * i);
//				i++;
//			}
//			System.out.printf("\n\n");
//			dan++;
//		}
		
	
		
		//N 부터 9단까지 전체 출력
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		while(n<=9)
//		{
//			int i = 1;
//			
//			System.out.printf(" --%d단--\n", n);
//			
//			while (i<=9)
//			{
//				System.out.printf("%d X %d = %d\n", n, i , n * i);
//				i++;
//			}
//			System.out.printf("\n\n");
//			n++;
//		}
		
		
//		//전체 구구단(2단-9단) 출력하기(단만 역순출력)
				int dan=9;
				while(dan>1)
				{
					int i = 9;
					
					System.out.printf(" --%d단--\n", dan);
					
					while (i>=1)
					{
						System.out.printf("%d X %d = %d\n", dan, i , dan * i);
						i--;
					}
					System.out.printf("\n\n");
					dan--;
				}
				
				
		//전체 구구단(2단-9단) 출력하기(전체 역순출력)
//		int dan=9;
//		while(dan>=2)
//		{
//			int i = 9;
//			
//			System.out.printf(" --%d단--\n", dan);
//			
//			while (i>=1)
//			{
//				System.out.printf("%d X %d = %d\n", dan, i , dan * i);
//				i--;
//			}
//			System.out.printf("\n\n");
//			dan--;
//		}
		
		
		
		
	}

}
