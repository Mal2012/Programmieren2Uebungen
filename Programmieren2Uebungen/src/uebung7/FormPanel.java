package uebung7;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class FormPanel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5948842337434201451L;

	enum Form {
		CIRCLE, RECTANGLE, LINE, STRING
	};

	Form createState;
	FormKeyListener fkl = new FormKeyListener(this);
	FormMouseListener fml = new FormMouseListener(this);
	static final int XOFFSET = 15;
	static final int YOFFSET = 30;
	static final int ABSTAND = 60;

	public FormPanel() {
		createState = Form.CIRCLE;
		this.addMouseListener(fml);
		this.addKeyListener(fkl);
		this.setFocusable(true);
		this.requestFocusInWindow();
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

		if (createState.ordinal() == 3) {
			g.setColor(Color.RED);
			g.drawRect(XOFFSET - 1, y + 3 * ABSTAND - 1, 27, 27);
			g.setColor(Color.BLACK);
		}
		g.drawRect(XOFFSET, y + 3 * ABSTAND, 25, 25);
		g.drawString("  AB", XOFFSET, y + 3 * ABSTAND + 19);
	}

	public Form getSelectedForm() {
		return createState;
	}

}
