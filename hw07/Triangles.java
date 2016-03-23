//Will Gilbert
//CSE 2
//HW 7
//Assignment 2
//March 21, 2016

import java.util.Scanner;
public class Triangles{
    public static void main(String[] args){
        Scanner myScanner = new Scanner( System.in );
        System.out.println("Enter a number between 5 and 30: ");
        while(!myScanner.hasNextInt()) {
            myScanner.next();
            System.out.println("Sorry, your input must consist of integers.");
            System.exit(1);
            }
        int num = myScanner.nextInt();
        
        if(num < 5 || num > 30){//This determines whether the input the user entered is valid.
            System.out.println("Input Invalid!");
            System.exit(1);
        }
        else{
            
        System.out.println("For Loop: ");
        for(int i = 1; i <= num; i++) {
            for(int j = 1; j <= i; j++){
                System.out.print(i);//Prints out the top of pyramid. It goes 1 and then 22 and then 333, etc.
            }
            System.out.print("\n");//inserts a new line
        }
        for(int i = 1; i <= (num - 1); i++){
            for(int j = 1; j <= (num - i); j++){
                System.out.print((num - i));// this prints out the bottom of the pyramid. it goes 4444 to 333 to 22 to 1.
            }
            System.out.print("\n");
        }
        
        int i = 1;
        int j = 1;
        
        System.out.println("While Loop: ");
        
        while(i <= num){
            while(j <= i){
                System.out.print(i);//prints out the first line
                j++;//increments
            }
            j = 1;
            i++;
            System.out.print("\n");
        }
        i = 1;
        j = 1;
        while(i <= (num - 1)){
            while(j <= (num - i)){
                System.out.print(num - i);
                j++;
            }
            j = 1;
            i++;
            System.out.print("\n");
        }
        System.out.println("Do-While Loop: ");
        j = 1;
        i = 1;
        do{
            do{
                System.out.print(i);
                j++;
            }
            while(j <= i);
            j = 1;
            i++;
            System.out.print("\n");
        }
        while(i <= num);
        j = 1;
        i = 1;
        do{
            do{
                System.out.print(num - i);
                j++;
            }
            while(j <= (num - i));
            j = 1;
            i++;
            System.out.print("\n");
        }
        while(i <= (num - 1));
    
        }
    }
}
        