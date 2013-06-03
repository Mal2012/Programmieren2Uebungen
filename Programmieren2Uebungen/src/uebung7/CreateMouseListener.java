package uebung7;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import uebung7.FormPanel.Form;

public class CreateMouseListener implements MouseListener {
	CreatePanel cp;

	public CreateMouseListener(CreatePanel cp) {
		super();
		this.cp = cp;
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		cp.setStartPoint(e.getPoint());
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

		if (cp.getForm().getSelectedForm() == Form.CIRCLE) {
			cp.setPaintObject(new Circle(cp.getObjX(), cp.getObjY(), cp
					.getSizeOfObject().x, cp.getSizeOfObject().y, cp.getColor()
					.getSelectedColor()));
		} else if (cp.getForm().getSelectedForm() == Form.RECTANGLE) {
			cp.setPaintObject(new Rectangle(cp.getObjX(), cp.getObjY(), cp
					.getSizeOfObject().x, cp.getSizeOfObject().y, cp.getColor()
					.getSelectedColor()));
		} else if (cp.getForm().getSelectedForm() == Form.LINE) {
			cp.setPaintObject(new Line(cp.getStartPoint().x,
					cp.getStartPoint().y, cp.getEndPoint().x,
					cp.getEndPoint().y, cp.getColor().getSelectedColor()));
		} else if (cp.getForm().getSelectedForm() == Form.STRING) {
			cp.setPaintObject(new Text(cp.getString(), cp.getStartPoint().x, cp
					.getStartPoint().y, cp.getColor().getSelectedColor()));
		}
		if (cp.getPaintObject() != null) {
			cp.getGraphicObjects().add(cp.getPaintObject());
			cp.repaint();
		}
	}

}
