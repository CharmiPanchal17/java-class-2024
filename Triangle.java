import java.util.Scanner;

public class Triangle {
     public static void main(String[] args) {

        double h;
        double b;
        double hyp;
 
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the height: ");
        h = scanner.nextDouble();

        System.out.print("Enter the base: ");
        b = scanner.nextDouble();
 
        hyp = Math.sqrt((h*h)+(b*b));
        System.out.println("The hypotinuse of the triangle is: " + hyp);

        scanner.close();
     }
}
