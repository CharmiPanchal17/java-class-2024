import java.util.Scanner;

public class Except1 {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        try{
            System.out.print("Enter the number to divide: ");
            int num1 = scanner.nextInt();

            System.out.print("Enter the divisor: ");
            int num2 = scanner.nextInt();

            double resultDivision = num1/num2;

            if (num2 < 0) {
                throw new IllegalArgumentException("You divided by a negative number.");   //this will throw this message on line31
            }

            System.out.println("The answer is:" + resultDivision);

            }
            
            catch(ArithmeticException e){
                System.out.println("You cannot divide a number by zero" +e.getMessage());
            }

            catch(Exception e){       //this is a general exception
                System.out.println("An exception occurred...." + e.getMessage());
            }

        // scanner.close();
    }
}
