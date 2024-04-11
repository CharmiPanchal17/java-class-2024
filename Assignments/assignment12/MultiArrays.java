public class MultiArrays{

    public static void main(String[] args) {
        // example 1

        int[][] array1 = {{1,2}, {3,4}, {5,6}};

        System.out.println("The value on index [1][1] is: " + array1[1][1]);

        // example 2

        int[][] array2 = new int[5][10];      //this stores 50 elements

        System.out.println("\nThe value on index [0][0] is: " + array2[0][0]);
        System.out.println("The value on index [2][1] is: " + array2[2][1]);

        System.out.println(" ");

        // example 3

        int[][] array3 = {{5,6}, {7,8}, {9,10}};

        for(int i = 0; i < array3.length; i++){
            for(int j = 0; j < array3[i].length; j++){
                System.out.print(array3[i][j] + " ");
            }
            System.out.println();
        }
    }
}