package uebung8;

import javax.swing.JFrame;

public class TextEditor extends JFrame {

	Texteditor_View view;

	public TextEditor() {
		view = new Texteditor_View();

	}

	public static void main(String[] args) {
		JFrame.setDefaultLookAndFeelDecorated(true);
		TextEditor t = new TextEditor();
	}
}
