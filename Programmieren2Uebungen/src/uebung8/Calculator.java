package uebung8;

import java.util.Stack;

//Logik
public class Calculator {
	private StringBuffer x, y;
	private Stack<String> op;
	Calculator_View view;
	Calculator_Actions action;
	Calculator_KeyHandler key;
	private float result;
	Object pek, peek;

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

	public Calculator() {
		op = new Stack<String>();
		x = new StringBuffer();
		y = new StringBuffer();
		result = 0.0f;
		view = new Calculator_View();
		action = new Calculator_Actions(this);
		key = new Calculator_KeyHandler(this);
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
		view.addKeyListener(key);
		view.setFocusable(true);
		view.requestFocusInWindow();
	}

	public Calculator_View getView() {
		return view;
	}

	public void setView(Calculator_View view) {
		this.view = view;
	}

	public float compute() {
		System.out.println(op.toString());
		pek = op.pop();
		peek = op.pop();

		if (!op.isEmpty()) {
			if (peek.toString().equals("+")) {
				result = Float.parseFloat(pek.toString())
						+ Float.parseFloat(op.pop());
				if (!op.isEmpty()) {

					this.compute();
				}
				return result;

			} else if (peek.toString().equals("-")) {
				result = Float.parseFloat(op.pop())
						- Float.parseFloat(pek.toString());
				if (!op.isEmpty()) {
					this.compute();
				}

				return result;
			} else if (peek.toString().equals("*")) {
				result = Float.parseFloat(op.pop())
						* Float.parseFloat(pek.toString());
				if (!op.isEmpty()) {
					this.compute();
				}
				return result;
			} else if (peek.toString().equals("/")) {
				result = Float.parseFloat(op.pop())
						/ Float.parseFloat(pek.toString());
				if (!op.isEmpty()) {
					this.compute();
				}
				return result;
			}
		} else {
			if (peek.toString().equals("+")) {
				return result += Float.parseFloat(pek.toString());
			} else if (peek.toString().equals("-")) {
				return result -= Float.parseFloat(op.pop());
			} else if (peek.toString().equals("*")) {
				return result *= Float.parseFloat(pek.toString());
			} else if (peek.toString().equals("/")) {
				return result /= Float.parseFloat(pek.toString());
			}
		}

		System.out.println("Pek: " + pek);

		return 1;
	}
}
