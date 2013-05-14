package uebung7;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JPanel;

public class FormPanel extends JPanel implements MouseListener {

	enum Form {
		CIRCLE, RECTANGLE, LINE
	};

	Form createState;
	static final int XOFFSET = 15;
	static final int YOFFSET = 30;
	static final int ABSTAND = 60;

	public FormPanel() {
		createState = Form.CIRCLE;
		this.addMouseListener(this);
	}

	public Form getSelectedForm() {
		return createState;
	}

	@Override
	public void mouseClicked(MouseEvent m) {
		int x = m.getX();
		int y = m.getY();
		int xp = XOFFSET;
		int yp = YOFFSET;

		for (int i = 0; i < Form.values().length; i++) {
			if (x >= xp && (x <= xp + 25))
				if (y >= YOFFSET && y <= yp + 25 + (i * ABSTAND)) {
					createState = Form.values()[i];
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

		int y = YOFFSET;
		g.setColor(Color.black);

		g.drawOval(XOFFSET, y, 25, 25);

		if (createState.ordinal() == 0) {
			g.setColor(Color.RED);
			g.drawRect(XOFFSET - 1, y - 1, 27, 27);
			g.setColor(Color.BLACK);
		}

		if (createState.ordinal() == 1) {
			g.setColor(Color.RED);
			g.drawRect(XOFFSET - 1, y + ABSTAND - 1, 27, 27);
			g.setColor(Color.BLACK);
		}
		g.drawRect(XOFFSET, y + ABSTAND, 25, 25);

		if (createState.ordinal() == 2) {
			g.setColor(Color.RED);
			g.drawRect(XOFFSET - 1, y + 2 * ABSTAND - 1, 27, 27);
			g.setColor(Color.BLACK);
		}
		g.drawRect(XOFFSET, y + 2 * ABSTAND, 25, 25);
		g.drawLine(XOFFSET, y + 2 * ABSTAND, XOFFSET + 25, y + 2 * ABSTAND + 25);

	}

}
