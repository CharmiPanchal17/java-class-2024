public class Array2 {
    
    public static void main(String[] args) {
        
        String[] fruit = {"Apples", "Mangos", "Berries", "Cherries", "Bananas"};

        //using for loop to print each fruit
        for(int x=0; x<fruit.length; x++){
            System.out.println(fruit[x] + " are fruits.");
        }

        //using while loop to print all fruits except Cherries
        //method1
        int i=-1; //using -1 so that it increments to 0 for the first fruit

        while (i<fruit.length-1) {           //the length of the array is 4 but when it incremented by 1 it becomes 5 and fruit at index 5 is not there
            i++;                             //therefore you put -1

            if (fruit[i]== "Cherries") {
                continue;
            }

            System.out.println(fruit[i]);
        }

        //method 1
        int a=0;
        while (a<fruit.length) {
            if (a==3) {
                a++;
                continue;
            }
            System.out.println(fruit[a]);
            a++;
        }
    }
}
