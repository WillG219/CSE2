//Will Gilbert
//March 28. 2016
//CSE 2
//HW 9
//Program 2
//This program will have two methods that both return 
//void and have the same name. Except one method will accept int and 
//the other will accept string. The int method will print out a square 
//of % and the string method will print the string out the same number 
//of times as there are characters in the string.

import java.util.Scanner;
public class Rectangularize{
    public static void recMeth(int x){
        for(int i = 0; i < x; i++){
            for(int j = 0; j < x; j++){
                System.out.print("%");
            }
            System.out.println();
        }
    }
    public static void recMeth(String y){
        for(int i = 0; i < y.length(); i++){
            System.out.println(y);
        }
    }
    public static void main(String[] args){
        Scanner rectan = new Scanner(System.in);
        System.out.println("Please enter an input: ");
        if(rectan.hasNextInt()){
            int x = rectan.nextInt();
            recMeth(x);
        }
        else {
            String x = rectan.nextLine();
            recMeth(x);
        }
    }
}
    