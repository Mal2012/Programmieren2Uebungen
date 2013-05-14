package uebung7;

import java.awt.Color;
import java.awt.Graphics;

public class Rectangle extends GraphicPrimitive {

	public Rectangle(int x, int y, int w, int h, Color c) {
		super(x, y, w, h, c);
	}

	@Override
	public void paintComponent(Graphics g) {
		g.setColor(c);
		g.fillRect(x, y, width, height);
	}
}
