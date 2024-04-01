import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator {

    public static void main(String[] args) {
        
        // creating a frame
        JFrame frame = new JFrame("My Calculator");
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.getContentPane().setBackground(Color.MAGENTA);    //to set the background color

        // creating components for the frame
        JLabel num1Lable = new JLabel("Number 1: ");
        num1Lable.setBounds(20, 20, 80, 25);
        JTextField num1Text = new JTextField();      //this is for entering the text
        num1Text.setBounds(100, 20, 150, 25);


        JLabel num2Lable = new JLabel("Number 2: ");
        num2Lable.setBounds(20, 50, 80, 25);
        JTextField num2Text = new JTextField();
        num2Text.setBounds(100, 50, 150, 25);

        // creating 4 buttons
        JButton addButton = new JButton("Add");
        addButton.setBounds(20, 80, 100, 20);

        JButton subButton = new JButton("Subtract");
        subButton.setBounds(20, 105, 100, 20);

        JButton mulButton = new JButton("Multiply");
        mulButton.setBounds(150, 80, 100, 20);

        JButton divButton = new JButton("Divide");
        divButton.setBounds(150, 105, 100, 20);

        // creating labels to show the results of the operation
        JLabel addresult = new JLabel();
        addresult.setBounds(20, 125, 250, 25);

        JLabel subresult = new JLabel();
        subresult.setBounds(20, 155, 250, 25);

        JLabel mulresult = new JLabel();
        mulresult.setBounds(20, 185, 250, 25);

        JLabel divresult = new JLabel();
        divresult.setBounds(20, 215, 250, 25);



        // adding all the components to the frame
        frame.add(num1Lable);
        frame.add(num1Text);
        frame.add(num2Lable);
        frame.add(num2Text);
        frame.add(addButton);
        frame.add(subButton);
        frame.add(mulButton);
        frame.add(divButton);
        frame.add(addresult);
        frame.add(subresult);
        frame.add(mulresult);
        frame.add(divresult);

        // actionlistener for the buttons to work
        // adding the actionlistener to the add button
        addButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e){
                try {
                    // Get input from text fields
                    double num1 = Double.parseDouble(num1Text.getText());
                    double num2 = Double.parseDouble(num2Text.getText());

                    // Perform addition
                    double add_result = num1 + num2;

                    // Display result
                    addresult.setText("Addition Result: " + add_result);
                } catch (NumberFormatException ex) {
                    // Handle non-numeric input
                    addresult.setText("Invalid input");
                }
            }
        });

        // adding actionlistener to the subtraction button
        subButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e){
                try {                   
                    double num3 = Double.parseDouble(num1Text.getText());
                    double num4 = Double.parseDouble(num2Text.getText());

                    double sub_result = num3 - num4;

                    subresult.setText("Subtraction Result: " + sub_result);
                } catch (NumberFormatException ex) {
                    subresult.setText("Invalid input");
                }
            }
        });

        // adding actionlistener to the multiplication button
        mulButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e){
                try {
                    
                    double num5 = Double.parseDouble(num1Text.getText());
                    double num6 = Double.parseDouble(num2Text.getText());

                    double mul_result = num5 * num6;

                    mulresult.setText("Multiplication Result: " + mul_result);
                } catch (NumberFormatException ex) {
                    
                    mulresult.setText("Invalid input");
                }
            }
        });

        // adding actionlistener to the dvision button
        divButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e){
                try {
                    double num7 = Double.parseDouble(num1Text.getText());
                    double num8 = Double.parseDouble(num2Text.getText());

                    double div_result = num7 / num8;

                    divresult.setText("Division Result: " + div_result);
                } catch (NumberFormatException ex) {
                    
                    divresult.setText("Invalid input");
                }
            }
        });


        // making the frame visible
        frame.setVisible(true);
    }
}