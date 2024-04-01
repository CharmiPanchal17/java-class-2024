public class Box {
    
    double length;
    double width;
    double height;

    // default constructor
    public Box() {
        this.length = 1.0;
        this.width = 2.0;
        this.height = 3.0;
    }

    // parameterized constructor
    public Box(double l, double w, double h) {
        this.length = l;
        this.width = w;
        this.height = h;
    }

    // method to calculate area of a box
    public double calculateArea() {
        return 2*((length*width) + (length*height) + (width*height));
    }

    // method to calculate perimeter of a box
    public double calculatePerimeter() {
        return 4*(length + width + height);
    }

    public static void main(String[] args) {
        
        Box box1 = new Box();          //this uses the default constructor
        Box box2 = new Box(10, 20, 30);

        // calculating area and perimeter of box1
        double area1 = box1.calculateArea();
        double perimeter1 = box1.calculatePerimeter();

        System.out.printf("Area of box1: %f\n", area1);
        System.out.printf("Perimeter of box1: %f\n", perimeter1);

        // calculating area and perimeter of box2
        double area2 = box2.calculateArea();
        double perimeter2 = box2.calculatePerimeter();

        System.out.printf("Area of box2: %f\n", area2);
        System.out.printf("Perimeter of box2: %f\n", perimeter2);
    }
}
