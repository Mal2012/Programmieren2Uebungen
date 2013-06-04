package uebung8;

import javax.swing.JFrame;

public class StopWatch extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7886335892821251303L;

	private int currentTime = 0;

	private javax.swing.Timer myTimerClock;
	private StopWatch_Action action;

	public StopWatch() {
		StopWatch_Window wnd = new StopWatch_Window();
		action = new StopWatch_Action(this, wnd);

		myTimerClock = new javax.swing.Timer(100, action);

		wnd.setBounds(200, 200, 400, 150);
		wnd.setVisible(true);
		wnd.getStart().addActionListener(action);
		wnd.getStop().addActionListener(action);
		wnd.getReset().addActionListener(action);
		wnd.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public int getCurrentTime() {
		return currentTime;
	}

	public javax.swing.Timer getMyTimerClock() {
		return myTimerClock;
	}

	public void setMyTimerClock(javax.swing.Timer myTimerClock) {
		this.myTimerClock = myTimerClock;
	}

	public void setCurrentTime(int currentTime) {
		this.currentTime = currentTime;
	}
}
