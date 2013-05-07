package uebung6;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class Snowman extends JPanel {
	public Snowman() {
	}

	@Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		super.paintComponent(g);
		g.setColor(Color.BLACK);
		g.fillRect(210, 0, 50, 50);
		g.setColor(Color.WHITE);
		g.fillOval(185, 80, 100, 100);
		g.fillOval(140, 160, 200, 200);
		g.fillRect(40, 180, 400, 50);
		g.fillRect(170, 300, 50, 150);
		g.fillRect(260, 300, 50, 150);
		g.setColor(new Color(149, 69, 19));
		g.fillRect(170, 450, 50, 5);
		g.fillRect(260, 450, 50, 5);
		g.setColor(Color.BLACK);
		g.fillRect(160, 50, 150, 50);
		g.fillOval(240, 110, 20, 20);
		g.fillOval(205, 110, 20, 30);
		g.fillOval(230, 210, 20, 20);
		g.fillOval(230, 250, 20, 20);
		g.fillOval(230, 290, 20, 20);
		g.drawString("Winter is coming", 200, 245);
		g.setColor(Color.ORANGE);
		g.fillOval(225, 135, 20, 20);
		g.setColor(Color.BLUE);
		g.fillRect(410, 150, 10, 50);
		g.fillRect(410, 230, 10, 80);
	}
}
