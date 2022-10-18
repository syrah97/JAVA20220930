package CH14;

class Animal{
	public void Sound() {
		System.out.println("소리를 냅니다");
	}
}
class Dog extends Animal{
	public void Sound() {
		System.out.println("멍멍 소리를 냅니다");
	}
}
class Cat extends Animal{
	public void Sound() {
		System.out.println("야옹 소리를 냅니다");
	}
}

public class C03Overriding {
	public static void main(String[] args) {
		Dog Poppi = new Dog();
		Cat Yummi = new Cat();
		
		Poppi.Sound();
		Yummi.Sound();

	}

}
