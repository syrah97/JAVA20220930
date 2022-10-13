package Ch08EXEC;

public class MethodTest {

	public static void main(String[] args) {
		//다음 코드를 실행할수 있는 Sub클래스를 만드세요
		
		Sub calc = new Sub();
		int r1 = calc.sub1(10,20);
		int r2 = calc.sub2();
		calc.sub3();
		calc.sub4(10,20);
		
	}

}
