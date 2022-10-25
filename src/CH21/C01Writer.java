package CH21;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class C01Writer {

	public static void main(String[] args) throws IOException {
		
//		Writer out = new FileWriter("C:\\iotest\\test.txt");		//덮어쓰기
		Writer out = new FileWriter("C:\\iotest\\test.txt",true);	//추가하기
		out.write("aaawef\n");
		out.write("bbbwef\n");
		out.write("cccwef\n");
		
		out.flush();	//버퍼 초기화
		out.close();	//스트림 제거

	}

}
