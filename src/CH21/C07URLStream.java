package CH21;

import java.io.*;
import java.net.URL;

public class C07URLStream {
	public static void main(String[] args) throws Exception {
		
		URL url = new URL("www.naver.com");
		InputStream in = url.openStream();	//기본 스트림
		BufferedInputStream bin = new BufferedInputStream(in);	//보조스트림(버퍼공간 추가)
		Reader r = new InputStreamReader(bin);	//보조스트림스트림1byte->문자형(2byte)으로 받음)
		
		OutputStream out = new FileOutputStream("c:\\iotest//imdex.html");
		Writer wout = new OutputStreamWriter(out);	//보조스트림(byte->char로 변경)
		while(true)
		{
			int data = r.read();
			if(data==-1) {
				break;
			}
			System.out.print((char)data);
		}

	}

}
