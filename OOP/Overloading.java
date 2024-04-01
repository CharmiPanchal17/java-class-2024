import java.util.Scanner;

public class Overloading {

    String name;
    int age;

    Scanner input = new Scanner(System.in);

    public Overloading(){
        System.out.println("This constructor has no parameters.....");
    }

    public Overloading(String n){
        this.name = n;
    }

    public Overloading(int a){
        this.age = a;
    }

    public Overloading(String name, int age){
        this.name = name;
        this.age = age;
    }
    
    public void StudentName(){

        System.out.print("Enter student name: ");
        name = input.nextLine();

        System.out.printf("Student's name is: %s\nox", name);
    }

    public void StudentAge(){

        System.out.print("Please enter student's age: ");
        age = input.nextInt();

        System.out.printf("Student's age is: %d\n", age);

    }


    public static void main(String[] args) {
        
        Overloading student1 = new Overloading();
        student1.StudentAge();
    }
}
