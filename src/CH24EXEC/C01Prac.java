package CH24EXEC;

import java.awt.Color;
import java.awt.event.*;
import javax.swing.*;

class C01GUI extends JFrame implements ActionListener, KeyListener
{
	JTextArea area;
	JScrollPane scroll;
	JTextField txt1;
	JButton btn1;
	JButton btn2;
	JButton btn3;
	JButton btn4;
	
	
	C01GUI() {
		super("Chatting Sever");	//프레임창 제목
		
		JPanel pannel = new JPanel();	//패널 생성
		
		pannel.setLayout(null);	//Layout 설정 x
		
		area = new JTextArea();	//텍스트영역창
//		area.setBounds(10,10,260,240);		//스크롤 추가시 생략
		
		scroll = new JScrollPane(area);		//area에 스크롤 추가하기
		scroll.setBounds(10,10,160,215);	//위치,크기 조정
		
		txt1 = new JTextField();			//텍스트알림창
		txt1.setBounds(10,235,160,35);		//위치,크기 조정
		txt1.addKeyListener(this);
		
		btn1 = new JButton("파일로저장");		//버튼 생성
		btn1.setBounds(175,10,110,35);		//버튼 위치,크기 조정
		btn1.addActionListener(this);
		
		btn2 = new JButton("1:1요청");		//버튼 생성
		btn2.setBounds(175,55,110,35);		//버튼 위치,크기 조정
		btn2.addActionListener(this);
		
		btn3 = new JButton("대화기록보기");		//버튼 생성
		btn3.setBounds(175,100,110,35);		//버튼 위치,크기 조정
		btn3.addActionListener(this);
		
		btn4 = new JButton("입력");			//버튼 생성
		btn4.setBounds(175,235,110,35);		//버튼 위치,크기 조정
		btn4.addActionListener(this);
		
		pannel.add(btn1);
		pannel.add(btn2);
		pannel.add(btn3);
		pannel.add(btn4);
		pannel.add(txt1);
//		pannel.add(area);
		pannel.add(scroll);
		
		add(pannel);		//프레임에 패널 추가
		
		setBounds(100,100,310,320);	//프레임창 위치
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	//종료버튼 사용가능상태
		setVisible(true);	//프레임창 보여주기
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btn1) {
			System.out.println("저장");
		}
		if (e.getSource() == btn2) {
			System.out.println("1:1요청");
		}
		if (e.getSource() == btn3) {
			System.out.println("대화기록");
		}
		if (e.getSource() == btn4) {
			System.out.println("입력");
		}
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		System.out.println("KEYTYPED함수 : " + e.getKeyChar());
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		System.out.println("KEYPRESSED함수 : " + e.getKeyChar());
		System.out.println("KEYPRESSED함수 : " + e.getKeyCode());
		if (e.getKeyCode() == 10) {	//엔터키입력
			// 1 필드의 내용 -> Area
			area.append("[ID]  "+txt1.getText()+"\n");
			// 2 필드의 내용 삭제
			txt1.setText("");
		}
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		System.out.println("KEYRELEASED함수 : " + e.getKeyChar());
		
	}

}

public class C01Prac {

	public static void main(String[] args) {
		new C01GUI();
		
	}

}
