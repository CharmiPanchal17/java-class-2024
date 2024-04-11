public class ContinueForLoop {
    
    public static void main(String[] args) {
        
        int x = 0;

        while (x<5) {
            x++;
            if (x == 3) {              //this skip number 3
                continue;
            }
            System.out.println(x);

        }

        System.out.println("-------------------\n");

        for(int i=1; i<=10; i++){            // i is both even and odd while j is only odd becoz even j numbers were skipped
            for(int j=1; j<=10; j++){
                if(j%2==0){
                    continue;
                }
                System.out.println(i + " , " + j);
            }
        }
    }
}
