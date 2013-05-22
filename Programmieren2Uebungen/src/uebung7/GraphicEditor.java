package uebung7;

import java.awt.Container;

import javax.swing.JFrame;

public class GraphicEditor {
	static ColorPanel col = new ColorPanel();
	static FormPanel create = new FormPanel();
	static CreatePanel editor = new CreatePanel(col, create);

	public static void main(String[] args) {
		JFrame wnd = new JFrame("GraphicEditor");
		wnd.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		wnd.setSize(800, 600);
		wnd.setLocation(100, 100);

		Container c = wnd.getContentPane();
		c.setLayout(null);

		col.setBounds(0, 0, 500, 55);

		create.setBounds(0, 55, 55, 450);

		editor.setBounds(60, 55, 700, 500);

		c.add(create);
		c.add(editor);
		c.add(col);

		wnd.setVisible(true);
	}

}
