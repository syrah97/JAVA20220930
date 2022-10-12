package CH07;

import java.util.Scanner;

public class C04For {

	public static void main(String[] args) {
		
//		int i = 0;	//초기값
//		while(i < 10)//조건식
//		{
//			System.out.println("Hello World");
//			i++;//증감연산식
//		}
		
		
//		for(int i=0;i<10;i++)
//		{
//			System.out.println("Hello World");
//		}
		
		//1부터 10까지 합
//		int sum=0;
//		for(int i=1;i<=10;i++)
//		{
//			sum+=i;
//		}
//		System.out.println("SUM = " + sum);
		
				
		//1부터 N까지 합
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int sum=0;
//		for(int i=1;i<=n;i++)
//		{
//			sum+=i;
//		}
//		System.out.println("SUM = " + sum);
		
		//N부터 M까지 합
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int m = sc.nextInt();
//		int sum=0;
//		for(int i=n;i<=m;i++)
//		{
//			sum+=i;
//		}
//		System.out.println("SUM = " + sum);
		
		
		//구구단 2단		
//		for(int i=1;i<=9;i++)
//		{			
//			System.out.printf("%d x %d = %d\n", 2,i,2*i);
//		}
		
		//구구단 N단
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();		
//		for(int i=1;i<=9;i++)
//		{			
//			System.out.printf("%d x %d = %d\n", n,i,n*i);
//		}
		
		//구구단 전체
//		for(int i=1;i<=9;i++)
//		{
//			for(int j=1;j<=9;j++)
//			{
//				System.out.printf("%d x %d = %d\n", i,j,i*j);
//			}
//			System.out.printf("\n\n");
//		}
		
		
		//별찍기
		
		//-사각형
		
		//-삼각형
//		for(int i=0;i<=9;i++)
//		{
//			for(int j=0;j<=i;j++)
//			{
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		//-역삼각형
		
		//-피라미드
//		for(int i=0;i<5;i++)
//		{
//			for(int j=0;j<=3-i;j++)
//			{
//				System.out.print(" ");
//			}
//			for(int k=0;k<=2*i;k++)
//			{
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		//-역피라미드
		
		//-다이아몬드
		for(int i=0;i<7;i++)
		{
			if(i<4)
			{
				for(int j=0;j<=2-i;j++)
				{
					System.out.print(" ");
				}
				for(int k=0;k<=2*i;k++)
				{
					System.out.print("*");
				}
			}
			else
			{
				for(int j=0;j<=i-4;j++)
				{
					System.out.print(" ");
				}
				for(int k=0;k<=12-(2*i);k++)
				{
					System.out.print("*");
				}
			}
			System.out.println();
		}

	}

}
