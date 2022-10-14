package CH09;

// this
// 클래스 내에서 사용되는 예약어
// 생성되는 객체의 위치정보를 가져오는데 사용


class C02Simple{
	int x;
	
	C02Simple getThis() {
		return this;
	}
}

public class C02This {

	public static void main(String[] args) {
		C02Simple ob = new C02Simple();
		System.out.println(ob);
		System.out.println(ob.getThis());

	}

}
