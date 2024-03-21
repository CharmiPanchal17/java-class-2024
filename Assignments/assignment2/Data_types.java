

public class Data_types{
    public static void main(String[] args){
        // byte data type
        //example 1
        byte byte_variable1; //declaring the data type 'byte'
        byte_variable1=1;    //assigning a value to the byte variable

        System.out.println("The value of the byte variable is: " + byte_variable1);  // '+' is used to concatinate

        //example 2
        byte byte_variable2;
        byte_variable2=2;
        byte addition = (byte) (byte_variable1 + byte_variable2);      // we have to cast before adding the byte variables

        System.out.println("The sum of 1 and 2 is: " + addition);

        //example 3
        byte product = (byte) (byte_variable1 * byte_variable2);

        System.out.println("The product of 1 and 2 is: " + product);
        System.out.println("--------------------------------");

        //int data type
        //example 1
        int num1 = 10;
        int num2 = 20;

        System.out.println("Number 1 is: " + num1);
        System.out.println("Number 2 is: " + num2);

        //example 2
        int sum = num1 + num2;
        System.out.println("The sum of number1 and number2 is: " + sum);

        int division = num2/num1;
        System.out.println("Number1 divided Number2 is: " + division);
        System.out.println("--------------------------------");

        //float data type
        //example 1
        float float1 = 1.001f;  // suffix f indicates that it is a float
        float float2 = 2.5f;
        System.out.println("Float 1: " + float1);
        System.out.println("Float 2: " + float2);

        //example 2
        float mul = float1*float2;
        System.out.println("The product of the two floats is: " + mul);
        System.out.println("--------------------------------");


        //boolean data type
        boolean coding_is_fun = true;

        System.out.println("Is coding fun?: " + coding_is_fun);
        System.out.println("--------------------------------");

        //char data type

        char first_letter = 'C';

        System.out.println("The first letter of my name is: " + first_letter);


    }
}