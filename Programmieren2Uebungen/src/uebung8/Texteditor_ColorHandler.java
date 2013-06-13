package uebung8;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Texteditor_ColorHandler implements ActionListener {
	Texteditor_View view;

	public Texteditor_ColorHandler(Texteditor_View view) {
		this.view = view;
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == view.getBlueMenuItem())
			view.getT().setForeground(Color.BLUE);
		if (e.getSource() == view.getYellowMenuItem())
			view.getT().setForeground(Color.YELLOW);
		if (e.getSource() == view.getBlackMenuItem())
			view.getT().setForeground(Color.BLACK);
	}
}