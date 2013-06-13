package uebung8;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.font.TextAttribute;
import java.util.Map;

import javax.swing.AbstractAction;
import javax.swing.ImageIcon;

public class Texteditor_UnderlinedCommand extends AbstractAction {

	Texteditor_View view;

	public Texteditor_UnderlinedCommand(String text, ImageIcon icon,
			String desc, Integer mnemonic, Texteditor_View view) {
		super(text, icon);
		this.view = view;
		putValue(SHORT_DESCRIPTION, desc);
		putValue(MNEMONIC_KEY, mnemonic);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		Font font = view.getT().getFont();
		Map m = font.getAttributes();

		if (this.enabled) {

			this.enabled = false;
			m.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
			view.getT().setFont(view.getT().getFont().deriveFont(m));
		} else {

			this.enabled = true;
			m.put(TextAttribute.UNDERLINE, ~TextAttribute.UNDERLINE_ON);
			view.getT().setFont(view.getT().getFont().deriveFont(m));
		}

	}
}
