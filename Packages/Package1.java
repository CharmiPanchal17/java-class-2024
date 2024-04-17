// A package is a mechanism for organizing classes and interfaces.
//This provides a way to group related code together
//Controls the visibility of the classes and the interfaces
//Packages allow hiding of implementation details of any code(Encapsulation).

//Math package
import java.util.Scanner;
import java.lang.Math;
import java.util.Random;
import java.util.Date;
import java.util.Calendar;

public class Package1{
    public static void main(String[] args) {
        double result = Math.tan(80);
        System.out.println(result);


        Scanner scanner=new Scanner(System.in);
        int userInput=scanner.nextInt();
        double userInput1=scanner.nextDouble();
        String input=scanner.nextLine();

        //Random Number Generation
        Random rand = new Random();
        int randomNumber = rand.nextInt(100);
        System.out.print("Enter your guess");
        System.out.println(randomNumber);

        Date nowDate = new Date();

        Calendar cal=Calendar.getInstance();
        int year=cal.get(Calendar.YEAR);

    }
}
