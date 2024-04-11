class Vehicle{

    public int gears;
    public String color;

    public Vehicle(int gears, String color) {
        this.gears = gears;
        this.color = color;
    }

    public String carSetup(int gear, String color) {
        return "This vehical has " + gear + " gears\nThe color of the vehicle is " + color;
    }
}

class Car extends Vehicle{

    public int wheels;

    public Car(int gears, String color, int wheels) {
        super(gears, color);
        this.wheels = wheels;
    }

    public String vehicalType(){
        return "This vehicle is a car";
    }

    public String carSetup(int gear, String color, int wheels) {
        return super.carSetup(gear, color) + "\nThe Car has " + wheels + " wheels";
    }
}

class Bicycle extends Vehicle {

    public int size;

    public Bicycle(int gears, String color, int size) {
        super(gears, color);
        this.size = size;
    }

    public String vehicalType(){
        return "This vehicle is a bicycle";
    }

    public String carSetup(int gear, String color, int size) {
        return super.carSetup(gear, color) + "\nThe Bicycle is of size:  " + size;
    }
}


public class Example2 {
    
    public static void main(String[] args) {
        
        Car vehicle1 = new Car(0, "", 0);
        Bicycle vehicle2 = new Bicycle(0, "", 0);

        String car1 = vehicle1.vehicalType();
        String car2 = vehicle1.carSetup(4, "Black", 4); 

        String bicycle1 = vehicle2.vehicalType();
        String bicycle2 = vehicle2.carSetup(5, "Blue", 10);

        System.out.println(car1);
        System.out.println(car2);   
        System.out.println(bicycle1);
        System.out.println(bicycle2);
    }
}
