public class Methods {
    
    public int add(int a, int b){
        return a+b;
    }

    public int subtract(int c, int d){
        return c-d;
    }

    public int multiply(int e, int f){
        return e*f;
    }

    public double divide(double f, double h){
        return f/h;
    }

    public static void main(String[] args) {
        
        Methods operation = new Methods();

        int add1 = operation.add(10, 30);
        int sub1 = operation.subtract(23, 12);
        int mul1 = operation.multiply(25, 8);
        double div1 = operation.divide(45.0, 5.0);

        System.out.println("Addition result: "+ add1);
        System.out.println("Subtraction result: " + sub1);
        System.out.println("Multiplication result: " + mul1);
        System.out.println("Division result: " + div1);
    }
}
