package CH24;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

class C04GUI extends JFrame
{
	C04GUI() {
		super("두번쨰 프레임입니다.");	//프레임창 제목
		
		JPanel pannel = new JPanel();	//패널 생성
		
		pannel.setLayout(null);	//Layout 설정 x
		
		JButton btn1 = new JButton("버튼1");	//버튼 생성
		JButton btn2 = new JButton("버튼2");
		
		btn1.setBounds(10,10,120,50);		//버튼 위치,크기 조정
		btn2.setBounds(150,10,120,50);
		
		pannel.add(btn1);
		pannel.add(btn2);
		
		add(pannel);		//프레임에 패널 추가
		
		setBounds(100,100,800,600);	//프레임창 위치
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	//종료버튼 사용가능상태
		setVisible(true);	//프레임창 보여주기
	}
}

public class C04Swing {

	public static void main(String[] args) {
		new C04GUI();
		
	}

}
