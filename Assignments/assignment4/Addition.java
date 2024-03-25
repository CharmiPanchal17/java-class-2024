import java.util.Scanner;

public class Addition{

    public static void main(String[] args){

        Scanner user_input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = user_input.nextInt();

        System.out.print("Enter the second number: ");
        int num2 =  user_input.nextInt();

        int add = num1 + num2;
        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + add);

        user_input.close();

    }
}