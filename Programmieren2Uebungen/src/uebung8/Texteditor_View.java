package uebung8;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.Action;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JToolBar;
import javax.swing.KeyStroke;

public class Texteditor_View extends JFrame {

	JTextArea t;
	JComboBox comboFont, comboSize;
	JLabel l;
	JMenuItem saveMenuItem, openMenuItem, closeMenuItem;
	JMenuItem blueMenuItem, blackMenuItem, yellowMenuItem;

	public Texteditor_View() {
		Container c = this.getContentPane();

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JMenuBar menuBar = new JMenuBar();
		menuBar.add(createFileMenu());
		menuBar.add(createEditMenu());
		menuBar.add(createFormatMenu());

		this.setJMenuBar(menuBar);

		JToolBar toolbar = new JToolBar();

		createToolbar(toolbar);
		this.add("North", toolbar);

		t = new JTextArea();
		t.setLineWrap(true);

		JScrollPane p = new JScrollPane(t);

		c.add(p);

		setBounds(350, 400, 400, 200);
		setVisible(true);
	}

	public JMenu createEditMenu() {
		JMenu menu = new JMenu("Edit");
		menu.setMnemonic(KeyEvent.VK_E);
		JMenuItem menuItem = new JMenuItem("Cut", KeyEvent.VK_U);
		menu.add(menuItem);
		menuItem = new JMenuItem("Copy", KeyEvent.VK_O);
		menu.add(menuItem);
		menuItem = new JMenuItem("Paste", KeyEvent.VK_A);
		menu.add(menuItem);

		return menu;

	}

	public JMenu createFormatMenu() {
		JMenu menu, submenu;
		menu = new JMenu("Format");
		menu.setMnemonic(KeyEvent.VK_T);

		submenu = new JMenu("Color");
		blackMenuItem = new JMenuItem("Black");
		blackMenuItem.setBackground(Color.BLACK);
		blackMenuItem.addActionListener(new Texteditor_ColorHandler(this));
		submenu.add(blackMenuItem);
		yellowMenuItem = new JMenuItem("Yellow");
		yellowMenuItem.setBackground(Color.YELLOW);
		yellowMenuItem.addActionListener(new Texteditor_ColorHandler(this));
		submenu.add(yellowMenuItem);
		blueMenuItem = new JMenuItem("Blue");
		blueMenuItem.setBackground(Color.BLUE);
		blueMenuItem.addActionListener(new Texteditor_ColorHandler(this));
		submenu.add(blueMenuItem);
		menu.add(submenu);

		JMenuItem menuItem = new JCheckBoxMenuItem("Line Wrap");
		menu.add(menuItem);

		return menu;
	}

	public void createToolbar(JToolBar toolbar) {
		Action boldCommand = new Texteditor_BoldCommand("Bold", new ImageIcon(
				"src/images/bold.gif"), null, null, this);
		JButton bold = new JButton(boldCommand);

		bold.setText("");
		bold.setSelected(false);

		Action italicCommand = new Texteditor_ItalicCommand("Italic",
				new ImageIcon("src/images/italic.gif"), null, null, this);
		JButton italic = new JButton(italicCommand);
		italic.setText("");

		Action underlinedCommand = new Texteditor_UnderlinedCommand(
				"Underline", new ImageIcon("src/images/underline.gif"), null,
				null, this);
		JButton underlined = new JButton(underlinedCommand);
		underlined.setText("");

		toolbar.add(bold);
		toolbar.add(italic);
		toolbar.add(underlined);

		String fonts[] = { "Arial", "Sans Serif", "Times New Roman", "Courier" };
		comboFont = new JComboBox(fonts);
		comboFont.addItemListener(new Texteditor_ItemHandler(this));
		toolbar.add(comboFont);
		String sizes[] = { "6", "8", "10", "12", "16", "24", "32" };
		comboSize = new JComboBox(sizes);
		comboSize.addItemListener(new Texteditor_ItemHandler(this));
		toolbar.add(comboSize);

	}

	public JMenu createFileMenu() {
		JMenu menu = new JMenu("File");
		menu.setMnemonic(KeyEvent.VK_F);

		openMenuItem = new JMenuItem("Open", KeyEvent.VK_O);
		openMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_1,
				ActionEvent.ALT_MASK));
		openMenuItem.addActionListener(new Texteditor_FileHandler(this));

		menu.add(openMenuItem);

		saveMenuItem = new JMenuItem("Save", KeyEvent.VK_S);
		saveMenuItem.setMnemonic(KeyEvent.VK_B);
		saveMenuItem.addActionListener(new Texteditor_FileHandler(this));

		menu.add(saveMenuItem);

		closeMenuItem = new JMenuItem("Close");
		closeMenuItem.setMnemonic(KeyEvent.VK_D);
		closeMenuItem.addActionListener(new Texteditor_FileHandler(this));

		menu.add(closeMenuItem);
		menu.addSeparator();
		JMenuItem menuItem = new JMenuItem("Exit");

		menuItem.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});

		menu.add(menuItem);

		return menu;

	}

	public JTextArea getT() {
		return t;
	}

	public void setT(JTextArea t) {
		this.t = t;
	}

	public JComboBox getComboFont() {
		return comboFont;
	}

	public void setComboFont(JComboBox comboFont) {
		this.comboFont = comboFont;
	}

	public JComboBox getComboSize() {
		return comboSize;
	}

	public void setComboSize(JComboBox comboSize) {
		this.comboSize = comboSize;
	}

	public JLabel getL() {
		return l;
	}

	public void setL(JLabel l) {
		this.l = l;
	}

	public JMenuItem getSaveMenuItem() {
		return saveMenuItem;
	}

	public void setSaveMenuItem(JMenuItem saveMenuItem) {
		this.saveMenuItem = saveMenuItem;
	}

	public JMenuItem getOpenMenuItem() {
		return openMenuItem;
	}

	public void setOpenMenuItem(JMenuItem openMenuItem) {
		this.openMenuItem = openMenuItem;
	}

	public JMenuItem getCloseMenuItem() {
		return closeMenuItem;
	}

	public void setCloseMenuItem(JMenuItem closeMenuItem) {
		this.closeMenuItem = closeMenuItem;
	}

	public JMenuItem getBlueMenuItem() {
		return blueMenuItem;
	}

	public void setBlueMenuItem(JMenuItem blueMenuItem) {
		this.blueMenuItem = blueMenuItem;
	}

	public JMenuItem getBlackMenuItem() {
		return blackMenuItem;
	}

	public void setBlackMenuItem(JMenuItem blackMenuItem) {
		this.blackMenuItem = blackMenuItem;
	}

	public JMenuItem getYellowMenuItem() {
		return yellowMenuItem;
	}

	public void setYellowMenuItem(JMenuItem yellowMenuItem) {
		this.yellowMenuItem = yellowMenuItem;
	}
}
