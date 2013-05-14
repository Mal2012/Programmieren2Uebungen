package uebung7;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.util.LinkedList;

import javax.swing.JPanel;

public class CreatePanel extends JPanel {

	private ColorPanel col;
	private FormPanel create;
	private LinkedList<GraphicPrimitive> objects;

	private boolean interact;
	private GraphicPrimitive actObject;
	private int actX, actY, actW, actH;
	private MotionListener l;

	public CreatePanel(ColorPanel c, FormPanel creat) {
		col = c;
		create = creat;

		this.addMouseListener(new CreateListener());
		objects = new LinkedList<GraphicPrimitive>();
		this.setBackground(Color.white);
		setInteractionState(false);

	}

	public void setInteractionState(boolean onOff) {

		if (onOff) {
			interact = true;
			l = new MotionListener();
			this.addMouseMotionListener(l);
		} else {
			interact = false;
			actX = actY = 0;
			if (l != null)
				this.removeMouseMotionListener(l);
			if (actObject != null) {
				objects.add(actObject);
				actObject = null;
			}
		}
	}

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);

		// GraphikObjekte
		for (GraphicPrimitive o : objects)
			o.paintComponent(g);

		if (interact) {
			actObject.paintComponent(g);
		}

	}

	class MotionListener extends MouseMotionAdapter {

		@Override
		public void mouseDragged(MouseEvent m) {
			int x = m.getX();
			int y = m.getY();

			if (actObject != null) {

				if (actObject.getClass() == Line.class) {
					Line l = (Line) actObject;
					l.setX2(x);
					l.setY2(y);

				} else {
					// South East Direction
					if ((x >= actX) && (y >= actY)) {
						actObject.setWidth(x - actX);
						actObject.setHeight(y - actY);

					}

					// South North Direction
					if ((x >= actX) && (y < actY)) {
						actObject.setY(y);
						actObject.setWidth(x - actX);
						actObject.setHeight(actY - y);

					}

					// North East Direction
					if ((x < actX) && (y < actY)) {
						actObject.setX(x);
						actObject.setY(y);
						actObject.setWidth(actX - x);
						actObject.setHeight(actY - y);

					}

					// North West Direction
					if ((x < actX) && (y >= actY)) {
						actObject.setX(x);
						actObject.setWidth(actX - x);
						actObject.setHeight(y - actY);

					}
				}
				repaint();

			}
		}
	}

	class CreateListener extends MouseAdapter {

		@Override
		public void mousePressed(MouseEvent m) {

			Color c = col.getSelectedColor();

			if (create.getSelectedForm() == FormPanel.Form.RECTANGLE)
				actObject = new Rectangle(m.getX(), m.getY(), 0, 0, c);

			if (create.getSelectedForm() == FormPanel.Form.CIRCLE)
				actObject = new Circle(m.getX(), m.getY(), 0, 0, c);

			if (create.getSelectedForm() == FormPanel.Form.LINE)
				actObject = new Line(m.getX(), m.getY(), c);

			setInteractionState(true);
			actX = m.getX();
			actY = m.getY();

		}

		@Override
		public void mouseReleased(MouseEvent m) {

			setInteractionState(false);

		}

		@Override
		public void mouseClicked(MouseEvent m) {
			Color c = col.getSelectedColor();
			GraphicPrimitive g = null;

			if (create.getSelectedForm() == FormPanel.Form.RECTANGLE)
				g = new Rectangle(m.getX(), m.getY(), 25, 30, c);

			if (create.getSelectedForm() == FormPanel.Form.CIRCLE)
				g = new Circle(m.getX(), m.getY(), 25, 25, c);

			if (create.getSelectedForm() == FormPanel.Form.LINE)
				g = new Line(0, 0, m.getX(), m.getY(), c);

			if (g != null) {
				objects.add(g);
				repaint();
			}

		}

	}

}
