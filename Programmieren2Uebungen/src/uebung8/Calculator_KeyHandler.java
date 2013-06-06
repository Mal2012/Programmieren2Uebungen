package uebung8;

import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Calculator_KeyHandler extends KeyAdapter {
	private Calculator calc;

	public Calculator_KeyHandler(Calculator calc) {
		this.calc = calc;
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		super.keyTyped(e);
		if (e.getKeyChar() != '\n') {
			calc.action.actionPerformed(new ActionEvent(e, 0, ""
					+ e.getKeyChar(), 0));
		} else {
			calc.action.actionPerformed(new ActionEvent(e, 0, "=", 0));
		}

	}
}
