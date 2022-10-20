package CH17;

public class C06Wrapper {

	public static void main(String[] args) {
		//Boxing(자료 -->Inget정수형 객체로 변환)
		Integer obj1 = new Integer(100);
		Integer obj2 = new Integer(200);
		Integer obj3 = Integer.valueOf(300);
		
		//Unboxing(Integer자료 -> 일반자료형
		int value1 = obj1.intValue();
		int value2 = obj2.intValue();
		int value3 = obj3.intValue();
		
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
		
		//자율 Bpxing
		Integer obj = 100;
		int n1 = obj + 10;
		System.out.println("결롸 :" + n1);
		
		//List<Integer> list = new ArrayList();

	}

}
