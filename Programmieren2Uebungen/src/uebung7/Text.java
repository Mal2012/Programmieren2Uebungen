package uebung7;

import java.awt.Color;
import java.awt.Graphics;

public class Text extends GraphicPrimitive {

	private String s;

	public Text(int x, int y, int w, int h, Color c) {
		super(x, y, 0, 0, c);
	}

	@Override
	public void paintComponent(Graphics g) {
		g.setColor(c);
		if (s != null)
			g.drawString(s, x, y);
	}
}
