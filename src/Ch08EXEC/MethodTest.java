package Ch08EXEC;

import java.util.Scanner;

class Sub{
	
	Scanner sc = new Scanner(System.in);
	
	int sub1(int x, int y) {
		return x+y;
	}
	
	int sub2() {
		int x = sc.nextInt();
		int y = sc.nextInt();
		return x+y;
	}
	
	void sub3(int x,int y) {
		System.out.println("sub3(x,y) = " + (x+y));
	}
	
	void sub4() {
		int x = sc.nextInt();
		int y = sc.nextInt();
		System.out.println("sub4() = " + (x+y));
	}
}

public class MethodTest {

	public static void main(String[] args) {
		//다음 코드를 실행할수 있는 Sub클래스를 만드세요
		
		Sub calc = new Sub();
		
		int r1 = calc.sub1(10,20);
		System.out.println("sub1(x,y) = " + r1);
		
		int r2 = calc.sub2();
		System.out.println("sub2() = " + r2);
		
		calc.sub3(10,20);
		
		calc.sub4();
		System.out.println("프로그램을 종료합니다.");
		
	}

}
