package CH16;

interface C03Remocon {
	// 필드(final static)
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;

	// 기능(추상메서드)
	void turnOn();
	void turnOff();
	void setVolumn(int vol);
}

class C03TV implements C03Remocon {
	int vol;
	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다.");
	}
	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다.");
	}
	@Override
	public void setVolumn(int vol) {
		if(MAX_VOLUME<=vol) {
			this.vol=MAX_VOLUME;
		}
		else if(MIN_VOLUME>=vol) {
			this.vol=MIN_VOLUME;
		}
		else {
			this.vol=vol;
		}
		System.out.println("현재 TV Volumn : " + this.vol);
	}

}

interface SearchURL{
	void Search(String url);
}

class C03SmartTV extends C03TV implements SearchURL
{

	@Override
	public void Search(String url) {
		System.out.println(url+" 검색 시작합니다.");
		
	}
	
}

public class C03InterfaceMain {
	
	public static void TurnOn(C03Remocon controller) {
		controller.turnOn();
	}
	public static void TurnOff(C03Remocon controller) {
		controller.turnOff();
	}
	public static void SetVol(C03Remocon controller,int num) {
		controller.setVolumn(num);
	}
	public static void Search(SearchURL product,String url) {
		product.Search(url);
	}

	public static void main(String[] args) {
		
		C03SmartTV tv = new C03SmartTV();
		TurnOn(tv);
		SetVol(tv,5);
		Search(tv, "www.naver.com");
		
	}

}
