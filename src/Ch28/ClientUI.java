package Ch28;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.DataOutputStream;
import java.net.Socket;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

class Cgui extends JFrame implements ActionListener,KeyListener
{
	
	JTextArea area;
	JScrollPane scroll;
	JTextField txt1;
	//소켓 코드 추가
	Socket client;
	
	Cgui() throws Exception {
		super("Chat Client");	//프레임창 제목		
		JPanel pannel = new JPanel(); //패널 생성		
		pannel.setLayout(null);	//Layout 설정 x	

		area = new JTextArea();	//텍스트영역창
		area.setEditable(false);
		//area.setBounds(10,10,260,240);	//스크롤 추가시 생략	
		scroll = new JScrollPane(area); //area에 스크롤 추가하기
		scroll.setBounds(10,10,260,240);		

		txt1 = new JTextField();			//텍스트입력창 
		txt1.setBounds(10,260,260,30);		//크기
		txt1.addKeyListener(this);			//이벤트 추가(키보드)
	 

		pannel.add(txt1);
		//pannel.add(area);		//스크롤 추가시 생략
		pannel.add(scroll);
		
		add(pannel);			//프레임에 패널 추가
		
		setBounds(100,100,300,350);	//프레임창 위치
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //종료버튼 사용가능상태
		setVisible(true);	//프레임창 보여주기
		
		//소켓 코드 추가
		//1 서버로 연결 요청
		client = new Socket("ServerIP",7777);
		//2 수신 스레드 객체 생성
		ClientRecvThread recv = new ClientRecvThread(client,this);
		Thread th1 = new Thread(recv);	 
		//3 수신 스레드 실행
		th1.start();
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {	
	}

	//키를 뗏을때(UNICODE지원)
	@Override
	public void keyTyped(KeyEvent e) {
		//System.out.println("KEYTPYED함수 : " + e.getKeyChar());
		
	}
	//키를 눌렀을때
	@Override
	public void keyPressed(KeyEvent e) {
		//System.out.println("KEYPRESSED함수 : "+e.getKeyChar());
		//System.out.println("KEYPRESSED함수 : "+e.getKeyCode());
		if(e.getKeyCode()==10) //엔터키 입력
		{
			//Send작업
			try {
				DataOutputStream Dout=new DataOutputStream(client.getOutputStream());
				Dout.writeUTF(txt1.getText());
				Dout.flush();
			}catch(Exception e1) {
				e1.printStackTrace();
			}
			//1 필드의 내용 ->Area
			area.append("[Client] : "+txt1.getText()+"\n");
			//2 필드의 내용 삭제
			txt1.setText("");
			
		}
	}
	//키를 뗏을때(UNICODE 미지원)
	@Override
	public void keyReleased(KeyEvent e) {
		//System.out.println("KEYRELEASED함수 : "+e.getKeyChar());
		
	}

	 
}

public class ClientUI {

	public static void main(String[] args) throws Exception{
		new Cgui();
	}

}
