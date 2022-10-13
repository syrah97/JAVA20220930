package Ch08EXEC;

class C06computer{
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


