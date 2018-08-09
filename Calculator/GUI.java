package gui;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class GUI extends JFrame {
	public GUI () {
		super("Calculator");
		setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));
		JTextField textField = new JTextField(24);
		add (textField);
		
		JButton buttons[] = new JButton[16];
		buttons[7] = new JButton("7");	// First row of buttons
		add (buttons[7]);
		buttons[8] = new JButton("8");
		add (buttons[8]);
		buttons[9] = new JButton("9");
		add (buttons[9]);
		buttons[10] = new JButton("/");
		add (buttons[10]);
		buttons[4] = new JButton("4");	// Second row of buttons
		add (buttons[4]);
		buttons[5] = new JButton("5");
		add (buttons[5]);
		buttons[6] = new JButton("6");
		add (buttons[6]);
		buttons[11] = new JButton("*");
		add (buttons[11]);
		buttons[1] = new JButton("1");	// Third row of buttons
		add (buttons[1]);
		buttons[2] = new JButton("2");
		add (buttons[2]);
		buttons[3] = new JButton("3");
		add (buttons[3]);
		buttons[12] = new JButton("-");
		add (buttons[12]);
		buttons[0] = new JButton("0");	// Forth row of buttons
		add (buttons[0]);
		buttons[13] = new JButton(".");
		add (buttons[13]);
		buttons[14] = new JButton("=");
		add (buttons[14]);
		buttons[15] = new JButton("+");
		add (buttons[15]);
		setSize(300,200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
}