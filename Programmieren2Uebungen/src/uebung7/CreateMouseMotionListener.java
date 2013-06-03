package uebung7;

import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import uebung7.FormPanel.Form;

public class CreateMouseMotionListener implements MouseMotionListener {
	CreatePanel cp;

	public CreateMouseMotionListener(CreatePanel cp) {
		// TODO Auto-generated constructor stub
		this.cp = cp;
	}

	@Override
	public void mouseDragged(MouseEvent e) {

		cp.setEndPoint(e.getPoint());

		cp.getSizeOfObject().x = Math.abs(cp.getStartPoint().x
				- cp.getEndPoint().x);
		cp.getSizeOfObject().y = Math.abs(cp.getStartPoint().y
				- cp.getEndPoint().y);

		cp.setObjX(Math.min(cp.getStartPoint().x, cp.getEndPoint().x));
		cp.setObjY(Math.min(cp.getStartPoint().y, cp.getEndPoint().y));

		if (cp.getForm().getSelectedForm() == Form.CIRCLE)
			cp.setPaintObject(new Circle(cp.getObjX(), cp.getObjY(), cp
					.getSizeOfObject().x, cp.getSizeOfObject().y, cp.getColor()
					.getSelectedColor()));
		else if (cp.getForm().getSelectedForm() == Form.RECTANGLE)
			cp.setPaintObject(new Rectangle(cp.getObjX(), cp.getObjY(), cp
					.getSizeOfObject().x, cp.getSizeOfObject().y, cp.getColor()
					.getSelectedColor()));
		else if (cp.getForm().getSelectedForm() == Form.LINE)
			cp.setPaintObject(new Line(cp.getStartPoint().x,
					cp.getStartPoint().y, cp.getEndPoint().x,
					cp.getEndPoint().y, cp.getColor().getSelectedColor()));
		cp.repaint();
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		/*
		 * if (cp.form.getSelectedForm() == Form.CLEAR) {
		 * cp.graphicObjects.clear(); cp.paintObject = null; } cp.repaint();
		 */
	}
}
