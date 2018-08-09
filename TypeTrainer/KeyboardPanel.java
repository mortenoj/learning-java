package TypeTrainer;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.KeyEvent;
import java.util.Arrays;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JPanel;


public class KeyboardPanel extends JPanel {
	private String buttonText[] = {"'", "1", "2", "3", "4", "5", "6", "7", "8", "9", "0", "+", "´", "⌫", 
			"⇥", "q", "w", "e", "r", "t", "y", "u", "i", "o", "p", "å", "¨", "⏎", 
			"⇪", "a", "s", "d", "f", "g", "h", "j", "k", "l", "ø", "æ", "@", 
			"⇧", "<", "z", "x", "c", "v", "b", "n", "m", ",", ".", "-", "⇧", 
			"Space"};
	private Color standardButtonBackground;
	private JButton[] buttons;
	private List<String> buttonTexts;
	
	/**
	 * Adds all the keys to the keyboard layout
	 */
	public KeyboardPanel() {
		setLayout (new GridLayout(5,1));
		buttons = new JButton[buttonText.length];
		for (int i=0; i<buttonText.length-1; i++) {	// Will handle the last one "space" in a special manner	
			buttons[i] = new JButton(buttonText[i]);
			buttons[i].setOpaque(true);
		}
		buttons[buttonText.length-1] = new JButton("                        "+
			buttonText[buttonText.length-1]+"                        ");
		buttonTexts = Arrays.asList(buttonText);
		
		// Add keys to first row
		JPanel firstRow = new JPanel (new FlowLayout(FlowLayout.LEFT, 0, 0));
		for (int i=buttonTexts.indexOf("'"); i<buttonTexts.indexOf("⌫")+1; i++) {
			firstRow.add(buttons[i]);
		}
		add(firstRow);

		// Add keys to second row
		JPanel secondRow = new JPanel (new FlowLayout(FlowLayout.LEFT, 0, 0));
		for (int i=buttonTexts.indexOf("⇥"); i<buttonTexts.indexOf("⏎")+1; i++) {
			secondRow.add(buttons[i]);
		}
		add(secondRow);

		// Add keys to third row
		JPanel thirdRow = new JPanel (new FlowLayout(FlowLayout.LEFT, 0, 0));
		for (int i=buttonTexts.indexOf("⇪"); i<buttonTexts.indexOf("@")+1; i++) {
			thirdRow.add(buttons[i]);
		}
		add(thirdRow);
		
		// Add keys to fourth row
		JPanel fourthRow = new JPanel (new FlowLayout(FlowLayout.LEFT, 0, 0));
		for (int i=buttonTexts.indexOf("⇧"); i<buttonTexts.lastIndexOf("⇧")+1; i++) {
			fourthRow.add(buttons[i]);
		}
		add(fourthRow);
		
		// Add keys to fifth row
		JPanel fifthRow = new JPanel (new FlowLayout(FlowLayout.CENTER, 0, 0));
		for (int i=buttonTexts.indexOf("Space"); i<buttonTexts.lastIndexOf("Space")+1; i++) {
			fifthRow.add(buttons[i]);
		}
		add(fifthRow);
		
		standardButtonBackground = buttons[0].getBackground();
	}
	
	/**
	 * Called to indicate that a key has been pressed, ie change its background.
	 */
	public void keyPressed(KeyEvent key) {
		String name = KeyEvent.getKeyText(key.getKeyCode()).toLowerCase();
		if (buttonTexts.indexOf(name)>-1) {
			buttons[buttonTexts.indexOf(name)].setBackground(Color.darkGray);
		} else {		// This is for debugging purposes, what names does not map correctly
			System.out.println(name);
		}
	}
	
	/**
	 * Called to indicate that a key has been released, ie change its background color back to default.
	 */
	public void keyReleased(KeyEvent key) {
		String name = KeyEvent.getKeyText(key.getKeyCode()).toLowerCase();
		if (buttonTexts.indexOf(name)>-1) {
			buttons[buttonTexts.indexOf(name)].setBackground(standardButtonBackground);
		}		
	}
}