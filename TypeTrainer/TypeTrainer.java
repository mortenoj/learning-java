package TypeTrainer;

import java.awt.BorderLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JTextArea;

/**
 * This class is the main implementation for task 12.20
 * 
 * @author oeivindk
 *
 */
public class TypeTrainer extends JFrame implements KeyListener {
	KeyboardPanel keyboard = new KeyboardPanel();
	JTextArea text = new JTextArea(40,5);
	
	public TypeTrainer() {
		super("Type Trainer");
		add(text, BorderLayout.NORTH);
		add(keyboard, BorderLayout.SOUTH);
		pack();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		text.addKeyListener(this);
	}
	
	public static void main(String[] args) {
		new TypeTrainer();
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		keyboard.keyPressed(e);
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		keyboard.keyReleased(e);
	}
}
