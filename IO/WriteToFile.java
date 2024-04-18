import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;


public class WriteToFile {
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the text you want: ");
        String data = input.nextLine();

        byte[] writeByte = data.getBytes();

        try(FileOutputStream fos = new FileOutputStream("Output.txt")){
            fos.write(writeByte);
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}
