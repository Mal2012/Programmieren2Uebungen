package bimpfi;

import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.event.ActionListener;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JFrame;
import javax.swing.Timer;

public class AmpelView extends JFrame implements Observer {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7485334148594761719L;
	private final Ampel ampel;

	public AmpelView(Ampel ampel) {
		this.ampel = ampel;
		this.ampel.addObserver(this);

		this.setSize(80, 200);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		Container c = this.getContentPane();
		c.setLayout(null);
		this.setVisible(true);
	}

	public void paintComponent(Graphics g) {

		if (this.ampel.getLamp1() == 0)
			g.setColor(Color.GRAY);
		if (this.ampel.getLamp1() == 1)
			g.setColor(Color.RED);
		g.fillOval(45, 45, 50, 50);

		if (this.ampel.getLamp2() == 0)
			g.setColor(Color.GRAY);
		if (this.ampel.getLamp2() == 1)
			g.setColor(Color.GREEN);
		g.fillOval(45, 120, 50, 50);
	}

	@Override
	public void update(Observable arg0, Object arg1) {
		this.repaint();
	}
	
	
	public static void main(String[] args) {
		int delay = 3000;
		new Timer(delay, new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				schalte();

			}
		}).start();
	}
	}
}