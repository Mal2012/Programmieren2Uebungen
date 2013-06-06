package uebung8;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;

public class Calculator_Actions extends Observable implements ActionListener {
	Calculator calc;

	public Calculator_Actions(Calculator calc) {
		this.calc = calc;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub

		if (arg0.getActionCommand().equals("*")
				|| arg0.getActionCommand().equals("/")
				|| arg0.getActionCommand().equals("+")
				|| arg0.getActionCommand().equals("-")
				|| arg0.getActionCommand().equals("=")) {
			calc.getOp().add(calc.getX().toString());

			if (!arg0.getActionCommand().equals("=")) {
				calc.getOp().add(arg0.getActionCommand());
				calc.getY().append(arg0.getActionCommand());
				calc.getView().getResult().setText(calc.getY().toString());
				calc.setX(new StringBuffer());
				this.setChanged();
				this.notifyObservers();
			}
			if (arg0.getActionCommand().equals("=")) {
				calc.getView().getResult().setText("" + calc.compute());
				calc.setX(new StringBuffer());
				calc.setY(new StringBuffer());
				this.setChanged();
				this.notifyObservers();
			}
		} else {
			calc.getX().append(arg0.getActionCommand());
			calc.getY().append(arg0.getActionCommand());
			calc.getView().getResult().setText(calc.getY().toString());
			this.setChanged();
			this.notifyObservers();
		}

	}
}
