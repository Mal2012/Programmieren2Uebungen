package uebung7;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import uebung7.FormPanel.Form;

public class FormKeyListener implements KeyListener {

	FormPanel fp;

	public FormKeyListener(FormPanel fp) {
		super();
		this.fp = fp;
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub

		switch (e.getKeyChar()) {
		case 'c':
			fp.createState = Form.CIRCLE;
			fp.repaint();
			break;
		case 'r':
			fp.createState = Form.RECTANGLE;
			fp.repaint();
			break;
		case 'l':
			fp.createState = Form.LINE;
			fp.repaint();
			break;
		case 't':
			fp.createState = Form.STRING;
			fp.removeKeyListener(fp.fkl);
			fp.repaint();
			break;
		}

	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

}
