package CH07;

import java.util.Scanner;

public class C01While {

	public static void main(String[] args) {

		//조건식은 참인동안 반복
		
		//탈출 요건
//		int i=0; //1 탈출 변수
//		while(i<10) //2 탈출 조건식
//		{
//			System.out.println("Hello World");
//			i++; //3 탈출 연산식
//		}
		
		//1 부터 10까지 합
//		int i=1; 		//1 탈출 변수
//		int sum=0;		// 누적 합 저장 변수
//		while(i<=10) 	//2 탈출 조건식
//		{
//			System.out.println("i : "+i);
//			sum=sum+i; 	//sum+i
//			i++; 		//3 탈출 연산식
//		}				
//		System.out.println("종료 후 i : " +i);
//		System.out.println("1 부터 10까지 합 : " +sum);
		
		
		//1 문제
		//1부터 입력한 정수(N)까지 합 구하기
//		int i=1;
//		int n=0;
//		while(i<=100)
//		{
//			System.out.println("i : " +i);
//			n=n+i;
//			i++;
//		}
//		System.out.println("1부터 n까지 합 : " +n);
		
		//2 문제
		//N,M 을 입력받아서 N부터 M까지 합 구하기(N<M)
//		int n=50;
//		int m=0;
//		while(n<500)
//		{
//			System.out.println("n : " +n);
//			m=m+n;
//			n++;
//			}
//		System.out.println("n부터 m까지 합 : " + m);
		
		//2 문제풀이
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int m = sc.nextInt();
//		
//		if(n>m)
//		{
//			int tmp = n;
//			n=m;
//			m=tmp;
//		}
//		
//		//초기값 = n
//		int i=n;
//		int sum=0;
//		while(i<=m)
//		{
//			sum+=i;
//			i++;
//		}
//		System.out.printf("%d 부터 %d까지의 합 : %d\n", n,m,sum);
		
		
		
		
		//3 문제
		//구구단 2단 출력
//		int i=2;
//		while(i>=2)
//		{
//			int j = 9;
//			
//			System.out.printf(" --%d단--\n", i);
//			
//			while (j>=1)
//			{
//				System.out.printf("%d X %d = %d\n", i, j , i * j);
//				j--;
//			}
//			System.out.printf("\n\n");
//			i--;
//		}
		//or
//		int i=1;
//		while(i<10)
//		{
//			int n = i*2;
//			System.out.printf("2 X %d = %d\n",i,n);
//			i++;			
//		}
		
		//3 문제풀이
//		int i=1;
//		while(i<10)
//		{
//			System.out.printf("%d x %d = %d\n", 2,i,2*i);
//			i++;
//		}
//		
		
		
		
		//4 문제
		//구구단 2단 출력(역순출력)
//		int i=9; 
//		while(i>=1)
//		{
//			int n = i*2;
//			System.out.printf("2 X %d = %d\n",i,n);
//			i--;		
//		}
		
		//4 문제풀이
//		int i=9;
//		while(i>=1)
//		{
//			System.out.printf("%d x %d = %d\n", 2,i,2*i);
//			i--;
//		}
		
		
		
		//5 문제
//		구구단 N단 출력(입력받기)
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		
//		int i=1;
//		while(i<10)
//		{
//			System.out.printf("%d x %d = %d\n", n,i,n*i);
//			i++;
//		}
		
		//5 문제풀이
		
		
		
		//6 문제
		//구구단 N단 출력(입력받기, 역순출력) (별첨 ...2<=n<=9)
//		Scanner sc = new Scanner(System.in);
//		int n =sc.nextInt();
//		
//		int i=9;
//		while(i>0)
//		{
//			System.out.printf("%d x %d = %d\n", n,i,n*i);
//			i--;
//		}
		
		//6 문제풀이
		
		
		//7 문제
		//프로그램 사용자로부터 양의 정수를 하나 입력 받은 다음, 그 수만큼 3의 배수를 출력하는
		//프로그램을 작성
		//ex. 5를 입력 받았다면 3, 6, 9, 12, 15 를 출력
		
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();		
//		int i=3;
//		int j=1;
//		while(j<=n)
//		{
//			int k=i*j;
//			System.out.println(k);
//			j++;
//		}
		
		//7 문제풀이
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int i = 1;
//		while(i<=n)
//		{			
//			if(i<n)
//			{
//			System.out.print(i*3+",");
//			}
//			else
//			{
//			System.out.println(i*3);
//			}
//			i++;
//		}
		
		
		
		
		//8 문제
		//1부터 100까지 수중에 짝수의 합과 홀수의 합을 각각 구해서 출력하세요
//		Scanner sc = new Scanner(System.in);
//		int i=0;
//		int j=1;
//		int n=0;
//		int m=0;
//		while(i<=100)
//		{				
//			if(i%2==0)
//			{				
//				n += i;
//			}
//			else
//			{
//				m += i;
//			}
//			i++;
//		}
//		System.out.println(n);
//		System.out.println(m);
		
		//8 문제풀이
//		Scanner sc = new Scanner(System.in);
//		int i = 1;
//		int evensum=0;
//		int oddsum=0;
//		while(i<=100)
//		{
//			if(i%2==0) {
//				System.out.println("짝수 i = " + i);
//				evensum += i;
//			}
//			else {
//				System.out.println("홀수 i = " + i);
//				oddsum += i;
//			}
//			i++;
//		}
//		System.out.println(evensum);
//		System.out.println(oddsum);
		
		
		
						
		//9 문제
		//1부터 N까지 수중에 짝수의 합과 홀수의 합을 각각 구해서 출력하세요
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int i = 1;
//		int even = 0;
//		int odd = 0 ;
//		while(i<=n)
//		{
//			if(i%2==0)
//			{
//				even += i;
//			}
//			else
//			{
//				odd += i;
//			}
//			i++;
//		}
//		System.out.println(even);
//		System.out.println(odd);
		
		
		//10 문제
		//1부터 100까지 수중에 3의 배수는 제외한 합을 구해서 출력해보세요
		
//		Scanner sc = new Scanner(System.in);
//		int i = 1;
//		int sum = 0;
//		while(i<=100)
//		{
//			if(i%3!=0)
//			{
//				sum += i; //3배수가 아닌경우 실행코드
//			}
//			i++;
//		}
//		System.out.println(sum);
		
		
		//11 문제
		//문자열을 입력받아서 각문자를 거꾸로 출력해봅시다(같이풉니다)
		//입력 : apple
		//출력 : elppa
		
		
		//11 문제풀이
		Scanner sc = new Scanner(System.in);
		
		String str1 = sc.nextLine();
//		String reverse="";
		int len = str1.length()-1;
		System.out.println("길이 : " +len);
		while(len>=0)
		{
			System.out.print(str1.charAt(len)); // olleH
//			reverse+=str1.charAt(len);
			len--;
		}
//		System.out.println(reverse);
		
	}

}
