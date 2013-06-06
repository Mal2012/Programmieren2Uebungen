package uebung8;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;

public class StopWatch_Action extends Observable implements ActionListener {

	StopWatch_Window wnd;
	StopWatch sw;

	public StopWatch_Action(StopWatch sw, StopWatch_Window wnd) {
		this.sw = sw;
		this.wnd = wnd;
		this.addObserver(wnd);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getID() == 0) {
			if (sw.getCurrentTime() == 590) {
				sw.setMinutes(sw.getMinutes() + 1);
				sw.setCurrentTime(0);
				wnd.getMinutes().setText(
						new Integer(sw.getMinutes()).toString());
			} else {
				sw.setCurrentTime(sw.getCurrentTime() + 1);
			}
			wnd.getTime().setText(
					new Float(((float) sw.getCurrentTime()) / 10).toString());
			wnd.getStatus().setText("Status: Running...");
			this.setChanged();
			this.notifyObservers();

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
				this.setChanged();
				this.notifyObservers();
				break;
			case "Reset":

				sw.setCurrentTime(0);
				sw.setMinutes(0);
				wnd.getMinutes().setText("0");
				wnd.getTime().setText("0.0");
				this.setChanged();
				this.notifyObservers();
				break;
			default:
				System.out.println(e.getActionCommand());
			}
		}
	}
}
