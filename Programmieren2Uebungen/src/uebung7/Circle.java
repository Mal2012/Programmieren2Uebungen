package uebung7;

import java.awt.Color;
import java.awt.Graphics;

public class Circle extends GraphicPrimitive {

	public Circle(int x, int y, int w, int h, Color c) {
		super(x, y, w, h, c);
	}

	@Override
	public void paintComponent(Graphics g) {
		g.setColor(c);
		g.fillOval(x, y, width, height);
	}
}
