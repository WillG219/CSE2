//Will Gilbert
//lab 10
//CSE 2
//March 25, 2016
//The purpose of this lab is to work with methods and generate random sentences

import java.util.Scanner;
import java.util.Random;
public class RanMeth{
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rando = new Random();
        while(true){
            System.out.println("The " + Adj() + " " + Adj() + " " + Sub() + " " + Verb() + " the " + Adj() +  " " + Obj() +  "." );
            System.out.print("Would you like to print another sentence (No = 0 & Yes = 1):");
            while (!scan.hasNextInt()){ 
                scan.next();
            }
            int X = scan.nextInt();
            
            if(X == 0){
                break;
            }
            else if (X < 0 || X > 1){
                System.out.println("ERROR! Invalid input.");
                break;
            }
        }
    }//End of Method
    public static String Adj(){
        //Assignment statement to generate a random number less than 10, then store it in randomInt
        Random rando = new Random();
        int ranInt = rando.nextInt(10);
        
        switch (ranInt){
            case 0:
                return("dirty");
            case 1:
                return("funny");
            case 2:
                return("weird");
            case 3:
                return("slick");
            case 4:
                return("funky");
            case 5:
                return("drunk");
            case 6:
                return("toasted");
            case 7:
                return("confused");
            case 8:
                return("lost");
            case 9:
                return("confident");
            default:
                return("cold");
        }
    }//End of Method Adjective
    public static String Sub(){
        //Assignment statement to generate a random number less than 10, then store it in randomInt
        Random rando = new Random();
        int ranInt = rando.nextInt(10);
        
        switch (ranInt){
            case 0:
                return("freshman");
            case 1:
                return("senior");
            case 2:
                return("deer");
            case 3:
                return("redneck");
            case 4:
                return("frat bro");
            case 5:
                return("cat");
            case 6:
                return("dog");
            case 7:
                return("homeless person");
            case 8:
                return("foreigner");
            case 9:
                return("toaster");
            default:
                return("refridgerator");
        }
    }//End of Method Subject
    public static String Verb(){
        //Assignment statement to generate a random number less than 10, then store it in randomInt
        Random rando = new Random();
        int ranInt = rando.nextInt(10);
        switch (ranInt){
            case 0:
                return("charged");
            case 1:
                return("kicked");
            case 2:
                return("punched");
            case 3:
                return("tricked");
            case 4:
                return("charmed");
            case 5:
                return("seduced");
            case 6:
                return("yelled at");
            case 7:
                return("saluted");
            case 8:
                return("mocked");
            case 9:
                return("arrested");
            default:
                return("shushed");
        }
    }//End of Method Verb
    public static String Obj(){
        //Assignment statement to generate a random number less than 10, then store it in randomInt
        Random rando = new Random();
        int ranInt = rando.nextInt(10);
        switch (ranInt){
            case 0:
                return("cow");
            case 1:
                return("caddy");
            case 2:
                return("car");
            case 3:
                return("golf cart");
            case 4:
                return("politician");
            case 5:
                return("bird");
            case 6:
                return("elephant");
            case 7:
                return("Jamaican");
            case 8:
                return("janitor");
            case 9:
                return("super model");
            default:
                return("pilot");
        }
    }
} 