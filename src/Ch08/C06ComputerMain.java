package Ch08;

class C06Computer{
	String SerialNO;
	String CPUSpec;
	String RAMSpec;
	String DISKSpec;
	
	void PowerON(){
		System.out.println(SerialNO + "의 전원을 켭니다.");
	}
	void PowerOFF() {
		System.out.println(SerialNO + "의 전원을 끕니다.");
	}
	void ShowInfo(){
		System.out.printf("SerialNO : %s\nCPUSpec : %s\nRAMSpec : %s\nDISKSpec %s\n" ,SerialNO,CPUSpec,RAMSpec,DISKSpec);
	}
}

public class C06ComputerMain {

	public static void main(String[] args) {
		
		C06Computer LGGram1010 = new C06Computer();
		LGGram1010.SerialNO="1010";
		LGGram1010.CPUSpec="I7";
		LGGram1010.RAMSpec="16G";
		LGGram1010.DISKSpec="2TB";
				
		LGGram1010.PowerON();
		LGGram1010.ShowInfo();
		LGGram1010.PowerOFF();
		
	}

}
