package uebung6;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;

import javax.swing.JPanel;
import javax.swing.Timer;

public class DigitalClock extends JPanel {

	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		super.paint(g);
		this.setBackground(Color.black);
		g.setColor(Color.WHITE);
		g.drawRect(5, 5, 380, 70);
		Font f = new Font("Arial", Font.BOLD, 20);
		g.setFont(f);
		g.drawString(Calendar.getInstance().getTime().toString(), 50, 50);

		int delay = 1000; // milliseconds
		ActionListener taskPerformer = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent evt) {
				DigitalClock.this.repaint();
			}
		};
		new Timer(delay, taskPerformer).start();
	}
}
