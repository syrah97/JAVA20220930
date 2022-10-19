package CH14EXEC;

class Moonbanggu
{
//	String w;
//	
//	 public Moonbanggu(String w) {
//		super();
//		this.w = w;
//	}

	void write() {
		System.out.println("씁니다");
	}
}
class Sharpen extends Moonbanggu
{
//	String s;
//	
//	public Sharpen(String w, String s) {
//		super(w);
//		this.s = s;
//	}

	@Override
	void write() {
		System.out.println("샤프로 씁니다");
	}

	//코드완성
	
}
class Pencil extends Moonbanggu
{
//	String p;
//	
//	public Pencil(String w, String p) {
//		super(w);
//		this.p = p;
//	}

	@Override
	void write() {
		System.out.println("연필로 씁니다");
		
	}

	//코드 완성
	
}
public class C04Prac {
	public static void Writing(Moonbanggu item) {
		item.write();
	}
	public static void main(String[] args) {
//		Sharpen item1 = new Sharpen("샤프로","씁니다");
//		Pencil item2 = new Pencil("연필로","씁니다");
		Sharpen item1 = new Sharpen();
		Pencil item2 = new Pencil();
		Writing(item1);	//"샤프로 씁니다" 가 출력
		Writing(item2); //"연필로 씁니다" 가 출력 
	}
}
