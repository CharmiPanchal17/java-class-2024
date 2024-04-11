//this is the parent class
class Shape{

    public int length;
    public int width;

    public Shape(int l, int w){
        this.length = l;
        this.width = w;
    }

    public String drawShape(){
        return "This is a shape";
    }

}

// this is the child class
class Circle extends Shape{

    //this is overriding the fields
    public double radius;

    public Circle(int l, int w, double r){
        super(l, w);
        this.radius = r;
    }

    public String drawShape(){
        return "This is a circle";
    }

    public double calculateArea(double radius){
        return Math.PI*radius*radius;
    }
}

//this id the driver class
public class Example1 {
    
    public static void main(String[] args) {
        Circle circle1 = new Circle(0, 0, 0.0);

        String draw = circle1.drawShape();
        double area1 = circle1.calculateArea(10.0);

        System.out.println(draw);
        System.out.println("The area of the circle is: " + area1);
    }
}
