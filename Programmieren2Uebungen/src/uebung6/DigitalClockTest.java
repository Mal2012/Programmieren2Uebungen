package uebung6;

import javax.swing.JFrame;

public class DigitalClockTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame jf = new JFrame();
		jf.setSize(400, 110);
		jf.setResizable(false);
		jf.setVisible(true);
		jf.add(new DigitalClock());
	}
}
