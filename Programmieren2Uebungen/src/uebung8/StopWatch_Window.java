package uebung8;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

public class StopWatch_Window extends JFrame implements Observer {
	/**
	 * 
	 */
	private static final long serialVersionUID = -1595089808395749933L;
	private JButton start, stop, reset;
	private JLabel status, time, minutes;
	private StopWatch_Action action;

	public JButton getStart() {
		return start;
	}

	public void setStart(JButton start) {
		this.start = start;
	}

	public JButton getStop() {
		return stop;
	}

	public void setStop(JButton stop) {
		this.stop = stop;
	}

	public JButton getReset() {
		return reset;
	}

	public void setReset(JButton reset) {
		this.reset = reset;
	}

	public JLabel getStatus() {
		return status;
	}

	public void setStatus(JLabel status) {
		this.status = status;
	}

	public JLabel getTime() {
		return time;
	}

	public void setTime(JLabel time) {
		this.time = time;
	}

	public StopWatch_Window(StopWatch_Action action) {
		super("StopWatch");
		this.action = action;
		Container c = this.getContentPane();
		c.setLayout(new BorderLayout());
		action.addObserver(this);
		JPanel display = new JPanel();
		status = new JLabel("Status: Stopped");
		status.setForeground(Color.BLACK);

		display.setLayout(new BorderLayout());

		JPanel timePanel = new JPanel();
		TitledBorder b = new TitledBorder(new LineBorder(Color.BLACK),
				"Display");
		b.setTitleColor(Color.BLACK);
		timePanel.setBorder(b);
		time = new JLabel("0.0");
		minutes = new JLabel("0");
		minutes.setForeground(Color.BLACK);
		time.setForeground(Color.BLACK);
		JLabel display_name = new JLabel("Timer: ");
		JLabel seconds = new JLabel(":");

		seconds.setHorizontalAlignment(SwingConstants.LEFT);

		seconds.setForeground(Color.BLACK);
		timePanel.setLayout(new GridLayout(1, 2));

		timePanel.add(display_name);

		timePanel.add(minutes);
		timePanel.add(seconds);
		timePanel.add(time);

		display.add("Center", timePanel);
		JPanel buttonPanel = new JPanel();

		GridLayout g = new GridLayout(1, 3);
		g.setHgap(2);
		buttonPanel.setLayout(g);
		start = new JButton("Start");

		stop = new JButton("Stop");

		stop.setEnabled(false);

		reset = new JButton("Reset");

		buttonPanel.add(start);
		buttonPanel.add(stop);
		buttonPanel.add(reset);
		display.add("South", buttonPanel);
		c.add("Center", display);
		c.add("South", status);

	}

	public JLabel getMinutes() {
		return minutes;
	}

	public void setMinutes(JLabel minutes) {
		this.minutes = minutes;
	}

	@Override
	public void update(Observable arg0, Object arg1) {
		// TODO Auto-generated method stub
		repaint();
	}

}
