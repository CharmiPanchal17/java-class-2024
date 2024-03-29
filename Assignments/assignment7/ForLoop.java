public class ForLoop {
    
    public static void main(String[] args) {
        
        System.out.println("------------Even Numbers------------");
        //for even numbers
        for(int y=1; y<= 10; y++){
            if(y%2==0){
                System.out.println(y);
            }
        }
        System.out.println("------------Odd Numbers------------");
        
        //for odd numbers
        for(int x=1; x<= 10; x++){
            if(x%2!=0){
                System.out.println(x);
            }
        }
        System.out.println("------------Prime Numbers------------");

        // for prime numbers
        for(int a=2; a<=20; a++)
        {
            int flag = 0;
            
            for(int b=2; b<a; b++){
                if (a%b == 0) {
                    flag = 1;
                }
            }
            if (flag == 0) {
                System.out.println(a);
            }

        }
        System.out.println("------------------------------");
        
    }

}
