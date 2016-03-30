//Will Gilbert
//CSE 2
//HW 7
//Assignment 1
//March 21, 2016

import java.util.Scanner;
public class Twisty{
    public static void main(String[] args){
        Scanner myScanner = new Scanner( System.in );
        
        System.out.println("Input your desired length: ");
        while(!myScanner.hasNextInt()) {
            myScanner.next();
            System.out.println("Sorry, your input must consist of integers.");
            System.exit(1);
            }
        int length = myScanner.nextInt();
        
        System.out.println("Input your desired width: ");
        while(!myScanner.hasNextInt()) {
            myScanner.next();
            System.out.println("Sorry, your input must consist of integers.");
            System.exit(1);
            }
        int width = myScanner.nextInt();
        
        if(width > length){
            System.out.println("Please input an integer smaller than the length.");
            System.exit(1);
        }
        else if(length >= 80){
            System.out.println("Please input an integer smaller than 80.");
            System.exit(1);
        }
        for(int i = 0; i < width; i++){//Outer for loop
            for(int j = 0; j < length; j++){//inner for loop 
                for( int k = 0; k < i; k++){//the spacing
                    System.out.print(" ");
                    j++;
                }
                System.out.print("#");
                j++;
                for(int k = (width - i); k > 1; k--) {//prints the spacing 
                    System.out.print(" ");
                    j++;
                }
                for(int k = (width - i); k > 1; k--) {//prints the spacing to arrange the pattern properly
                    System.out.print(" ");
                    j++;
                }
                System.out.print("#");
                for(int k = 0; k < i; k++) {
                    System.out.print(" ");//for the spacing to keep arranging the pattern
                    j++;
                }
            }
            System.out.println();
        }
    }
}//I could not figure out how to incorporate the backslashes 
        