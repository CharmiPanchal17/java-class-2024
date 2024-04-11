import java.util.Scanner;

class Employee{

    public int salary;
    public int years_of_work; 

    public Employee(int salary, int years_of_work) {
        this.salary = salary;
        this.years_of_work = years_of_work;
    }

    public void employeeStatus(){
        System.out.println("This is an employee");
    }


}

class Teacher extends Employee{

    public String name;

    Scanner input = new Scanner(System.in);

    public Teacher(int salary, int years_of_work, String name){ 
        super(salary, years_of_work);
        this.name = name;
    }

    public void employeeStatus(){
        System.out.println("This employee is a teacher");
    }

    public String employeeData(){
 
        System.out.print("Enter your name: ");
        name = input.nextLine();

        System.out.print("Enter your salary please: ");
        salary = input.nextInt();

        System.out.print("Enter the number years of experience please: ");
        years_of_work = input.nextInt();

        return "\nYour name is: " + name + "\nThe salary you earn is: " + salary + "\nThe years of experience you have is: " + years_of_work;
    }



}

public class Example3 {
    
    public static void main(String[] args) {
        
        Teacher teacher1 = new Teacher(0, 0, "");

        teacher1.employeeStatus();
        String data2 = teacher1.employeeData();

        System.out.println(data2);

    }
}
