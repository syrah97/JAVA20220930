package Ch08;

import java.util.Scanner;

class C10Person{
	//속성 (=필드, 멤버변수)
	String name;
	int age;
	String addr;	
	void talk() {
		System.out.println(name+"님이 말합니다.");
	}
	void walk() {
		System.out.println(name + "님이 걷습니다.");
	}
	void ShowInfo() {
		System.out.printf("이름 : %s\n나이 : %d\n주소 : %s\n" , name,age,addr);
	}
	
	 void setPerson(String name) {
		 this.name=name;
}
	 void setPerson(String name,int age) {
		 this.name=name;
		 this.age=age;		 
	 }
	 void setPerson(String name, int age, String addr) {
		 this.name=name;
		 this.age=age;
		 this.addr=addr;		 
	 }
}

public class C10PersonMain {

	public static void main(String[] args) {
		//Overloading 문제
		//다음을 만족하는 setPerson 함수를 만드세요.
		C10Person obj = new C10Person();
		obj.setPerson("홍길동"); //멤버변수 name에 "홍길동" 저장
		obj.ShowInfo();
		obj.setPerson("서길동",10); //멤버변수 name,age에 각각 저장
		obj.ShowInfo();
		obj.setPerson("강호동",55,"서울"); //멤버변수 name,age,addr에 각각 저장
		obj.ShowInfo();

	}

}
