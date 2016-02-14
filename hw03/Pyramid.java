//Will Gilbert
//February 14, 2016
//CSE 2
//HW 03

//Compile the program
//  javac Pyramid.java
//run the program
//  java Pyramid//

import java.util.Scanner; 
public class Pyramid{
    public static void main(String[] args){
        Scanner myScanner = new Scanner( System.in );
        System.out.print("The square side of the pyramid is (input length): ");
        double SquareSide = myScanner.nextDouble();
        System.out.print("The height of the pyramid is (input height): ");
        double Height = myScanner.nextDouble();
        double Volume;
        Volume = ((SquareSide)*(SquareSide)*(Height))/3;
        System.out.println("The volume inside the pyramid is: " + Volume +'.');
    }
}