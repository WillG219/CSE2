//Will Gilbert
//February 20, 2016
//Lab 04
//CSE 2
//The Purpose of this lab is to practice using if statements, switch statements and using Math.random(). 
//first compile the program
//  javac CardGenerator.java
//run the program
//  java CardGenerator//

public class CardGenerator{
    public static void main(String[] args){
        int card = (int)(Math.random()*52);
        if(card =< 13 && card >= 1){
            switch(card){
                case 1:
                    System.out.println("Ace");
                    break;
                case 2:
                    System.out.println("2");
                    break;
                case 3:
                    System.out.println("3");
                    break;
                case 4:
                    System.out.println("4");
                    break;
                case 5:
                    System.out.println("5");
                    break;
                case 6:
                    System.out.println("6");
                    break;
                case 7:
                    System.out.println("7");
                    break;
                case 8:
                    System.out.println("8");
                    break;
                case 9:
                    System.out.println("9");
                    break;
                case 10:
                    System.out.println("10");
                    break;
                case 11:
                    System.out.println("Jack");
                    break;
                case 12:
                    System.out.println("Queen");
                    break;
                case 13:
                    System.out.println("King");
                    break;
            }
        }
    }
}