package CH24;

import javax.swing.JFrame;

class C03GUI extends JFrame{
	C03GUI() {
		super("두번쨰 프레임입니다.");
		setBounds(100,100,800,600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
}

public class C03Swing {

	public static void main(String[] args) {
		new C03GUI();
		
	}

}
