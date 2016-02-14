//Will Gilbert
//February 14, 2016
//CSE 2
//HW 03

//compile the program
//  javac Convert.java
//run the program 
//  java Convert//

import java.util.Scanner;
public class Convert{
    public static void main(String[] args){
        Scanner myScanner = new Scanner( System.in );
        System.out.print("Enter a measurement in meters in the form xx.xx: ");
        double Meters = myScanner.nextDouble();
        double Inches;
        Inches = Meters * (39.3701);
        System.out.println(Meters + " meters is " + Inches + " inches.");
    }
}