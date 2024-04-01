//how to return an object from our class
public class Number {
    
    public void display(int num){
        System.out.println("Number: "+ num);
    }

    public static void main(String[] args) {
         Number num1 = new Number();
         Number num2 = new Number();

         num1.display(10);
         num2.display(20);
    }
}
