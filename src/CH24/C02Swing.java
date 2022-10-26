package CH24;

import javax.swing.JFrame;

class C02GUI extends JFrame{
	C02GUI() {
		super("두번쨰 프레임입니다.");
		setBounds(100,100,800,600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
}

public class C02Swing {

	public static void main(String[] args) {
		new C02GUI();

	}

}
