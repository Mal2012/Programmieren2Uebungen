package uebung6;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JFrame;

public class Schachbrett extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Schachbrett() {
		init();
	}

	void init() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocation(100, 100);
		this.setSize(400, 400);

		Container c = this.getContentPane();
		GridLayout gl = new GridLayout(8, 8);
		getContentPane().setLayout(gl);
		this.setResizable(false);
		this.setVisible(true);
		int count = 1;

		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				c.add(new SchachbrettZelle(j + i, count));
				count++;
			}
		}
	}
}
