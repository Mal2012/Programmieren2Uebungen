package bimbfi;

import java.awt.Container;

import javax.swing.JFrame;

public class TestTest extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6634579648966584768L;

	public TestTest() {
		Container c = getContentPane();
		this.setDefaultLookAndFeelDecorated(true);
		this.setBounds(10, 10, 200, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		c.add(new Test());

		this.setVisible(true);
	}

	public static void main(String[] args) {
		TestTest t = new TestTest();

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t.repaint();
	}
}
