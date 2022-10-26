package CH24;

import javax.swing.JFrame;

public class C01Swing {

	public static void main(String[] args) {
		JFrame frame = new JFrame("첫번째 프레임창입니다.");
		frame.setBounds(100,100,800,600);	//x,y,width,height;
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);		//프레임창 표시여부

	}

}
