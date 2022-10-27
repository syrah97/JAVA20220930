package CH25;

import java.io.*;
import java.net.*;

public class C01Server {

	public static void main(String[] args) throws Exception {
		
		ServerSocket server = new ServerSocket(5050); //192.168.3.124:5050
		System.out.println("Server Start!!..");
		
		while(true) {
			Socket client =server.accept();
			System.out.println(client.getInetAddress()+"에서 접속하셨습니다.");
			OutputStream out = client.getOutputStream();
			DataOutputStream Dout = new DataOutputStream(out);
			Dout.writeUTF("Server접속이 확인되었습니다.");
			Dout.flush();
			client.close();	
		}
		
//		Socket client =server.accept();
//		OutputStream out = client.getOutputStream();
//		DataOutputStream Dout = new DataOutputStream(out);
//		Dout.writeUTF("Server접속이 확인되었습니다.");
//		Dout.flush();
//		server.close();
//		client.close();	
	}

}
