package uebung8;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

public class StopWatch_Test {
	public static void main(String[] args) {
		JFrame.setDefaultLookAndFeelDecorated(false);
		StopWatch aDigitalClock = new StopWatch();

		aDigitalClock.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
}
