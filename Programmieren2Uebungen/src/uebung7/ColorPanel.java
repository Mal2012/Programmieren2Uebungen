package uebung7;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JPanel;

public class ColorPanel extends JPanel implements MouseListener {

	Color[] colors = { Color.BLUE, Color.BLACK, Color.CYAN, Color.DARK_GRAY,
			Color.GRAY, Color.GREEN, Color.LIGHT_GRAY, Color.MAGENTA,
			Color.ORANGE, Color.PINK, Color.RED, Color.WHITE, Color.YELLOW };
	int select = 0;
	static final int XOFFSET = 70;
	static final int YOFFSET = 14;
	static final int ABSTAND = 30;

	public ColorPanel() {
		this.addMouseListener(this);
	}

	public Color getSelectedColor() {
		return colors[select];
	}

	@Override
	public void mouseClicked(MouseEvent m) {

		int x = m.getX();
		int y = m.getY();
		int xp = XOFFSET;
		int yp = YOFFSET;

		for (int i = 0; i < colors.length; i++) {
			if (x >= xp && (x <= xp + 25 + (i * ABSTAND)))
				if (y >= YOFFSET && y <= yp + 25) {
					select = i;

					break;
				}
		}
		this.repaint();
	}

	@Override
	public void mouseEntered(MouseEvent m) {

	}

	@Override
	public void mouseExited(MouseEvent m) {

	}

	@Override
	public void mousePressed(MouseEvent m) {

	}

	@Override
	public void mouseReleased(MouseEvent m) {

	}

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);

		int x = XOFFSET;
		for (int i = 0; i < colors.length; i++) {
			g.setColor(colors[i]);
			g.fillRect(x, YOFFSET, 25, 25);

			if (i == select) {

				if (i == 1)
					g.setColor(Color.RED); // bei schwarz roter Rand
				else
					g.setColor(Color.BLACK); // schwarzer Rand
				g.drawRect(x, YOFFSET, 25, 25); // Rand
				g.drawRect(x + 1, YOFFSET + 1, 23, 23); // Rand
			}
			x += ABSTAND;
		}
	}

}
