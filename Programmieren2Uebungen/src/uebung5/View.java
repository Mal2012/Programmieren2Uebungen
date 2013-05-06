package uebung5;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class View extends JFrame {
	public JPanel jp = new JPanel();
	public JPanel jp2 = new JPanel();
	JList list = new JList();
	JButton btnNewButton_1 = new JButton("Autor");
	JButton btnNewButton = new JButton("Titel");
	JButton button = new JButton("ISBN");
	JButton send = new JButton("Einfügen");
	JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
	JFormattedTextField frmtdtxtfldAutor = new JFormattedTextField();
	JFormattedTextField frmtdtxtfldTitel = new JFormattedTextField();
	JFormattedTextField frmtdtxtfldIsbn = new JFormattedTextField();

	public View() {
		init();
	}

	private void init() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocation(100, 100);
		this.setSize(500, 407);
		getContentPane().setLayout(new GridLayout());
		this.jp.setSize(50, 50);
		jp.setLayout(null);
		this.jp2.setSize(50, 50);
		jp2.setLayout(null);
		tabbedPane.setBounds(29, 368, 205, 122);
		getContentPane().add(tabbedPane);
		tabbedPane.add(jp);
		tabbedPane.setTitleAt(0, "Bibliothek");
		tabbedPane.add(jp2);

		frmtdtxtfldAutor.setText("Autor");
		frmtdtxtfldAutor.setBounds(140, 11, 83, 20);
		jp2.add(frmtdtxtfldAutor);

		frmtdtxtfldTitel.setText("Titel");
		frmtdtxtfldTitel.setBounds(140, 42, 83, 20);
		jp2.add(frmtdtxtfldTitel);

		frmtdtxtfldIsbn.setText("ISBN");
		frmtdtxtfldIsbn.setBounds(140, 73, 83, 20);
		jp2.add(frmtdtxtfldIsbn);
		tabbedPane.setTitleAt(1, "Einfügen");
		list.setBounds(10, 59, 464, 276);
		jp.add(list);
		list.setVisibleRowCount(-1);
		btnNewButton_1.setBounds(10, 17, 70, 31);
		jp.add(btnNewButton_1);

		btnNewButton.setBounds(84, 17, 70, 31);
		jp.add(btnNewButton);

		button.setBounds(158, 17, 70, 31);
		jp.add(button);

		send.setBounds(140, 104, 83, 31);
		jp2.add(send);
		this.jp.setVisible(true);
	}
}
