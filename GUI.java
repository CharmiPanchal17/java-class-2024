import javax.swing.JOptionPane;

public class GUI {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Enter your name: ");     //this prompts user to enter their name

        Integer age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age: "));

        Double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height: "));

        JOptionPane.showMessageDialog(null, "Hello " + name + "\nYour age is: " + age + " years.\nYour height is: " + height);
    }
}
