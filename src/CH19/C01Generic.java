package CH19;

class 팥
{
	String meterial;
	팥(String meterial){this.meterial=meterial;}
	//toString 재정의
}

class 호빵<T>
{
	private T meterial;
	호빵(T meterial){
		this.meterial = meterial;
	}
	void ShowInfo() {
		System.out.println(meterial.toString()+"으로 만든 호빵");
	}
}

public class C01Generic {
	
	private static void mian(String[] args) {
		

	}

}
