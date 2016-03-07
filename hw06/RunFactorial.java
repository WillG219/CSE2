//Will Gilbert
//CSE 2
//hw 6
//Program 2
//March 6, 2016

import java.util.Scanner;
public class RunFactorial{
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Please enter an integer that is between 9 and 16: ");
        while(!myScanner.hasNextInt()) {
            myScanner.next();
            System.out.println("Invalid Input, enter again!");
            System.exit(1);
            }
        int Num = myScanner.nextInt();
        int Fact = 1;
        if (Num <= 9 || Num >= 16){
            System.out.println("Invalid Input, enter again!");
            System.exit(1);
        }
        else{
        System.out.print("Input accepted: " + (Num) + "!");
        }
        while(Num > 0){
               Fact = Fact * Num;
               Num--;
           }
        System.out.println(" = " + Fact);
            }   
        }
    

        