public class MethodOverloading {
    
    public void convert(int num){
        System.out.println("Integer: "+ num);
    }

    public void convert(long num){
        System.out.println("Long: "+ num);
    }

    public static void main(String[] args) {
        
        MethodOverloading obj = new MethodOverloading();    //we leave an empty constructor

        obj.convert(1000000000000000L);   //when we enter an int it returns the 1st method while when a long is entered, a long is returned(2nd method)
    }
}
