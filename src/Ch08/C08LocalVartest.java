package Ch08;

class LocalVar{
	//속성(멤버변수)
	int num =10;
	void Func1() {
		System.out.println("멤버변수 num="+num);
		if(true) {
			int num=100;	//if 문 안에서만 사용되는 지역변수 num, if 벗어나면 소멸
			System.out.println("if문 안의 지역변수 num="+num);
		}
		System.out.println("멤버변수 num="+num);
	}
	void Func2() {
		int i=1;	
		int num=0;
		while(i<=5) {			
			System.out.println("num="+(num++));
			i++;		
		}
		System.out.println("while문 벗어남 num="+(num));
		System.out.println("멤버변수 num="+(this.num));
	}
	void Func3() {
		
	}
	
	
	
}

public class C08LocalVartest {
	public static void main(String[] args) {
		LocalVar obj = new LocalVar();
//		obj.Func1();
		obj.Func2();

	}

}
