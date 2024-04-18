import java.util.Scanner;

public class StringLength {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Enter any sentance: ");
        String sentence = input.nextLine();

        int stringLength = sentence.length();

        System.out.println("The length of the sentance is: " + stringLength);

        input.close();
    }
}
