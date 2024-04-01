import java.util.Scanner;

public class Age {

    public static void main(String[] args) {
        
        System.out.print("Enter you age: ");

        Scanner ageInput = new Scanner(System.in);
        int age = ageInput.nextInt();

        switch(age){           //switch doesnot support range based cases
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("You are an infant.");
                break;

            case 10:
            case 20:
            case 30:
                System.out.println("You are a youth.");
                break;

            case 40:
            case 50:
            case 60:
                System.out.println("You are old.");
                break;
        }
    }
}

