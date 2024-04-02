public class Array1 {

    public static void main(String[] args) {

        //initializing the array
        int[] numbers = {20,30,10,40};
        System.out.println("The first value of the array is: " + numbers[0]);
        System.out.println("The second value of the array is: " + numbers[1]);
        System.out.println("The third value of the array is: " + numbers[2]);
        System.out.println("The fourth value of the array is: " + numbers[3]);

        //incrementing
        for(int i=0; i<numbers.length; i++){
            System.out.println("The element at index " + i + " => " +numbers[i]);
        }

        //maximum
        int max = numbers[0];
        for(int x=0; x<numbers.length; x++){
            if(numbers[x] > max){
                max = numbers[x];
            }
        }
        System.out.println("The maximum value of the array is: " + max);
        
    }

}
