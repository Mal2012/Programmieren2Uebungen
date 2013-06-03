package uebung7;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import uebung7.FormPanel.Form;

public class FormMouseListener implements MouseListener {

	FormPanel fp;

	public FormMouseListener(FormPanel fp) {
		super();
		this.fp = fp;
	}

	@Override
	public void mouseClicked(MouseEvent m) {
		int x = m.getX();
		int y = m.getY();
		int xp = fp.XOFFSET;
		int yp = fp.YOFFSET;

		for (int i = 0; i < Form.values().length; i++) {
			if (x >= xp && (x <= xp + 25))
				if (y >= fp.YOFFSET && y <= yp + 25 + (i * fp.ABSTAND)) {
					fp.createState = Form.values()[i];
					if (fp.createState.ordinal() == 3) {
						fp.removeKeyListener(fp.fkl);
					} else {
						fp.addKeyListener(fp.fkl);
					}
					break;
				}
		}
		fp.repaint();
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
}
