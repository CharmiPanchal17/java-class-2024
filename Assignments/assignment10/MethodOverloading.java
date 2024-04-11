

public class MethodOverloading {
    
    public String name;
    public int age;

    public MethodOverloading(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public MethodOverloading(){
        System.out.println("This constructor has no parameters.....");
    }

    public void dataDisplay(){
        System.out.println("This is being displayed");
    }

    public String dataDisplay(String name, int age){
        return "Your name is: " + name + "\nYour age is: " + age;
    }

    public static void main(String[] args) {
        MethodOverloading obj1 = new MethodOverloading();
        MethodOverloading obj2 = new MethodOverloading("", 0);

        obj1.dataDisplay();
        obj2.dataDisplay("Charmi", 19);
    }
}
