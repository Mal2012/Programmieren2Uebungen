package uebung7;

import java.awt.Color;
import java.awt.Graphics;

public abstract class GraphicPrimitive {
	protected int x, y, width, height;
	protected Color c;

	public GraphicPrimitive(int x, int y, int w, int h, Color c) {
		this.x = x;
		this.y = y;
		this.width = w;
		this.height = h;
		this.c = c;
	}

	public void setColor(Color c) {
		this.c = c;
	}

	/*
	 * public boolean isInside(int x, int y) { if (x >= this.x && x <=
	 * this.x+width) if (y>= this.y && y <= this.y+height) return true; return
	 * false; }
	 */

	public abstract void paintComponent(Graphics g);

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

}
