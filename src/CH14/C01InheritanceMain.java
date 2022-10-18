package CH14;

//상속
//상위클래스의 속성과 기능을 하위클래스에서 그대로 받아 사용할 수 있도록 허용한 문법
//extends 예약어를 이용한다

//상속의 사용이유
//1 확장성
//2 유지보수
//3 가독성

//상위클래스,부모클래스,수퍼클래스
class Point2D
{
	int x;
	int y;
	void showPoint() {
		System.out.println(x + " , " +y);
	}
}
//하위클래스
class Point3D extends Point2D{
	int z;
	void showPoint3D() {
		System.out.printf("%d,%d,%d\n",x,y,z);
	}
}

public class C01InheritanceMain {

	public static void main(String[] args) {
		Point3D ob1 = new Point3D();
		ob1.x=10;
		ob1.y=20;
		ob1.showPoint();
		ob1.z=30;
		ob1.showPoint3D();
		
	}

}
