//Will Gilbert
//February 20, 2016
//Lab 04
//CSE 2
//The Purpose of this lab is to practice using if statements, switch statements and using Math.random(). 

public class CardGenerator{
    public static void main(String[] args){
        int card = (int)(Math.random()*52);//declared the card number, math.random generates a random number from 1-52.
        int suit = (int)(card/13);//variable for suit takes the random card number and divides by thirteen in order to keep the cases from 1-4 in the switch statement.
       
    switch (suit){//there are 4 suits so 4 cases
        case 0:
            System.out.println("Clubs");
            break;
        case 1:
             System.out.println("Hearts");
            break;
        case 2:
             System.out.println("Spades");
            break;
        case 3:
             System.out.println("Diamonds");
            break;
    }
    int num = card % 13;//this variable is declared in order to keep the 13 cases because the max remainder is 12. 
            switch(num){//this switch statement determines the number of the card
                case 0:
                    System.out.println("Ace");
                    break;
                case 1:
                    System.out.println("2");
                    break;
                case 2:
                    System.out.println("3");
                    break;
                case 3:
                    System.out.println("4");
                    break;
                case 4:
                    System.out.println("5");
                    break;
                case 5:
                    System.out.println("6");
                    break;
                case 6:
                    System.out.println("7");
                    break;
                case 7:
                    System.out.println("8");
                    break;
                case 8:
                    System.out.println("9");
                    break;
                case 9:
                    System.out.println("10");
                    break;
                case 10:
                    System.out.println("Jack");
                    break;
                case 11:
                    System.out.println("Queen");
                    break;
                case 12:
                    System.out.println("King");
                    break;
            }
             System.out.println("You have the " + num + " of " + suit);
        }
    }
