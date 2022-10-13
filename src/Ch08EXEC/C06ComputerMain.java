package Ch08EXEC;


public class C06ComputerMain {

	public static void main(String[] args) {
		
		C06computer LGGram1010 = new C06computer();
		LGGram1010.SerialNO="1010";
		LGGram1010.CPUSpec="I7";
		LGGram1010.RAMSpec="16G";
		LGGram1010.DISKSpec="2TB";
				
		LGGram1010.PowerON();
		LGGram1010.ShowInfo();
		LGGram1010.PowerOFF();
		
	}

}
