package uebung7;

import java.awt.Color;
import java.awt.Graphics;

public class Line extends GraphicPrimitive {

	protected int x2, y2;

	public Line(int x, int y, Color c) {
		super(x, y, 0, 0, c);

	}

	public Line(int x1, int y1, int x2, int y2, Color c) {
		super(x1, y1, Math.abs(x2 - x1), Math.abs(y2 - y1), c);
		this.x2 = x2;
		this.y2 = y2;

	}

	public void setX2(int x2) {
		this.x2 = x2;

	}

	public void setY2(int y2) {
		this.y2 = y2;

	}

	public int getX2() {
		return x2;
	}

	public int getY2() {
		return y2;
	}

	@Override
	public void paintComponent(Graphics g) {
		g.setColor(c);
		g.drawLine(x, y, x2, y2);
	}
}
