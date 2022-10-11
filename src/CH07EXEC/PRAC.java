package CH07EXEC;

import java.util.Scanner;

public class PRAC {

	public static void main(String[] args) {
		
		//문제1 두 정수 A와B를 입력받아서 A+B를 출력하자
//		Scanner sc = new Scanner(System.in);
		
//		int a = sc.nextInt();
//		int b = sc.nextInt();
//		int sum=1;
//		int i = 0;
//		while(i<=5)
//		{
//			if(i<=5)
//			{
//			sum=a+b;
//			System.out.println(sum);		
//			i++;
//			}
//		}
//		int sum = 1;
//        
//        while(sum > 0) {
//            int x = sc.nextInt();
//            int y = sc.nextInt();
//            sum = x + y;
//            
//            if(sum != 0) {
//                System.out.println(sum);
//            }
//        }
        
        //문제2 정수를 계속 입력받다가 100 이상의 수가 
        //입력이 되면 마지막 입력된 수를 포함하여 합계와 평균을 
        //출력하는 프로그램을 작성하시오.
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int i = sc.nextInt();		
		int n = 0 ;
		while(i<=100)
		{
			sum=n+i;
			if(i<=100) {
				System.out.println(""+i);
				
			}
		}
		
	}

}
