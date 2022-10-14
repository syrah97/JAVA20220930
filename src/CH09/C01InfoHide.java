package CH09;


//접근한정자
//public	: 모든 클래스에서 접근 가능
//default	: 동일 패키지에 속한 클래스에서만 접근가능
//private	: 현재 클래스에서만 접근가능

class C01Person
{
	//속성
	public String name;		//이름
	private String id;		//주민등록번호
	private int age;		//나이
	private float weight;	//몸무게
	private double height;	//신장
	private int salary;		//연봉
	//생정자
	public C01Person(String name, String id, int age, float weight, double height, int salary) {
		super();
		this.name = name;
		this.id = id;
		this.age = age;
		this.weight = weight;
		this.height = height;
		this.salary = salary;
	}
	
	//Setter 함수 지정
	public void setId(String id) {
		this.id=id;
	}
	//Getter 함수 지정
	public String getId() {
		return id;
	}
	//age Getter and Setter 만들기
	//weight Getter and Setter 만들기
	//height Getter 만 만들기
	//salary Getter 만 만들기

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	

}

public class C01InfoHide {

	public static void main(String[] args) {
		
		C01Person hong = new C01Person("홍길동","1111-1111",44,70.2f,177.5,5000);
		hong.name="남길동";
		//hong.id="2222-2222";
//		hong.setId("2222-2222");
//		hong.setAge(50);
//		hong.setWeight(85.5f);
//		System.out.println("ID : " + hong.getId());
//		System.out.println("Age : " + hong.getAge());
//		System.out.println("Weight : " + hong.getWeight());
//		System.out.println("Height : " + hong.getHeight());
//		System.out.println("Salary : " + hong.getSalary());
//		System.out.printf("이름 : %s\n아이디 : %s\n나이 : %d\n몸무게 : %s\n키 : %s\n연봉 : %d\n",
//				hong.name,hong.getId(),hong.getAge(),hong.getWeight(),hong.getHeight(),hong.getSalary());		
	}

}
