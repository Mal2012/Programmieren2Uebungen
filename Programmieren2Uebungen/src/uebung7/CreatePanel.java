package uebung7;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.util.LinkedList;

import javax.swing.JPanel;

public class CreatePanel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2620754216915196331L;
	private ColorPanel col;
	private FormPanel create;
	private LinkedList<GraphicPrimitive> objects;

	enum State {
		OFF, MOVE_ACT, TEXT_ACT
	};

	private State interact;
	private GraphicPrimitive actObject;
	private int actX, actY, actW, actH;
	private MotionListener l;
	private KeyListener k;

	public CreatePanel(ColorPanel c, FormPanel creat) {
		col = c;
		create = creat;

		this.addMouseListener(new CreateListener());
		objects = new LinkedList<GraphicPrimitive>();
		this.setBackground(Color.white);
		setInteractionState(false);
		setMoveState(false, 0, 0);

	}

	public void setInteractionState(boolean onOff) {

		if (onOff) {
			interact = State.MOVE_ACT;
			l = new MotionListener();
			this.addMouseMotionListener(l);
		} else {
			interact = State.OFF;
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

		if (interact != State.OFF) {
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

					if ((x >= actX) && (y >= actY)) {
						actObject.setWidth(x - actX);
						actObject.setHeight(y - actY);

					}

					if ((x >= actX) && (y < actY)) {
						actObject.setY(y);
						actObject.setWidth(x - actX);
						actObject.setHeight(actY - y);

					}

					if ((x < actX) && (y < actY)) {
						actObject.setX(x);
						actObject.setY(y);
						actObject.setWidth(actX - x);
						actObject.setHeight(actY - y);

					}

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

	class KeyListener extends KeyAdapter {
		@Override
		public void keyTyped(KeyEvent e) {

			Text t = (Text) actObject;
			char key = e.getKeyChar();
			try {
				if (key == '\n')
					setKeyState(false);
				else if (key == KeyEvent.VK_BACK_SPACE)
					t.deleteLast();
				else if (key == KeyEvent.VK_ENTER)
					setKeyState(false);
				else
					t.append(key);
			} catch (NullPointerException e1) {

			}
			repaint();

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
			setMoveState(false, 0, 0);
		}

		@Override
		public void mouseClicked(MouseEvent m) {
			Color c = col.getSelectedColor();
			GraphicPrimitive g = null;
			if (interact == State.TEXT_ACT)
				setKeyState(false);

			if (create.getSelectedForm() == FormPanel.Form.RECTANGLE)
				g = new Rectangle(m.getX(), m.getY(), 25, 30, c);

			if (create.getSelectedForm() == FormPanel.Form.CIRCLE)
				g = new Circle(m.getX(), m.getY(), 25, 25, c);

			if (create.getSelectedForm() == FormPanel.Form.LINE)
				g = new Line(0, 0, m.getX(), m.getY(), c);

			if (create.getSelectedForm() == FormPanel.Form.STRING) {
				actObject = new Text("", m.getX(), m.getY(), c);
				setKeyState(true);
			}
			if (g != null) {
				objects.add(g);
				repaint();
			}

		}

	}

	public void setMoveState(boolean onOff, int x, int y) {

		if (interact == State.TEXT_ACT)
			setKeyState(false);

		if (onOff) {
			interact = State.MOVE_ACT;
			l = new MotionListener();
			this.addMouseMotionListener(l);
			actX = x;
			actY = y;
		} else {
			interact = State.OFF;
			actX = actY = 0;
			if (l != null)
				this.removeMouseMotionListener(l);
			if (actObject != null) {
				objects.add(actObject);
				actObject = null;
			}
		}

	}

	public void setKeyState(boolean onOff) {

		if (onOff) {

			interact = State.TEXT_ACT;
			k = new KeyListener();
			this.addKeyListener(k);
			this.requestFocus();
		} else {

			interact = State.OFF;
			actX = actY = 0;

			if (k != null)
				this.removeKeyListener(k);

			if (actObject != null) {
				objects.add(actObject);
				actObject = null;
			}

		}
	}

}
