import java.util.Scanner;

public class Person {

    // fields
    private String name;
    private int age;

    // constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // methods 
    public void greet(){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = input.nextLine();

        System.out.print("Enter your age: ");
        int age = input.nextInt();

        System.out.println("Hello!!!\nYour name is: " + name + "\nYour age is: " + age + " years");
    }

    public static void main(String[] args) {
 
        Person person1 = new Person("null", 0);  // we have to set default values whcih can be overriden b user input eg on line 20..
        person1.greet();
    }
    
}
