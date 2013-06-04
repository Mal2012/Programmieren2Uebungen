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
		if (e.getID() == 0) {
			sw.setCurrentTime(sw.getCurrentTime() + 1);
			wnd.getTime().setText(
					new Float(((float) sw.getCurrentTime()) / 10).toString());
			wnd.getStatus().setText("Status: Running...");
			wnd.repaint();
		}
		if (e.getActionCommand() != null) {
			switch (e.getActionCommand()) {
			case "Start":

				wnd.getStart().setEnabled(false);
				wnd.getReset().setEnabled(true);
				wnd.getStop().setEnabled(true);
				sw.getMyTimerClock().start();
				break;
			case "Stop":

				sw.getMyTimerClock().stop();
				wnd.getStatus().setText("Status: Stopped");
				wnd.getStart().setEnabled(true);
				wnd.getReset().setEnabled(true);
				wnd.getStop().setEnabled(false);
				wnd.repaint();
				break;
			case "Reset":

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
