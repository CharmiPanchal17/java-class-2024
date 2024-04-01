import java.util.Scanner;

public class Grade {
    
    public static void main(String[] args) {

        int mark = 90;
        
        Scanner gradeInput = new Scanner(System.in);

        System.out.print("Enter the student's grade: ");
        mark = gradeInput.nextInt();

        if(mark >= 90){
            System.out.println("Grade obtained: A");
        }

        else if(mark >=80){
            System.out.println("Grade obtained: B");
        }

        else if(mark >=70){
            System.out.println("Grade obtained: C");
        }

        else if(mark >= 60){
            System.out.println("Grade obtained: D");
        }

        else{
            System.out.println("Grade obtained: E");
        }

        gradeInput.close();
    }
}
