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
	}

	@Override
	public void keyReleased(KeyEvent e) {
	}

	@Override
	public void keyTyped(KeyEvent e) {
		if (cp.getForm().getSelectedForm() == Form.STRING) {
			Text tmp = (Text) cp.getPaintObject();
			if (e.getKeyChar() == KeyEvent.VK_ENTER)
				cp.setPaintObject(new Text(cp.getString(),
						cp.getStartPoint().x, cp.getStartPoint().y, cp
								.getColor().getSelectedColor()));
			else if (e.getKeyChar() == KeyEvent.VK_BACK_SPACE)
				tmp.deleteLast();
			else
				tmp.append(e.getKeyChar());
			cp.repaint();
		}
	}
}
