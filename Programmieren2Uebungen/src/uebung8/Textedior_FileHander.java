package uebung8;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Texteditor_FileHandler implements ActionListener {

	Texteditor_View view;

	public Texteditor_FileHandler(Texteditor_View view) {
		this.view = view;
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == view.getSaveMenuItem())
			System.out.println("TODO save");
		if (e.getSource() == view.getOpenMenuItem())
			System.out.println("TODO open");
		if (e.getSource() == view.getCloseMenuItem())
			System.out.println("TODO close");
	}
}
