import java.util.Scanner;

public class Person {

    // fields
    private String name;   //private fields are not accessed outside the class Person
    private int age;

    // constructor
    public Person(String name, int age) {     //a constructor has parenthisis while a class doesnot
        this.name = name;           //"this" is the current instance
        this.age = age;
    }

    // methods 
    public void greet(){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your name: ");
        name = input.nextLine();

        System.out.print("Enter your age: ");
        age = input.nextInt();

        System.out.println("Hello!!!\nYour name is: " + name + "\nYour age is: " + age + " years");

        input.close();
    }

    public static void main(String[] args) {          //the main method should always be there. it s from which object are created
 
        Person person1 = new Person("null", 0);  // we have to set default values whcih can be overriden b user input eg on line 20..
        person1.greet();                             // the "new" keyword evokes the constructor
    }
    
}
