package uebung8;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

public class StopWatch_Window extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = -1595089808395749933L;
	private JButton start, stop, reset;
	private JLabel status, time;

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

	public StopWatch_Window() {
		super("StopWatch");
		Container c = this.getContentPane();
		c.setLayout(new BorderLayout());
		JPanel display = new JPanel();
		status = new JLabel("stopped");
		status.setForeground(Color.BLUE);

		display.setLayout(new BorderLayout());

		JPanel timePanel = new JPanel();
		TitledBorder b = new TitledBorder(new LineBorder(Color.BLUE), "Display");
		b.setTitleColor(Color.BLUE);
		timePanel.setBorder(b);
		time = new JLabel("0.0");
		time.setFont(new Font("Times New Roman", Font.BOLD, 24));
		time.setForeground(Color.BLUE);

		JLabel seconds = new JLabel("Seconds:    ");
		seconds.setHorizontalAlignment(SwingConstants.RIGHT);
		seconds.setFont(new Font("Times New Roman", Font.BOLD, 24));
		seconds.setForeground(Color.BLUE);
		timePanel.setLayout(new GridLayout(1, 2));

		timePanel.add(seconds);
		timePanel.add(time);

		display.add("Center", timePanel);
		JPanel buttonPanel = new JPanel();

		GridLayout g = new GridLayout(1, 3);
		g.setHgap(2);
		buttonPanel.setLayout(g);
		start = new JButton("Start");
		start.setFont(new Font("Times New Roman", Font.BOLD, 24));

		stop = new JButton("Stop");
		stop.setFont(new Font("Times New Roman", Font.BOLD, 24));
		stop.setEnabled(false);

		reset = new JButton("Reset");
		reset.setFont(new Font("Times New Roman", Font.BOLD, 24));

		buttonPanel.add(start);
		buttonPanel.add(stop);
		buttonPanel.add(reset);

		display.add("South", buttonPanel);
		c.add("Center", display);
		c.add("South", status);

	}

}
