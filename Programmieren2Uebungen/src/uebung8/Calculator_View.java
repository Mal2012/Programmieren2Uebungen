package uebung8;

import java.awt.Container;
import java.awt.GridLayout;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

//Darstellung

public class Calculator_View extends JFrame implements Observer {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JButton one, two, three, four, five, six, seven, eight, nine, zero,
			devide, addition, multiply, subtract, getresult, dot;
	private JTextField result;

	public Calculator_View() {
		super("Calculator");
		this.setBounds(100, 100, 450, 297);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = this.getContentPane();
		one = new JButton("1");
		two = new JButton("2");
		four = new JButton("4");
		five = new JButton("5");
		six = new JButton("6");
		seven = new JButton("7");
		eight = new JButton("8");
		nine = new JButton("9");
		zero = new JButton("0");
		result = new JTextField("0");
		result.setBounds(10, 11, 414, 50);
		addition = new JButton("+");
		multiply = new JButton("*");
		subtract = new JButton("-");
		getresult = new JButton("=");
		dot = new JButton(".");

		JPanel buttons = new JPanel();
		buttons.setBounds(10, 72, 414, 176);
		buttons.setLayout(new GridLayout(4, 4, 5, 5));
		getContentPane().setLayout(null);
		c.add(result);
		buttons.add(one);
		buttons.add(two);
		three = new JButton("3");
		buttons.add(three);
		devide = new JButton("/");
		buttons.add(devide);
		buttons.add(four);
		buttons.add(five);
		buttons.add(six);
		buttons.add(multiply);
		buttons.add(seven);
		buttons.add(eight);
		buttons.add(nine);
		buttons.add(addition);
		buttons.add(zero);
		buttons.add(dot);
		buttons.add(getresult);
		buttons.add(subtract);
		c.add(buttons);
		this.setVisible(true);
	}

	@Override
	public void update(Observable arg0, Object arg1) {
		// TODO Auto-generated method stub
		this.repaint();
	}

	// GETTERS & SETTERS
	public JButton getOne() {
		return one;
	}

	public void setOne(JButton one) {
		this.one = one;
	}

	public JButton getTwo() {
		return two;
	}

	public void setTwo(JButton two) {
		this.two = two;
	}

	public JButton getThree() {
		return three;
	}

	public void setThree(JButton three) {
		this.three = three;
	}

	public JButton getFour() {
		return four;
	}

	public void setFour(JButton four) {
		this.four = four;
	}

	public JButton getFive() {
		return five;
	}

	public void setFive(JButton five) {
		this.five = five;
	}

	public JButton getSix() {
		return six;
	}

	public void setSix(JButton six) {
		this.six = six;
	}

	public JButton getSeven() {
		return seven;
	}

	public void setSeven(JButton seven) {
		this.seven = seven;
	}

	public JButton getEight() {
		return eight;
	}

	public void setEight(JButton eight) {
		this.eight = eight;
	}

	public JButton getNine() {
		return nine;
	}

	public void setNine(JButton nine) {
		this.nine = nine;
	}

	public JButton getZero() {
		return zero;
	}

	public void setZero(JButton zero) {
		this.zero = zero;
	}

	public JButton getDevide() {
		return devide;
	}

	public void setDevide(JButton devide) {
		this.devide = devide;
	}

	public JButton getAddition() {
		return addition;
	}

	public void setAddition(JButton addition) {
		this.addition = addition;
	}

	public JButton getMultiply() {
		return multiply;
	}

	public void setMultiply(JButton multiply) {
		this.multiply = multiply;
	}

	public JButton getSubtract() {
		return subtract;
	}

	public void setSubtract(JButton subtract) {
		this.subtract = subtract;
	}

	public JButton getGetresult() {
		return getresult;
	}

	public void setGetresult(JButton getresult) {
		this.getresult = getresult;
	}

	public JButton getDot() {
		return dot;
	}

	public void setDot(JButton dot) {
		this.dot = dot;
	}

	public JTextField getResult() {
		return result;
	}

	public void setResult(JTextField result) {
		this.result = result;
	}

}
