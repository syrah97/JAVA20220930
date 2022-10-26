package CH24;

import java.awt.Color;

import javax.swing.*;

class C05GUI extends JFrame
{
	C05GUI() {
		super("Chatting Sever");	//프레임창 제목
		
		JPanel pannel = new JPanel();	//패널 생성
		
		pannel.setLayout(null);	//Layout 설정 x
		
		JTextArea area = new JTextArea();	//텍스트영역창
//		area.setBounds(10,10,260,240);		//스크롤 추가시 생략
		
		JScrollPane scroll = new JScrollPane(area);	//area에 스크롤 추가하기
		scroll.setBounds(10,10,170,190);
		
		JTextField txt1 = new JTextField();	//텍스트알림창
		txt1.setBounds(10,210,170,35);
		
		JButton btn1 = new JButton("버튼1");	//버튼 생성
		btn1.setBounds(190,210,70,35);		//버튼 위치,크기 조정
		
		JButton btn2 = new JButton("버튼2");	//버튼 생성
		btn2.setBounds(190,10,70,35);		//버튼 위치,크기 조정
		
		JButton btn3 = new JButton("버튼3");	//버튼 생성
		btn3.setBounds(190,50,70,35);		//버튼 위치,크기 조정
		
		JButton btn4 = new JButton("버튼4");	//버튼 생성
		btn4.setBounds(190,90,70,35);		//버튼 위치,크기 조정
		
		pannel.add(btn1);
		pannel.add(btn2);
		pannel.add(btn3);
		pannel.add(btn4);
		pannel.add(txt1);
//		pannel.add(area);
		pannel.add(scroll);
		
		add(pannel);		//프레임에 패널 추가
		
		setBounds(100,100,280,300);	//프레임창 위치
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	//종료버튼 사용가능상태
		setVisible(true);	//프레임창 보여주기
	}
}

public class C05Swing {

	public static void main(String[] args) {
		new C05GUI();
		
	}

}
