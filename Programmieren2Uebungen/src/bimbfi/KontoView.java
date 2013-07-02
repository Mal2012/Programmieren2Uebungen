package bimbfi;

import java.awt.Container;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class KontoView extends JFrame implements Observer {

	protected JLabel kstand, knummer;
	protected Konto konto;

	public KontoView(Konto konto) {
		this.konto = konto;
		this.konto.addObserver(this);
		Container c = this.getContentPane();
		this.setBounds(10, 10, 250, 250);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		c.setLayout(null);
		kstand = new JLabel("" + konto.getKontoStand());
		knummer = new JLabel("" + konto.getKontoNummer());
		c.add(new JLabel("Kontostand: ")).setBounds(10, 50, 100, 20);
		c.add(kstand).setBounds(10, 70, 50, 20);
		c.add(new JLabel("KontoNummer: ")).setBounds(10, 10, 100, 20);
		c.add(knummer).setBounds(10, 30, 100, 20);

	}

	@Override
	public void update(Observable arg0, Object arg1) {
		// TODO Auto-generated method stub

		kstand.setText("" + konto.getKontoStand());
		this.repaint();
	}

}
