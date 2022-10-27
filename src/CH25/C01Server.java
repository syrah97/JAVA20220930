package CH25;

import java.io.*;
import java.net.*;

public class C01Server {

	public static void main(String[] args) throws Exception {
		
		ServerSocket server = new ServerSocket(5050); //192.168.3.124:5050
		System.out.println("Server Start!!..");
		Socket client =server.accept();
		
		OutputStream out = client.getOutputStream();
		DataOutputStream Dout = new DataOutputStream(out);
		Dout.writeUTF("Server접속이 확인되었습니다.");
		Dout.flush();
		server.close();
		client.close();

	}

}
