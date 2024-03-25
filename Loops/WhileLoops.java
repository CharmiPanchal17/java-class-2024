import java.util.Scanner;

public class WhileLoops {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number to countdown from: ");
        int x = scanner.nextInt();

        while (x > 0) {
            System.out.println(x);
            x--;
        }

        scanner.close();
    }
}
