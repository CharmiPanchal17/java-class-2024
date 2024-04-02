class Person {
    protected String name;  //protected helps on the classes that inherit Person class to access th fields not any other fields
    protected int age;

    protected Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    protected void displayInfo(){
        System.out.println("Family Name: " +name);
        System.out.println("Age: " +age);
    }

}

class Student extends Person{
    private String student_name;

    public Student(String name, int age, String student_name){
        super(name, age);
        this.student_name = student_name;
    }

    public void displayStudentInfo(){
        System.out.println("Student Name: " +student_name);
        displayInfo();

    }
}


public class Main{

    public static void main(String[] args) {
        
        Student student1 = new Student("Doe", 30, "John");
        student1.displayStudentInfo();
    }
} 


