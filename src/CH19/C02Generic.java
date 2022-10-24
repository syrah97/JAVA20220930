package CH19;

class Simple<T>
{
	T x;
	T y;
	Simple(T x, T y){
		this.x=x; this.y=y;
	}
	void ShowMember() {
		System.out.println("X = "+x+",Y = " + y);
	}
}

class Person
{
	String name;
	String addr;
	Person(String name,String addr){this.name = name; this.addr = addr;}
}

public class C02Generic {

	public static void main(String[] args) {
		Simple<Integer> ob1 = new Simple<Integer>(10,20);
		ob1.ShowMember();
		System.out.println();

	}

}
