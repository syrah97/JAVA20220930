package CH24;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

class C05GUI extends JFrame implements ActionListener {
	
	JTextArea area;
	JScrollPane scroll;
	JTextField txt1;
	JButton btn1;
	JButton btn2;
	
	C05GUI() {
		super("다섯번쨰 프레임입니다."); // 프레임창 제목

		JPanel pannel = new JPanel(); // 패널 생성

		pannel.setLayout(null); // Layout 설정 x

		area = new JTextArea(); // 텍스트영역창
//		area.setBounds(10,10,260,240);		//스크롤 추가시 생략

		scroll = new JScrollPane(area); // area에 스크롤 추가하기
		scroll.setBounds(10, 10, 260, 240);

		txt1 = new JTextField(); // 텍스트알림창
		txt1.setBounds(10, 260, 260, 30);

		btn1 = new JButton("버튼1"); // 버튼 생성
		btn1.setBounds(10, 300, 120, 30); // 버튼 위치,크기 조정
		btn1.addActionListener(this); // 이벤트 추가

		btn2 = new JButton("버튼2"); // 버튼 생성
		btn2.setBounds(150, 300, 120, 30); // 버튼 위치,크기 조정
		btn2.addActionListener(this); // 이벤트 추가

		pannel.add(btn1);
		pannel.add(btn2);
		pannel.add(txt1);
//		pannel.add(area);
		pannel.add(scroll);

		add(pannel); // 프레임에 패널 추가

		setBounds(100, 100, 300, 400); // 프레임창 위치
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 종료버튼 사용가능상태
		setVisible(true); // 프레임창 보여주기
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btn1) {
			System.out.println("버튼 1 클릭함");
		}
		if (e.getSource() == btn2) {
			System.out.println("버튼 2 클릭함");
		}

	}
}

public class C05Swing {

	public static void main(String[] args) {
		new C05GUI();

	}

}
