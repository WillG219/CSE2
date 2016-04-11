//Will Gilbert
//lab 10
//CSE 2
//April 8, 2016
//The purpose of this lab is to create two arrays.

import java.util.Scanner;
public class Arrays{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int x = ((int)(Math.random()*5)+5);
        System.out.println("Enter " + x + " student names: ");
        String[] names = new String [x];
        for(int i = 0; i < x; i++){
            names[i] = scan.nextLine();
        }
        int y = ((int)(Math.random()*100));
        int[] midterm = new int [y];
        
        
    }
}
    