//Will Gilbert
//CSE 2
//April 18, 2016
//Program 1
import java.util.Scanner;
import java.util.Random;


public class CSE2Linear{
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 15 ints for final grades in CSE2: ");
        int[] Search = new int[15];
        int prev = 0;
        for(int i = 0; i < Search.length; i++){
            while(!scan.hasNextInt()){
                System.out.println("ERROR! Not an integer");
                scan.next();
            }
            int temp = scan.nextInt();
            while(true){
                if (temp >= prev && temp >= 0 && temp <= 100){
                    break;
                }
                else{
                    System.out.println("Not valid");
                    while(!scan.hasNextInt()){
                System.out.println("ERROR! Not an integer");
                scan.next();
                    }
                    temp = scan.nextInt();
                }
            }
            prev = temp;
        }
    //calls the scramble method
        int [] x = scrambleArray(Search);
        System.out.println("Scrambled: ");
        for(int i = 0; i < x.length; i++){
            System.out.print(x[i] + " ");
        }
        System.out.println();
       
        System.out.println("Enter a grade to search for: ");
        int num = scan.nextInt();
        //calls the linear Search method
        int y = linearSearch(num, Search);
    
        if(y != -1){
               System.out.println(num + " was found with " + y + " iterations.");
        }
       else{
           System.out.println(num + " was not found with " + Search.length + " iterations.");
       }
    }//end of main method
    
    //Scramble Method
    public static int[] scrambleArray(int [] x){
        Random shuffle = new Random();
        for(int i = 0; i < x.length; i++){
            int j = shuffle.nextInt(x.length);
            int sub = x[i];
            x[i] = x[j];
            x[j] = sub;
        }
        return x;
}//end of scramble method
    //Linear Search Method
    public static int linearSearch(int key, int [] Search){
    for(int i = 0; i < Search.length; i++){
        if(Search[i] == key){
            return i + 1;
        }
    }
    return -1;
}// end of linear search method
}//end of class
        
        
        
       