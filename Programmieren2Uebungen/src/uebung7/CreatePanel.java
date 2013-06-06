package uebung7;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Graphics;
import java.awt.Point;
import java.util.LinkedList;

import javax.swing.JPanel;

public class CreatePanel extends JPanel {

	CreateMouseListener cml = new CreateMouseListener(this);
	CreateMouseMotionListener cmml = new CreateMouseMotionListener(this);
	CreateKeyListener ckl = new CreateKeyListener(this);
	private int objX, objY;
	private Point startPoint, endPoint;
	private final Point sizeOfObject;
	final FormPanel form;
	private final ColorPanel color;
	private final String string = "";
	private final LinkedList<GraphicPrimitive> graphicObjects;
	private GraphicPrimitive paintObject;
	private static final long serialVersionUID = 8396526597224128092L;

	public CreatePanel(final FormPanel form, final ColorPanel color) {

		this.setSize(super.getSize());
		this.setBackground(Color.LIGHT_GRAY);

		this.addMouseListener(cml);
		this.addMouseMotionListener(cmml);

		this.addKeyListener(ckl);
		this.setFocusable(true);
		this.requestFocusInWindow();

		this.form = form;
		this.color = color;
		this.setStartPoint(new Point());
		this.setEndPoint(new Point());
		this.sizeOfObject = new Point();
		this.graphicObjects = new LinkedList<GraphicPrimitive>();
		setCursor(Cursor.getPredefinedCursor(Cursor.CROSSHAIR_CURSOR));

	}

	@Override
	public void paintComponent(Graphics g) {

		super.paintComponent(g);

		for (GraphicPrimitive gp : this.getGraphicObjects()) {
			gp.paintComponent(g);
		}
		if (getPaintObject() != null)
			getPaintObject().paintComponent(g);
		repaint();
	}

	// GETTERS & SETTERS
	public FormPanel getForm() {
		return form;
	}

	public GraphicPrimitive getPaintObject() {
		return paintObject;
	}

	public void setPaintObject(GraphicPrimitive paintObject) {
		this.paintObject = paintObject;
	}

	public Point getSizeOfObject() {
		return sizeOfObject;
	}

	public int getObjX() {
		return objX;
	}

	public void setObjX(int objX) {
		this.objX = objX;
	}

	public int getObjY() {
		return objY;
	}

	public void setObjY(int objY) {
		this.objY = objY;
	}

	public ColorPanel getColor() {
		return color;
	}

	public Point getStartPoint() {
		return startPoint;
	}

	public void setStartPoint(Point startPoint) {
		this.startPoint = startPoint;
	}

	public Point getEndPoint() {
		return endPoint;
	}

	public void setEndPoint(Point endPoint) {
		this.endPoint = endPoint;
	}

	public String getString() {
		return string;
	}

	public LinkedList<GraphicPrimitive> getGraphicObjects() {
		return graphicObjects;
	}

	public CreateKeyListener getCkl() {
		return ckl;
	}

	public void setCkl(CreateKeyListener ckl) {
		this.ckl = ckl;
	}
}

/*
 * package uebung7;
 * 
 * import java.awt.Color; import java.awt.Graphics; import
 * java.awt.event.KeyAdapter; import java.awt.event.KeyEvent; import
 * java.awt.event.MouseAdapter; import java.awt.event.MouseEvent; import
 * java.awt.event.MouseMotionAdapter; import java.util.LinkedList;
 * 
 * import javax.swing.JPanel;
 * 
 * public class CreatePanel extends JPanel {
 *//**
 * 
 */
