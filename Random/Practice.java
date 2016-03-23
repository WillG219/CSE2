
import java.util.Scanner;
public class Practice{
    public static void main(String[] args){
        Scanner myScanner = new Scanner( System.in );
        System.out.println("Enter a number between 5 and 30: ");
        int num = myScanner.nextInt();
        for(int i = 1; i <= (num - 1); i++){
            for(int j = 1; j <= (num - i); j++){
                System.out.print((num - i));// this prints out the other numbers until (num - i) equals zero again. 
            }
            System.out.print("\n");
        }
    }
}