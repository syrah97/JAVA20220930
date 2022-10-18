package CH14EXEC;

//[1번] 다음 main() 메소드와 실행 결과를 참고하여 TV를 상속받은 ColorTV 클래스를 작성하라.


class TV{
	   private int size;
	   public TV(int size) { this.size = size; }
	   protected int getSize() { return size; }	   
	}

class ColorTV extends TV{	
	int color;
	public ColorTV(int size,int color) {
		super(size);
		this.color=color;
	}
	void printProperty() {
		System.out.printf("%d,%d\n", getSize(),color);
	}
	
}



public class C01Prac {

		public static void main(String[] args) {
			   ColorTV myTV = new ColorTV(32, 1024);
			   myTV.printProperty();
			}
}
