package CH14;

//------------------------------
//멤버함수의 동작방식
//------------------------------
//클래스 영역에서의 저장 : static변수,static메서드,인스턴스메서드(1회이상호출),생성자메서드
//static은 객체 생성 전에 클래스영역에 저장
//일반메서드는 객체 1회이상 생성 시 클래스영역에 저장(재사용성)

class Super
{
	int num1;
	public void sound() {System.out.println("Sound1()");}
}
class Sub extends Super
{
	int num2;//확장
	public void move() {System.out.println("Sub1 move1()");}	//확장
	
	public void sound() {System.out.println("Sub`s sound1()");} //재정의
	}

public class C04MethodInfo {

	public static void main(String[] args) {
		//정상범위(No Casting)
		Super ob1 = new Super();
		Super ob2 = new Super();
		Sub ob3 = new Sub();
		
//		ob1.sound();
//		System.out.println();
		
		//Upcasting(상위클래스 참조변수 = 하위객체)
		Super ob4 = new Sub();

	}

}
