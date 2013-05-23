package uebung6;

import java.awt.Color;
import java.awt.Container;

import javax.swing.JFrame;

public class GraphikBeispiel {

	public static void main(String[] args) {

		JFrame wnd = new JFrame("GraphikBeispiel");
		wnd.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		wnd.setSize(500, 650);
		wnd.setLocation(50, 50);

		Container c = wnd.getContentPane();
		c.setLayout(null);
		c.setBackground(Color.gray);
		DigitalClock d = new DigitalClock();
		d.setBounds(50, 500, 392, 80);

		Snowman sn = new Snowman();
		sn.setBounds(10, 10, 450, 500);

		GifImage gi = new GifImage();
		gi.setBounds(20, 20, 140, 140);

		GifImage gi2 = new GifImage();
		gi2.setBounds(20, 320, 140, 140);
		c.add(gi).setBackground(Color.GRAY);
		c.add(gi2).setBackground(Color.GRAY);
		c.add(d);
		c.add(sn).setBackground(Color.GRAY);

		wnd.setVisible(true);
	}
}