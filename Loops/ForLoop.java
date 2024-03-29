
public class ForLoop{
    public static void main(String[] args) {

        // for loop example 
        for( int x = 1; x<= 10; x++){
            System.out.println(x);
        }

        System.out.print("\n");

        // this is decrementing.. 
        for(int i =10; i>= 1; i--){
            System.out.println(i);
        }

        System.out.print("\n");
        
        // for even numbers
        for(int y=1; y<= 10; y++){
            if(y%2==0){
                System.out.println(y);
            }
        }
    }
}

