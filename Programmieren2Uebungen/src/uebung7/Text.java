package uebung7;

import java.awt.Color;
import java.awt.Graphics;

public class Text extends GraphicPrimitive {

	private StringBuffer s;

	public Text(String s, int x, int y, Color c) {
		super(x, y, 0, 0, c);
		this.s = new StringBuffer(s);
	}

	@Override
	public void paintComponent(Graphics g) {
		g.setColor(c);
		if (s != null)
			g.drawString(s.toString(), x, y);
	}

	public String getS() {
		return s.toString();
	}

	public void append(char c) {
		s.append(c);
	}

	public void deleteLast() {

		if (s.length() - 1 >= 0)
			s.deleteCharAt(s.length() - 1);
	}
}
