//Will Gilbert
//CSE 2
//hw 6
//Program 1
//March 6, 2016
//first compile the program
//  javac Fibonacci.java
//run the program
//  java Fibonacci//
import java.util.Scanner;
public class Fibonacci{
    public static void main(String[] args){
        
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Please enter 3 positive integers.");
        System.out.print("Enter the first number in the sequence: ");
        int A1 = myScanner.nextInt();
        System.out.print("Enter the second number in the sequence: ");
        int A2 = myScanner.nextInt();
        int A = A2;
        System.out.print("How many custom Fibonacci numbers should be printed? ");
        int N = myScanner.nextInt();
        int counter = 3;
        if (A1 <= 0 || A2 <= 0 || N <= 0){
            System.out.println("ERROR! User cannot enter negative values or 0");
            System.exit(1);
        }
               else if (N==1){
                   System.out.println("The number is: "+ A1);
               }
               else if (N==2){
                   System.out.println("The numbers are: "+ A1 +", "+ A2);
               }
               else{
                   System.out.print("The numbers are: " + A1 + ", " + A2);
                   for (counter = 3; N >= counter; counter++){
                      A = A1 + A2;
                       System.out.print(", " + A);
                       A1 = A2;
                       A2 = A;
                   }
                   System.out.print(".\n");
               }
               
           }
}
        