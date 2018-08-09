import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class HelloWorldImage {
    public static void main(String[] arg) {
        JOptionPane.showMessageDialog(null, new ImageIcon("world.jpg"), "Hello world", JOptionPane.PLAIN_MESSAGE);
    }
}