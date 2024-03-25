import javax.swing.JButton;
import javax.swing.JFrame;

public class GuiButton {
    
    public static void main(String[] args) {
        
        JFrame frame = new JFrame("Button Example");

        JButton button = new JButton();

        button.setText("Click on me!");

        frame.add(button);

        frame.setSize(500, 400);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setVisible(true);
    }
}
