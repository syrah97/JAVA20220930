package CH13;

class C03Company{
	//멤버변수
	int x;
	int y;
	private static C03Company instance = null;
	//생성자
	private C03Company() {
		x=10;
		y=20;
	}
	
	//멤버함수
	public static C03Company getInstance() {
		if(instance ==null) {
			instance = new C03Company();
		}
		return instance;
	}
}

public class C03SingleTonMain {

	public static void main(String[] args) {

		C03Company myCompany1 = C03Company.getInstance();
		C03Company myCompany2 = C03Company.getInstance();
		System.out.println(myCompany1 ==myCompany2);
		System.out.println("myCompany1 : " + myCompany1.x);
		System.out.println("myCompany2 : " + myCompany2.x);
	}

}
