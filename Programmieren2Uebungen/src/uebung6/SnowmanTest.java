package uebung6;

import java.awt.Color;
import java.awt.Container;

import javax.swing.JFrame;

public class SnowmanTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame jf = new JFrame();
		Container container = jf.getContentPane();

		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setLocation(100, 100);
		jf.setSize(500, 500);
		jf.setVisible(true);

		Snowman sm = new Snowman();
		container.add(sm).setBackground(Color.GRAY);

	}
}
