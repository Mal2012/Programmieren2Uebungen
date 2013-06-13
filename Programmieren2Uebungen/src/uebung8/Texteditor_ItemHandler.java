package uebung8;

import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

class Texteditor_ItemHandler implements ItemListener {
	Texteditor_View view;

	public Texteditor_ItemHandler(Texteditor_View view) {
		this.view = view;
	}

	@Override
	public void itemStateChanged(ItemEvent e) {

		Font font = view.getT().getFont();
		String name = font.getName();
		int style = font.getStyle();
		int size = font.getSize();

		if (e.getSource() == view.getComboFont()) {
			String s = (String) view.getComboFont().getSelectedItem();
			Font f = new Font(s, style, size);
			view.getT().setFont(f);
		}
		if (e.getSource() == view.getComboSize()) {

			int s = Integer.valueOf((String) view.getComboSize()
					.getSelectedItem());
			view.getT().setFont(new Font(name, style, s));
		}
	}
}