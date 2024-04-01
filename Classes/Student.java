import java.util.Scanner;

public class Student {

    private String name;
    private int id;


    public Student(String name, int id){
        this.name = name;
        this.id = id;

    }

    public void student_data(){

        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter your name: ");
        name = scanner.nextLine();

        System.out.print("Enter your student id: ");
        id = scanner.nextInt();


        System.out.println("Your student id is: " + id + "\nYour name is: " + name);

        scanner.close();
        
    }
    
    public static void main(String[] args) {
        
        Student s1 = new Student("null",0);
        s1.student_data();
    }
}
