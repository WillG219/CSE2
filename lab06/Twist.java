//Will Gilbert
//CSE 2
//Lab 6
//The purpose of this lab is to write a program that will print out a simple "twist" on the screen.
//March 4, 2016
//first compile the program
//  javac Twist.java
//run the program
//  java Twist//
import java.util.Scanner;
public class Twist{
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        System.out.print("PLease enter length of twist: ");
        int length = myScanner.nextInt();
        int fullTwist = (length/3);
        int partTwist = (length%3);
        int counter = 1;
        while (fullTwist >= counter) {
                System.out.print("\\ /");
                counter++;
            }
            if(partTwist == 0){
                System.out.printf("\n");
                counter = 1;
            }
            else if(partTwist == 1){
                System.out.print("\\");
                System.out.printf("\n");
                counter = 1;
            }
            else if(partTwist == 2){
                System.out.print("\\ ");
                System.out.printf("\n");
                counter = 1;
            }
            while (fullTwist >= counter) {
                System.out.print(" X ");
                counter++;
            }
            if(partTwist == 0){
                System.out.printf("\n");
                counter = 1;
            }
            else if(partTwist == 1){
                System.out.print("");
                System.out.printf("\n");
                counter = 1;
            }
            else if(partTwist == 2){
                System.out.print(" X ");
                System.out.printf("\n");
                counter = 1;
            }
            while (fullTwist >= counter) {
                System.out.print("/ \\");
                counter++;
            }
            if(partTwist == 0){
                System.out.printf("\n");
                counter = 1;
            }
            else if(partTwist == 1){
                System.out.print("/");
                System.out.printf("\n");
                counter = 1;
            }
            else if(partTwist == 2){
                System.out.print("/ ");
                System.out.printf("\n");
                counter = 1;
            }
        }
    }

