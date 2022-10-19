package CH16;

interface C01Remocon {
	// 필드(final static)
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;

	// 기능(추상메서드)
	void turnOn();
	void turnOff();
	void setVolumn(int vol);
}

class C01TV implements C01Remocon {
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

class C01Radio implements C01Remocon {
	int vol;
	@Override
	public void turnOn() {
		System.out.println("Radio를 켭니다.");
	}
	@Override
	public void turnOff() {
		System.out.println("Radio를 끕니다.");
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
		System.out.println("현재 Radio Volumn : " + this.vol);
	}

}

public class C01InterfaceMain {
	
	public static void TurnOn(C01Remocon controller) {
		controller.turnOn();
	}
	public static void TurnOff(C01Remocon controller) {
		controller.turnOff();
	}
	public static void SetVol(C01Remocon controller,int num) {
		controller.setVolumn(num);
	}

	public static void main(String[] args) {
		C01TV tv = new C01TV();
		C01Radio radio = new C01Radio();
		TurnOn(tv);
		TurnOn(radio);
		TurnOff(tv);
		TurnOff(radio);
		SetVol(tv, 7);
		SetVol(radio,11);
	}

}