/*
 * private static final long serialVersionUID = -2620754216915196331L; private
 * ColorPanel col; private FormPanel create; private
 * LinkedList<GraphicPrimitive> objects;
 * 
 * enum State { OFF, MOVE_ACT, TEXT_ACT };
 * 
 * private State interact; private GraphicPrimitive actObject; private int actX,
 * actY, actW, actH; private MotionListener l; private KeyListener k;
 * 
 * public CreatePanel(ColorPanel c, FormPanel creat) { col = c; create = creat;
 * 
 * this.addMouseListener(new CreateListener()); objects = new
 * LinkedList<GraphicPrimitive>(); this.setBackground(Color.white);
 * setInteractionState(false); setMoveState(false, 0, 0);
 * 
 * }
 * 
 * public void setInteractionState(boolean onOff) {
 * 
 * if (onOff) { interact = State.MOVE_ACT; l = new MotionListener();
 * this.addMouseMotionListener(l); } else { interact = State.OFF; actX = actY =
 * 0; if (l != null) this.removeMouseMotionListener(l); if (actObject != null) {
 * objects.add(actObject); actObject = null; } } }
 * 
 * @Override public void paintComponent(Graphics g) { super.paintComponent(g);
 * 
 * // GraphikObjekte for (GraphicPrimitive o : objects) o.paintComponent(g);
 * 
 * if (interact != State.OFF) { actObject.paintComponent(g); }
 * 
 * }
 * 
 * class MotionListener extends MouseMotionAdapter {
 * 
 * @Override public void mouseDragged(MouseEvent m) { int x = m.getX(); int y =
 * m.getY();
 * 
 * if (actObject != null) {
 * 
 * if (actObject.getClass() == Line.class) { Line l = (Line) actObject;
 * l.setX2(x); l.setY2(y);
 * 
 * } else {
 * 
 * if ((x >= actX) && (y >= actY)) { actObject.setWidth(x - actX);
 * actObject.setHeight(y - actY);
 * 
 * }
 * 
 * if ((x >= actX) && (y < actY)) { actObject.setY(y); actObject.setWidth(x -
 * actX); actObject.setHeight(actY - y);
 * 
 * }
 * 
 * if ((x < actX) && (y < actY)) { actObject.setX(x); actObject.setY(y);
 * actObject.setWidth(actX - x); actObject.setHeight(actY - y);
 * 
 * }
 * 
 * if ((x < actX) && (y >= actY)) { actObject.setX(x); actObject.setWidth(actX -
 * x); actObject.setHeight(y - actY);
 * 
 * } } repaint();
 * 
 * } } }
 * 
 * class KeyListener extends KeyAdapter {
 * 
 * @Override public void keyTyped(KeyEvent e) {
 * 
 * Text t = (Text) actObject; char key = e.getKeyChar(); try { if (key == '\n')
 * setKeyState(false); else if (key == KeyEvent.VK_BACK_SPACE) t.deleteLast();
 * else if (key == KeyEvent.VK_ENTER) setKeyState(false); else t.append(key); }
 * catch (NullPointerException e1) {
 * 
 * } repaint();
 * 
 * } }
 * 
 * class CreateListener extends MouseAdapter {
 * 
 * @Override public void mousePressed(MouseEvent m) {
 * 
 * Color c = col.getSelectedColor();
 * 
 * if (create.getSelectedForm() == FormPanel.Form.RECTANGLE) actObject = new
 * Rectangle(m.getX(), m.getY(), 0, 0, c);
 * 
 * if (create.getSelectedForm() == FormPanel.Form.CIRCLE) actObject = new
 * Circle(m.getX(), m.getY(), 0, 0, c);
 * 
 * if (create.getSelectedForm() == FormPanel.Form.LINE) actObject = new
 * Line(m.getX(), m.getY(), c);
 * 
 * setInteractionState(true); actX = m.getX(); actY = m.getY();
 * 
 * }
 * 
 * @Override public void mouseReleased(MouseEvent m) {
 * 
 * setInteractionState(false); setMoveState(false, 0, 0); }
 * 
 * @Override public void mouseClicked(MouseEvent m) { Color c =
 * col.getSelectedColor(); GraphicPrimitive g = null; if (interact ==
 * State.TEXT_ACT) setKeyState(false);
 * 
 * if (create.getSelectedForm() == FormPanel.Form.RECTANGLE) g = new
 * Rectangle(m.getX(), m.getY(), 25, 30, c);
 * 
 * if (create.getSelectedForm() == FormPanel.Form.CIRCLE) g = new
 * Circle(m.getX(), m.getY(), 25, 25, c);
 * 
 * if (create.getSelectedForm() == FormPanel.Form.LINE) g = new Line(0, 0,
 * m.getX(), m.getY(), c);
 * 
 * if (create.getSelectedForm() == FormPanel.Form.STRING) { actObject = new
 * Text("", m.getX(), m.getY(), c); setKeyState(true); } if (g != null) {
 * objects.add(g); repaint(); }
 * 
 * }
 * 
 * }
 * 
 * public void setMoveState(boolean onOff, int x, int y) {
 * 
 * if (interact == State.TEXT_ACT) setKeyState(false);
 * 
 * if (onOff) { interact = State.MOVE_ACT; l = new MotionListener();
 * this.addMouseMotionListener(l); actX = x; actY = y; } else { interact =
 * State.OFF; actX = actY = 0; if (l != null) this.removeMouseMotionListener(l);
 * if (actObject != null) { objects.add(actObject); actObject = null; } }
 * 
 * }
 * 
 * public void setKeyState(boolean onOff) {
 * 
 * if (onOff) {
 * 
 * interact = State.TEXT_ACT; k = new KeyListener(); this.addKeyListener(k);
 * this.requestFocus(); } else {
 * 
 * interact = State.OFF; actX = actY = 0;
 * 
 * if (k != null) this.removeKeyListener(k);
 * 
 * if (actObject != null) { objects.add(actObject); actObject = null; }
 * 
 * } }
 * 
 * }
 */