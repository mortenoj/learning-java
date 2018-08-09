import javax.swing.JOptionPane;

public class UserInput {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("What's your name?");
        JOptionPane.showMessageDialog(null, "What's up " + name + "?");
    }
}