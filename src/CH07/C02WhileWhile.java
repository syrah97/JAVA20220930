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
//				int dan=2;
//				while(dan<=9)
//				{
//					int i = 9;
//					
//					System.out.printf(" --%d단--\n", dan);
//					
//					while (i>=1)
//					{
//						System.out.printf("%d X %d = %d\n", dan, i , dan * i);
//						i--;
//					}
//					System.out.printf("\n\n");
//					dan++;
//				}
				
				
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
		
		
		
		//1					i	j		i=0		j=0
		//*****				0	0-4		i++		j++
		//*****				1	0-4		i<4		j<5
		//*****				2	0-4
		//*****				3	0-4
//		int i=0;
//		int j=0;
//		while(i<4)
//		{
//			j=0;
//			while(j<5) {
//				System.out.print("*");
//				j++;
//			}
//			System.out.println();
//			i++;
//		}
		//높이 입력받아서 출력
//		Scanner sc = new Scanner(System.in);
//		System.out.print("높이 : ");
//		int n=sc.nextInt();
//		int i=0;
//		int j=0;
//		while(i<n)
//		{
//			j=0;
//			while(j<5) {
//				System.out.print("*");
//				j++;
//			}
//			System.out.println();
//			i++;
//		}
		
		
		
		//2			i	j		i=0		j=0
		//*			0	0-0		i++		j++
		//**		1	0-1		i<4		j<=i
		//***		2	0-2
		//****		3	0-3
//		int i=0;
//		int j=0;
//		while(i<4)
//		{
//			j=0;
//			while(j<=i)
//			{
//				System.out.print("*");
//				j++;
//			}
//			System.out.println();
//			i++;
//		}
		//높이 입력받아서 출력
//		Scanner sc = new Scanner(System.in);
//		System.out.print("높이 : ");
//		int n=sc.nextInt();
//		int i=0;
//		int j=0;
//		while(i<n)
//		{
//			j=0;
//			while(j<=i) {
//				System.out.print("*");
//				j++;
//			}
//			System.out.println();
//			i++;
//		}
		
		
		//3			i	j		i=0		j=0
		//****		0	0-3		i++		j++
		//***		1	0-2		i<4		j<=3-i
		//**		2	0-1
		//*		3	0-0
//		int i=0;
//		int j=0;
//		while(i<4)
//		{
//			j=0;
//			while(j<=3-i)
//			{
//				System.out.print("*");
//				j++;
//			}
//			System.out.println();
//			i++;
//		}
		//높이 입력받아서 출력
//		Scanner sc = new Scanner(System.in);
//		System.out.print("");
//		int n=sc.nextInt();
//		int i=0;
//		int j=0;
//		while(i<n)
//		{
//			j=0;
//			while(j<=(n-1)-i) {
//				System.out.print("*");
//				j++;
//			}
//			System.out.println();
//			i++;
//		}
		
		
		
		//4				i(개행)	j(공백)	k(별)
		//	 *			0		0-2		0-0
		//	***			1		0-1		0-2	
		// *****		2		0-0		0-4
		//*******		3		x		0-7
//		Scanner sc = new Scanner(System.in);
//		int n=sc.nextInt();	//높이
//		int i=0;	//행
//		int j=0;	//공백
//		int k=0;	//별
//		while(i<n)
//		{
//			j=0;	//공백
//			while(j<=(n-2)-i)
//				{
//				System.out.print(" ");
//				j++;
//				}	
//			k=0;	//별
//			while(k<=2*i)
//				{
//				System.out.print("*");
//				k++;
//				}
//			System.out.println();
//			i++;
//		}

//		int i = 0;
//	    int j = 0;
//	    int k = 0;
//	      
//	    while (i < 4) 
//	    {
//	        j = 0;
//	        k = 0;
//	        while(k < 3-i ) {
//	            System.out.print(" ");
//	            k++;
//	         }
//	         
//	         while(j < 2 * i + 1 ) {
//	            System.out.print("*");
//	            j++;
//	         }
//	         System.out.println();
//	         i++;
//	      }

		
		//5
		//*******
		// *****
		//	***
		//	 *
//		int i=0;	
//		int j=0;	
//		int k=0;	
//		while(i<4)
//		{
//			j=0;	//공백
//			while(j<=i-1)
//				{
//				System.out.print(" ");
//				j++;
//				}	
//			k=0;	//별
//			while(k<=6-2*i)
//				{
//				System.out.print("*");
//				k++;
//				}
//			System.out.println();
//			i++;
//		}
		//5 높이값 입렵
//		Scanner sc =new Scanner(System.in);
//		int n=sc.nextInt();
//		int i=0;	
//		int j=0;	
//		int k=0;	
//		while(i<n)
//		{
//			j=0;	//공백
//			while(j<=i-1)
//				{
//				System.out.print(" ");
//				j++;
//				}	
//			k=0;	//별
//			while(k<=(n-1)*2-2*i)
//				{
//				System.out.print("*");
//				k++;
//				}
//			System.out.println();
//			i++;
//		}
		
		
		//6
		//	 *
		//	***
		// *****
		//*******
		// *****
		//	***
		//	 *
		
		//	i(행)	j(공백)	k(별)
		//	0		0-2		0-0
		//	1		0-1		0-2
		//	2		0-0		0-4
		//	3		x		0-6	
		//	4		0-0		0-4
		//	5		0-1		0-2
		//	6		0-2		0-0
		int i=0;
		int j=0;
		int k=0;
		while(i<7)
		{
			if(i<4){	//j=0,k=0
				j=0;	//j<=2-i,k<=2*i
				while(j<=2-i){
					System.out.print(" ");
					j++;
				}
				k=0;
				while(k<=2*i){
					System.out.print("*");
					k++;
				}
			}
			else{		//j=0,k=0
				j=0;	//j=<=i-4,k<6-2*(i-3)
				while(j<=i-4){
					System.out.print(" ");
					j++;
				}
				k=0;
				while(k<=6-2*(i-3)){
					System.out.print("*");
					k++;
				}
			}
			System.out.println();
			i++;
		}
	}

}
