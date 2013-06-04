package uebung8;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StopWatch_Action implements ActionListener {

	StopWatch_Window wnd;
	StopWatch sw;

	public StopWatch_Action(StopWatch sw, StopWatch_Window wnd) {
		this.sw = sw;
		this.wnd = wnd;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println(e.getID());
		if (e.getID() == 0) {
			sw.setCurrentTime(sw.getCurrentTime() + 1);
			wnd.getTime().setText(
					new Float(((float) sw.getCurrentTime()) / 10).toString());
			wnd.getStatus().setText("Running...");
			wnd.repaint();
		}
		if (e.getActionCommand() != null) {
			switch (e.getActionCommand()) {
			case "Start":
				System.out.println("Start");
				wnd.getStart().setEnabled(false);
				wnd.getReset().setEnabled(true);
				wnd.getStop().setEnabled(true);
				sw.getMyTimerClock().start();
				break;
			case "Stop":
				System.out.println("Stop");
				sw.getMyTimerClock().stop();
				wnd.getStatus().setText("stopped");
				wnd.getStart().setEnabled(true);
				wnd.getReset().setEnabled(true);
				wnd.getStop().setEnabled(false);
				wnd.repaint();
				break;
			case "Reset":
				System.out.println("Reset");
				sw.setCurrentTime(0);
				wnd.getTime().setText("0.0");
				wnd.repaint();
				break;
			default:
				System.out.println(e.getActionCommand());
			}
		}
	}
}
