package CH14;

//상속관계에서 생성자 호출
//상위클래스의 생성자호출 -> 하위클래스 생성자 호출
//상위 클래스 생성자 호출시 super() 예약어를 사용하여 상위클래스의 오버로딩된 생성자에
//접근이 가능하다

class Parent {
	int x;
	int y;
	int z;

	Parent() {
		System.out.println("Parent() 생성자 호출!");
	}

	Parent(int x) {
		System.out.println("Parent(x) 생성자 호출!");
		this.x = x;
	}

	Parent(int x, int y) {
		System.out.println("Parent(x,y) 생성자 호출!");
		this.x = x;
		this.y = y;
	}

	Parent(int x, int y, int z) {
		System.out.println("Parent(x,y,z) 생성자 호출!");
		this.x = x;
		this.y = y;
		this.z = z;
	}

}

class Son extends Parent {
	Son() {
		// super(); //상위클래스 디폴트 생성자 호출
		super(); // 상위클래스 인자하나를 받는 생성자 호출
		System.out.println("Son() 생성자 호출!");
	}
//	Son(int x) {
//		System.out.printf("%d\n", x);
//	}
//
//	Son(int x, int y) {
//		System.out.printf("%d,%d\n", x, y);
//	}
//
//	Son(int x, int y, int z) {
//		System.out.printf("%d,%d,%d\n", x, y, z);
//	}
	
	//선생님 풀이
	Son(int x){
		System.out.println("Son(int x) 생성자 호출");
	}
	Son(int x, int y){
		System.out.println("Son(int x,int y) 생성자 호출");
	}
	Son(int x, int y, int z){
		System.out.println("Son(int x,int y,int z) 생성자 호출");
	}

	//toStinrg() 재정의해서 x,y,z값 확인해보기
	
}

public class C02InheritanceMain {

	public static void main(String[] args) {
		Son ob1 = new Son();
		System.out.println();
		Son ob2 = new Son(10); // x멤버에 10 값 넣기 super예약어사용
		System.out.println();
		Son ob3 = new Son(10, 20); // x,y멤버에 10,20 값 넣기
		System.out.println();
		Son ob4 = new Son(10, 20, 30);// x,y,z 멤버에 10,20,30 값 넣기

	}

}
