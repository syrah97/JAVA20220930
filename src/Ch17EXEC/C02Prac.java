package Ch17EXEC;

import java.util.Objects;

class Person
{
	String name;
	int age;
	public Person(String name , int age)
	{
		this.name = name;
		this.age = age;
	}
	//hashcode()재정의할것(Objects.hash()함수를 사용할 것)
	@Override
	public int hashCode() {
		return Objects.hash(this.name,this.age);
	}
	//equals()재정의할 것(name과 age가 일치하면 true, 아니면 false)
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Person) {
			Person down = (Person)obj;
			return this.name==down.name && this.age==down.age;
		}
		return false;
	}
	//toString()재정의할 것(name,age가 출력)
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
	
	
	
	
	
}
public class C02Prac {

	public static void main(String[] args) {
		Person obj1 = new Person("이승철",35);
		Person obj2 = new Person("조용필",50);
		Person obj3 = new Person("이승철",35);	
		//toString() 재정의 확인
		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println(obj3);
		//hashcode()확인
		System.out.println(obj1.hashCode()==obj2.hashCode());
		System.out.println(obj2.hashCode()==obj3.hashCode());
		System.out.println(obj3.hashCode()==obj1.hashCode());
		//equals()확인
		System.out.println(obj1.equals(obj2));
		System.out.println(obj2.equals(obj3));
		System.out.println(obj1.equals(obj3));	
	}

}
