import java.util.Scanner;

public class Cone {
    
    double radius;
    double length;
    double height;

    Scanner input = new Scanner(System.in);

    // default constructor
    public Cone(){
        this.radius = 2.0;
        this.length = 5.0;
        this.height = 4.0;
    }

    public Cone(double r, double l, double h){
        this.radius = r;
        this.length = l;
        this.height = h;

        System.out.print("Enter the radius of the cone2: ");
        radius = input.nextDouble();

        System.out.print("Enter the length of the cone2: ");
        length = input.nextDouble();

        System.out.print("Enter the height of the cone2: ");
        height = input.nextDouble();
    }

    // method to calculate area of the cone
    public double calculateArea(){
        return Math.PI*radius*(radius + length);

    }

    public double calculateVolume(){
        return ((1.0/3.0)*(Math.PI)*(radius*radius)*height);

    }

    public static void main(String[] args) {
        
        Cone cone1 = new Cone();
        Cone cone2 = new Cone(1,1,1);

        //calculating area and volume of cone1
        double area1 = cone1.calculateArea();
        double volume1 = cone1.calculateVolume();

        System.out.printf("The area of cone1 is: %f\n", area1);
        System.out.printf("The volume of cone1 is: %f\n", volume1);

        //calculating area and volume of cone2
        double area2 = cone2.calculateArea();
        double volume2 = cone2.calculateVolume();

        System.out.printf("The area of cone2 is: %f\n", area2);
        System.out.printf("The volume of cone2 is: %f\n", volume2);
    }
}
