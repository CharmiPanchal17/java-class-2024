import java.lang.Math;
import java.time.LocalDate;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;
import java.util.TimeZone;

public class Packages {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        //Math package
        //Example1
        System.out.print("Enter any number to find the sqaure root of: ");
        double numberSqrt = userInput.nextDouble();

        double sqaureRoot = Math.sqrt(numberSqrt);
        System.out.println("The square root of " + numberSqrt + " is: " + sqaureRoot);

        //example2
        System.out.print("Enter the radius of the circle: ");
        double radius = userInput.nextDouble();

        double circleArea = Math.PI*(radius*radius);
        System.out.println("The area of the circle is: " + circleArea);


        //date package
        //example1
        Date todayDate = new Date();
        System.out.println("\nToday's date is: " + todayDate);

        //example2
        LocalDate currenDate = LocalDate.now();
        System.out.println("Today's date is: " + currenDate);


        //random package
        //example1
        Random random = new Random(); //creating random ojbect

        int randomNum1 = random.nextInt(21); //random numbers from 0 to 20
        System.out.println("\nThe random number between 0 and 20 is: " + randomNum1);

        //example2
        boolean randomBoo = random.nextBoolean();
        System.out.println("The random boolean is: " + randomBoo);


        //Timezone package
        //example1

        TimeZone timeZoneDefault = TimeZone.getDefault();
        System.out.println("\nThe default time zone is: " + timeZoneDefault);

        userInput.close();
    }
}
