import javax.swing.*;

public class SimpleGUIExample {
    
    public static void main(String[] args) {
        JFrame frame = new JFrame("Simple GUI Example");   //this is to give the frame a title

        JLabel label = new JLabel("Hello World!");      //this is to write content to the frame

        frame.getContentPane().add(label);         //this is to add the label to the frame

        frame.setSize(300,200);      //this is for setting the size of the frame

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);     //this helps in closing the frame after clicking on the cross otherwise the frame will keep on looping and will no be closed 

        frame.setVisible(true);     //this will make the frame viible to the user

    }
}
