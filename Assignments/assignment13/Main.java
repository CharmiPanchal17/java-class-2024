import java.util.Scanner;

interface vehicle{
    String TYPE ="Four-Wheeler";      //we write constants in interfaces. and constants are written in uppercase
    //abstract methods
    String start();
    String stop();
    String getModel();
}

class Car implements vehicle{
    private String model;
    
    //constructor
    Car(String m){
        this.model=m;

    }
    //for using the abstract methods we override
    @Override
    public String start(){
        return "Starting the "+model;
    }

    @Override
    public String stop(){
        return "Stoping the "+model;
    }

    @Override
    public String getModel(){
        return model;
    }
}

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please Enter the Car Model: ");
        String carModel = scanner.nextLine();

        Car myCar = new Car(carModel);
        System.out.println("Car Model: "+myCar.getModel());
        System.out.println(myCar.start());
        System.out.println(myCar.stop());        
        System.out.println("Vehicle Type: "+vehicle.TYPE);
        scanner.close();

    }
}
