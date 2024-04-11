import java.util.Scanner;

public class SimpleCalc {
    
    private double number;

    Scanner input_num = new Scanner(System.in);


    //constructor
    public SimpleCalc(double number) {
        this.number = number;
    }

    //method for calculating sqaureroot
    public double squareRoot(){

        System.out.print("Enter the number to find the square root of: ");
        number = input_num.nextDouble();

        return Math.sqrt(number);
    }
    

    public static void main(String[] args){

        SimpleCalc num1 = new SimpleCalc(4.0);

        double num = num1.squareRoot();
        System.out.println("The sqaure root of the number is: " + num);
    }
    
}
