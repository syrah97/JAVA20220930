package Ch08;

import java.util.Scanner;

class Sum{
	//속성
	Scanner sc = new Scanner(System.in);	
	//기능
	//반환 o 매개변수 o
	int sum1(int x,int y) {
		return x+y;
	}
}

public class C07SimpleMethodTest {

	public static void main(String[] args) {

			Sum calc = new Sum();	//Sum객체 생성 이후 calc 참조변수에 연결
			
			int r1 = calc.sum1(10,20);	//calc객체의 sum1함수를 실행
			System.out.println("sum1(x,y) = " + r1);

	}

}
