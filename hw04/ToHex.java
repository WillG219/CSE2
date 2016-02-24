//Will Gilbert
//February 22, 2016
//HW 04
//CSE 2
//first compile the program
//  javac ToHex.java
//run the program
//  java ToHex//
import java.util.Scanner;
public class ToHex{
    public static void main(String[] args){
        Scanner myScanner = new Scanner( System.in );
        System.out.println("Please enter three numbers representing RGB values");
        System.out.print("Enter value for R: ");
        while(!myScanner.hasNextInt()) {
            myScanner.next();
            System.out.println("Sorry, your input must consist of integers.");
            System.exit(1);
            }
        int Rvalue = myScanner.nextInt();
        System.out.print("Enter value for G: ");
        while(!myScanner.hasNextInt()) {
            myScanner.next();
            System.out.println("Sorry, your input must consist of integers.");
            System.exit(1);
            }
        int Gvalue = myScanner.nextInt();
        System.out.print("Enter value for B: ");
        while(!myScanner.hasNextInt()) {
            myScanner.next();
            System.out.println("Sorry, your input must consist of integers.");
            System.exit(1);
            }
        int Bvalue = myScanner.nextInt();
        
        
        String Rhex = "";
        String Ghex = "";
        String Bhex = "";
        while(Rvalue != 0) {
            int RH = Rvalue % 16;
            char RC;
            if (Rvalue > 255) {
            System.out.println("Sorry you must enter values between 0-255.");
            System.exit(1);
            }
            if(RH <= 9 && RH >= 0) {
                RC = (char)(RH + '0');
            }
            else{
                RC = (char)(RH - 10 + 'A');
                }
                Rhex = RC + Rhex;
                Rvalue = Rvalue / 16; 
        }
         while(Gvalue != 0) {
            int GH = Gvalue % 16;
            char GC;
            if (Gvalue > 255) {
            System.out.println("Sorry you must enter values between 0-255.");
            System.exit(1);
            }
            if(GH <= 9 && GH >= 0) {
                GC = (char)(GH + '0');
            }
            else{
                GC = (char)(GH - 10 + 'A');
                }
                Ghex = GC + Ghex;
                Gvalue = Gvalue / 16; 
        }
        
         while(Bvalue != 0) {
            int BH = Bvalue % 16;
            char BC;
            if (Bvalue > 255) {
            System.out.println("Sorry you must enter values between 0-255.");
            System.exit(1);
            }
            if(BH <= 9 && BH >= 0) {
                BC = (char)(BH + '0');
            }
            else{
                BC = (char)(BH - 10 + 'A');
                }
                Bhex = BC + Bhex;
                Bvalue = Bvalue / 16; 
        }
        
        System.out.println("The decimal numbers R:" + Rvalue + ", G:" + Gvalue + ", B:" + Bvalue + ", is represented in hexadecimal as: " + Rhex + Ghex + Bhex);
    }
}