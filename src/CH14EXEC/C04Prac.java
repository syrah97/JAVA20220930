package CH14EXEC;

class Moonbanggu
{
//	String w;
//	
//	 public Moonbanggu(String w) {
//		super();
//		this.w = w;
//	}
	public static int SharpenCnt=100;
	public static int PencilCnt=100;
	void write() {}
}
class Sharpen extends Moonbanggu
{
//	String s;
//	
//	public Sharpen(String w, String s) {
//		super(w);
//		this.s = s;
//	}
	Sharpen(){
		if(SharpenCnt>=1)
		SharpenCnt--;
	}


	//코드완성
	@Override
	void write() {
		System.out.println("샤프로 씁니다");
//		System.out.printf("출력 : %s %s\n", w,s);
	}
	
}
class Pencil extends Moonbanggu
{
//	String p;
//	
//	public Pencil(String w, String p) {
//		super(w);
//		this.p = p;
//	}
	Pencil(){
		if(PencilCnt>=1)
		PencilCnt--;
	}
	

	//코드 완성
	@Override
	void write() {
		System.out.println("연필로 씁니다");
//		System.out.printf("출력 : %s %s\n", w,p);
	}
	
}
public class C04Prac {
	public static void Writing(Moonbanggu item) {
		item.write();
	}
	public static void ShowInfo() {
		System.out.printf("샤프재고량 : %d 연필 재고량 : %d\n", Moonbanggu.SharpenCnt,Moonbanggu.PencilCnt);
	}
	public static void main(String[] args) {
//		Sharpen item1 = new Sharpen("샤프로","씁니다");
//		Pencil item2 = new Pencil("연필로","씁니다");
		Sharpen item1 = new Sharpen();
		Pencil item2 = new Pencil();
		Writing(item1);	//"샤프로 씁니다" 가 출력
		Writing(item2); //"연필로 씁니다" 가 출력 
		ShowInfo();
	}
}
