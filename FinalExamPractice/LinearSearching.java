//This method shows us how to perform Linear Search
import java.util.Scanner;
public class LinearSearching{
    public static int linearSearch(int[] list, int key){
        for(int i = 0; i < list.length; i++){
            if(key == list[i]){
                return i;
            }
            return -1;
        }return key;
    }
    public static void main(String[] args){
            Scanner scan = new Scanner(System.in);
            System.out.println("Please Enter 7 numbers: ");
        
            int[] list = new int[7];
            for(int i = 0; i < list.length; i++){
                list[i] = scan.nextInt();
            }
            
            System.out.println("Please enter a number to be searched: ");
            int key = scan.nextInt();
            
            int x = linearSearch(list, key);//This calls the linearSearch method
            
            System.out.println("[" + x + "]");
    }
}
            
            
            