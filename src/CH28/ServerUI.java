package CH28;

import java.awt.Color;
import java.awt.event.*;
import javax.swing.*;

class Sgui extends JFrame implements ActionListener, KeyListener {	//이벤트추가 명령어

	JTextArea area;
	JScrollPane scroll;
	JTextField txt1;
	JButton btn1;
	JButton btn2;

	Sgui() {
		super("Chat Server"); // 프레임창 제목

		JPanel pannel = new JPanel(); // 패널 생성

		pannel.setLayout(null); // Layout 설정 x

		area = new JTextArea(); // 텍스트영역창
//		area.setBounds(10,10,260,240);		//스크롤 추가시 생략

		scroll = new JScrollPane(area); // area에 스크롤 추가하기
		scroll.setBounds(10, 10, 260, 240);

		txt1 = new JTextField(); // 텍스트알림창
		txt1.setBounds(10, 260, 260, 30); // 위치,크기 조정
		txt1.addKeyListener(this); //

		pannel.add(txt1);
//		pannel.add(area);
		pannel.add(scroll);

		add(pannel); // 프레임에 패널 추가

		setBounds(100, 100, 300, 350); // 프레임창 위치
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 종료버튼 사용가능상태
		setVisible(true); // 프레임창 보여주기
	}

	@Override
	public void actionPerformed(ActionEvent e) {

	}

	// 키를 땟을때(UNICODE지원)
	@Override
	public void keyTyped(KeyEvent e) {
		System.out.println("KEYTYPED함수 : " + e.getKeyChar());

	}

	// 키를 눌렀을때
	@Override
	public void keyPressed(KeyEvent e) {
		System.out.println("KEYPRESSED함수 : " + e.getKeyChar());
		System.out.println("KEYPRESSED함수 : " + e.getKeyCode());
		if (e.getKeyCode() == 10) {	//엔터키입력
			// 1 필드의 내용 -> Area
			area.append("[Server]  "+txt1.getText()+"\n");
			// 2 필드의 내용 삭제
			txt1.setText("");
		}

	}

	// 키를 땟을때(UNICODE미지원)
	@Override
	public void keyReleased(KeyEvent e) {
		System.out.println("KEYRELEASED함수 : " + e.getKeyChar());

	}
}

public class ServerUI {

	public static void main(String[] args) {
		new Sgui();

	}

}
