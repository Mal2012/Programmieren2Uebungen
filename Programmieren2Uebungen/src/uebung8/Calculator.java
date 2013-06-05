package uebung8;

import java.util.Stack;

//Logik
public class Calculator {
	private StringBuffer x, y;
	private Stack<String> op;
	Calculator_View view;
	Calculator_Actions action;

	public Stack<String> getOp() {
		return op;
	}

	public void setOp(Stack<String> op) {
		this.op = op;
	}

	public StringBuffer getX() {
		return x;
	}

	public void setX(StringBuffer x) {
		this.x = x;
	}

	public StringBuffer getY() {
		return y;
	}

	public void setY(StringBuffer y) {
		this.y = y;
	}

	public float getResult() {
		return result;
	}

	public void setResult(float result) {
		this.result = result;
	}

	private float result;

	public Calculator() {
		op = new Stack<String>();
		x = new StringBuffer();
		y = new StringBuffer();
		view = new Calculator_View();
		action = new Calculator_Actions(this);
		view.getOne().addActionListener(action);
		view.getTwo().addActionListener(action);
		view.getThree().addActionListener(action);
		view.getFour().addActionListener(action);
		view.getFive().addActionListener(action);
		view.getSix().addActionListener(action);
		view.getSeven().addActionListener(action);
		view.getEight().addActionListener(action);
		view.getNine().addActionListener(action);
		view.getZero().addActionListener(action);
		view.getAddition().addActionListener(action);
		view.getMultiply().addActionListener(action);
		view.getSubtract().addActionListener(action);
		view.getDevide().addActionListener(action);
		view.getDot().addActionListener(action);
		view.getGetresult().addActionListener(action);

	}

	public Calculator_View getView() {
		return view;
	}

	public void setView(Calculator_View view) {
		this.view = view;
	}

	public float compute() {
		float temp = Float.parseFloat(op.pop());
		Object pek = op.pop();
		if (pek == "+") {
			return temp + Float.parseFloat(op.pop());
		} else if (pek == "-") {
			return (Float.parseFloat(op.pop()) - temp);
		} else if (pek == "*") {
			return temp * Float.parseFloat(op.pop());
		} else if (pek == "/") {
			return (Float.parseFloat(op.pop()) / temp);
		} else {
			return 0;
		}
	}

	public float addition(float x, float y) {
		return result = x + y;
	}

	public float subtract(float x, float y) {
		return result = x - y;
	}

	public float multiply(float x, float y) {
		return result = x * y;
	}

	public float devide(float x, float y) {
		return result = x / y;
	}

}
