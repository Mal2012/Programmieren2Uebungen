package bimbfi;

import java.awt.Graphics;

import javax.swing.JPanel;

public class Test extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = -481118909264596112L;

	public Test() {
		this.setVisible(true);
	}

	// @Override
	// public void paint(Graphics g) {
	// g.drawString("Penis" + Math.random() * 10, 30, 30);
	// }

	@Override
	public void paintComponent(Graphics g) {
		g.drawString("test" + Math.random() * 10, 20, 20);
	}
}
