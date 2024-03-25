import java.util.Scanner;

public class UserInput {

    public static void main(String[] args){

        Scanner user_input = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = user_input.nextLine();     // nextLine is for strings

        System.out.print("Enter your age: ");
        int age = user_input.nextInt();         // nextInt is for int datatype

        System.out.println("Your name is: " + name + "\nYour age is: " + age);

        user_input.close();
    }
    
}
