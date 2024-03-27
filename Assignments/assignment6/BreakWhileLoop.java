import java.util.Scanner;

public class BreakWhileLoop {
    public static void main(String[] args) {
        
        // example 1

        int x = 1;

        while (true) {
            System.out.println(x);
            x++;

            if (x > 5) {
                break;
            }   
        }


        //example 2

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter any number less then 10: ");
        int num = scanner.nextInt();

        while (true) {
            System.out.println("Number " + num);
            num++;

            if (num > 10) {
                break;
            }
        }


        //example 3

        int my_num = 5;

        int trials = 0;

        Scanner input = new Scanner(System.in);

        while (true) {
            
            System.out.print("Guess any number between 1 and 10: ");
            int user_num = input.nextInt();
            trials++;

            if (user_num == my_num) {
                System.out.println("You guessed the right number!");
                break;    
            }

            else {
                System.out.println("Not the right number! Please try again!");
            }
        }

        scanner.close();
        input.close();
    }
}
