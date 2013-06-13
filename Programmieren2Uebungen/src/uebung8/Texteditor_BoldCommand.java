package uebung8;

import java.awt.Font;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.ImageIcon;

public class Texteditor_BoldCommand extends AbstractAction {
	Texteditor_View view;
	/**
	 * 
	 */
	private static final long serialVersionUID = 5450114667628814118L;

	public Texteditor_BoldCommand(String text, ImageIcon icon, String desc,
			Integer mnemonic, Texteditor_View view) {
		super(text, icon);
		this.view = view;
		putValue(SHORT_DESCRIPTION, desc);
		putValue(MNEMONIC_KEY, mnemonic);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (this.enabled) {

			this.enabled = false;

			Font font = view.getT().getFont();
			int style = font.getStyle();
			style |= Font.BOLD;
			view.getT()
					.setFont(new Font(font.getName(), style, font.getSize()));
		} else {

			this.enabled = true;

			Font font = view.getT().getFont();
			int style = font.getStyle();
			style &= ~Font.BOLD;
			view.getT()
					.setFont(new Font(font.getName(), style, font.getSize()));
		}

	}

}
