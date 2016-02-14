//Will Gilbert
//February 14, 2016
//Lab 03
//CSE 2
//The purpose of this lab is to write a program that uses the Scanner class to obtain from the user the original cost of the check, the percentage tip they wish to pay, and the number of ways the check will be split.

//first compile the program
//  javac Check.java
//run the program
//  java Check//
import java.util.Scanner; //this imports the Scanner class
public class Check{
    public static void main(String[] args){
        Scanner myScanner = new Scanner( System.in ); //declares an instance of the Scanner object and call the Scanner constructor.
        System.out.print("Enter the original cost of the check in the form xx.xx: "); //prompts the user to enter the original cost of the check.
        double checkCost = myScanner.nextDouble(); //accepts user input
        System.out.print("Enter the percentage tip that you wish to pay as a whole number (in the form xx): ");//prompts the user to enter the percentage tip.
        double tipPercent = myScanner.nextDouble(); //accepts user input
        tipPercent /= 100; //We want to convert the percentage into a decimal value
        System.out.print("Enter the number of people who went out to dinner: "); //prompts the user to enter the number of people who went out dinner
        int numPeople = myScanner.nextInt(); //accpets user input
        double totalCost;
        double costPerPerson;
        int dollars, //whole dollar amount of cost 
                dimes, pennies; //for storing digits
          //to the right of the decimal point 
          //for the cost$ 
        totalCost = checkCost * (1 + tipPercent);
        costPerPerson = totalCost / numPeople; 
        //get the whole amount, dropping decimal fraction
        dollars=(int)costPerPerson; 
        //get dimes amount, e.g., 
        // (int)(6.73 * 10) % 10 -> 67 % 10 -> 7
        //  where the % (mod) operator returns the remainder
        //  after the division:   583%100 -> 83, 27%5 -> 2 
        dimes=(int)(costPerPerson * 10) % 10;
        pennies=(int)(costPerPerson * 100) % 10;
        System.out.println("Each person in the group owes $" + dollars + '.' + dimes + pennies);

}
}