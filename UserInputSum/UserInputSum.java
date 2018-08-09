import javax.swing.JOptionPane;

public class UserInputSum {
    public static void main(String[] args) {
        String tmp = JOptionPane.showInputDialog("1st Number");
        int number1 = Integer.parseInt(tmp);
        tmp = JOptionPane.showInputDialog("2nd Number");
        int number2 = Integer.parseInt(tmp);
        tmp = "The sum of " + number1 + " and " + number2 + " is " + (number1+number2) + ".";
        JOptionPane.showMessageDialog(null, tmp);
    }
}