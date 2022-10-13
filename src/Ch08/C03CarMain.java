package Ch08;

class C03Car{
	String owner;
	int speed;
	int fuel;
	String model;
}

public class C03CarMain {

	public static void main(String[] args) {
		C03Car hong = new C03Car();
		hong.owner = "홍길동";
		hong.speed = 0;
		hong.fuel = 100;
		hong.model = "아반떼xd";
		System.out.printf("차주 : %s\n현재속도 : %d\n연료량 : %d\n차종 : %s\n", hong.owner
				,hong.speed,hong.fuel,hong.model);
		
		
		

	}

}
