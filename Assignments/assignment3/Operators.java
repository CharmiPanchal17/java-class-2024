/* Operators in java include;

Arithmetical operators- Addition (+)
                        Subtraction (-)
                        Multiplication (*)
                        Division (/)
                        Modulus (%): Returns the remainder after division.
                        Increment (++)

Comparision operators-Equal to (==): Checks if two values are equal.
                      Not equal (!=): Checks if two values are not equal.
                      Greater than (>), Less than (<), Greater than or equal to (>=), and Less than or equal to (<=).

Assignment operators-Simple Assignment (=): Assigns a value to a variable.
                     Addition Assignment (+=): Adds a value to a variable.
                      
Logical operators-Logical AND (&&): Returns true if both statements are true.
                  Logical OR (||): Returns true if at least one statement is true.
*/ 

// Examples of arithmetical operators

import java.util.Scanner;    // this import is used for user to input

public class Operators{
    
    public static void main(String[] args){
        // addition
        // example 1
        int a = 10;
        int b = 11;

        int sum = a + b;
        System.out.println("The sum of " + a + " and " + b +  " is: " + sum);

        // example2   using "+" operator for concatenating strings

        String first_name = "Charmi";
        String second_name = "Panchal";

        System.out.println("Hello World, my name is " + first_name + " " + second_name );



        // subraction
        // example 1
        int c = 20;
        int d = 11;

        int diff = c - d;
        System.out.println("The differance of " + c + " and " + d +  " is: " + diff);

        // example2   using user input values

        Scanner my_var = new Scanner(System.in);
        
        System.out.print("Enter the first number: ");
        int num1 = my_var.nextInt();
        
        System.out.print("Enter the second number: ");
        int num2 = my_var.nextInt();
        
        int differance = num1 - num2;
        
        System.out.println("The differance of the two numbers is: " + differance );
        
        // Close the scanner
        my_var.close();



        // division
        // example1

        int n1 = 20;
        int n2 = 3;

        int quo = n1 / n2;
        System.out.println("The quotient of " + n1 + " and " + n2 +  " is: " + quo);

        // example2  using the modulus operator
        int remainder = n1 % n2;
        System.out.println("The remainder of " + n1 + " / " + n2 +  " is: " + remainder);



        // increment
        // example1

        int num = 10;

        int pre_increment_num = ++num;
        System.out.println("The number after pre_increment: " + pre_increment_num);

        // example2
        int post_increment_num = num++;
        System.out.println("The number after post_increment: " + post_increment_num);

        System.out.println("The final number after post_increment: " + num);



        // comparision
        // example1
        int number1 = 10;
        int number2 = 12;

        boolean greater_than_result = number1>number2;

        System.out.println("Is number1 greater than number2?: " + greater_than_result);

        // example2
        boolean lessthan_result = number1<number2;

        System.out.println("Is number1 less than number2?: " + lessthan_result);








    }
}


