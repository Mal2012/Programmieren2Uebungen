package uebung6;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;

import javax.swing.JPanel;

public class SchachbrettZelle extends JPanel {
	int zustand = 0;
	int count = 0;

	public SchachbrettZelle(int zustand, int count) {
		this.zustand = zustand;
		this.count = count;
		if (this.zustand % 2 == 0) {
			this.setBackground(Color.WHITE);
		} else {
			this.setBackground(Color.BLACK);
		}
	}

	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		super.paint(g);
		Font font = new Font("Courier New", Font.BOLD, 20);
		FontMetrics fm = g.getFontMetrics();
		int w = fm.stringWidth(String.valueOf(this.count));
		g.setFont(font);
		if (this.zustand % 2 == 0) {
			g.setColor(Color.BLACK);
		} else {
			g.setColor(Color.WHITE);
		}
		if (count < 10) {
			g.drawString("" + count, w + 12, 30);
		} else {
			g.drawString("" + count, w, 30);
		}
	}
}
