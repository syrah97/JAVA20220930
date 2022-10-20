package CH16;
interface Soundable{
	//추상메서드
	String sound();
}
class C03Dog implements Soundable
{
	@Override
	public String sound() {
		return "멍멍";
	}	
}
class C03Cat implements Soundable
{
	@Override
	public String sound() {
		return "야옹";
	}
	
}
public class C04InterfaceMain {
	
	public static void main(String[] args) {
		
		printSound(new C03Cat());
		printSound(new C03Dog());
	}
	private static void printSound(Soundable soundable) 
	{
	System.out.println(soundable.sound());
	}
}
//다음은 Soundable 인터페이스입니다 sound() 추상 메소드는 객체의 소리를 리턴합니다
//
//------------------------------------
//Soundable Interface
//------------------------------------
//public interface Soundable{
//	String sound();
//}
//SoundableExample 클래스에서 printSound() 메소드는 Soundable 인터페이스 타입의
//매개 변수를 가지고 있습니다
//main()메소드에서 printSound()를 호출할 떄 Cat과 Dog 객체를 주고 실행하면 각각 "야옹"
//과 "멍멍"이 출력되도록 Cat과 Dog 클래스를 작성해보세요
//------------------------------------
//SoundableExample.java
//------------------------------------
//public class SoundableExample{
//	private static void PrintSound(Soundable soundable) {
//		System.out.println(soundable.sound());
//	}
//	
//	public static void main(String[] args){
//		printSound(new Cat());
//		printSound(new Dog());
//	}
//}
