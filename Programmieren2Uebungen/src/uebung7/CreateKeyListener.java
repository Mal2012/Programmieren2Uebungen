package uebung7;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import uebung7.FormPanel.Form;

public class CreateKeyListener implements KeyListener {
	CreatePanel cp;

	public CreateKeyListener(CreatePanel cp) {
		// TODO Auto-generated constructor stub
		this.cp = cp;
	}

	@Override
	public void keyPressed(KeyEvent e) {
		switch (e.getKeyChar()) {
		case 'c':
			cp.form.createState = Form.CIRCLE;
			cp.form.repaint();
			break;
		case 'r':
			cp.form.createState = Form.RECTANGLE;
			cp.form.repaint();
			break;
		case 'l':
			cp.form.createState = Form.LINE;
			cp.form.repaint();
			break;
		case 't':
			cp.form.createState = Form.STRING;
			cp.form.repaint();
			break;
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
	}

	@Override
	public void keyTyped(KeyEvent e) {
		if (cp.getForm().getSelectedForm() == Form.STRING) {
			Text tmp = new Text("", cp.getStartPoint().x, cp.getStartPoint().y,
					cp.getColor().getSelectedColor());
			try {
				tmp = (Text) cp.getPaintObject();
			} catch (Exception cle) {

			}
			if (e.getKeyChar() == KeyEvent.VK_ENTER) {
				cp.setPaintObject(new Text(cp.getString(),
						cp.getStartPoint().x, cp.getStartPoint().y, cp
								.getColor().getSelectedColor()));
			} else if (e.getKeyChar() == KeyEvent.VK_BACK_SPACE) {
				tmp.deleteLast();
			} else {
				tmp.append(e.getKeyChar());
			}
			cp.repaint();
		}
	}
}
