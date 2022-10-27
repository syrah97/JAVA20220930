package CH27;

import java.net.ServerSocket;
import java.net.Socket;

public class ServerChat {

	public static void main(String[] args) throws Exception {
		
		//1
		ServerSocket server = new ServerSocket(9999);
		System.out.println("서비스 실행...!");
		
		//2
		Socket client = server.accept();
		System.out.println(client.getInetAddress()+" 에서 접속!");
		
		//3 송수신 스레드객체 생성
		
		//4 스레드 실행

	}

}
