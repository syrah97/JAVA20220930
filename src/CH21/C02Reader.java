package CH21;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class C02Reader {

	public static void main(String[] args) throws Exception {
		
		
		Reader in = new FileReader("C:\\iotest\\test.txt");
		while(true)
		{
			int data=in.read();
			if(data==-1) {
				break;
			}
			System.out.print((char)data);
		}

	}

}
