//Will Gilbert
//March 28. 2016
//CSE 2
//HW 9
//Program 1

import java.util.Scanner;
public class Games{
    
    public static String Scrambler(String str){
        StringBuilder String1 = new StringBuilder();
        StringBuilder String2 = new StringBuilder(str);
        
        while(String2.length() > 0){
            int Scram = (int)(Math.random()*String2.length());
            String1.append(String2.charAt(Scram));
            String2.deleteCharAt(Scram);
        }
        return String1.toString();
    }
    
    public static void guessTheBox(){
        Scanner myBox = new Scanner(System.in);
        System.out.println("Choose a box between either 1, 2, or 3: ");
        int Box = myBox.nextInt();
        int BoxNum = (int)((Math.random()*2)+1);
        if (BoxNum == Box){
            System.out.println("WINNER!");
        }
        else if(Box > 3 || Box < 1){
            System.out.println("ERROR! please choose either 1, 2, or 3.");
            
        }
        else {
            System.out.println("Sorry, wrong guess.");
        }
        
        
    }
    public static void spinTheWheel(){
        Scanner myColor = new Scanner(System.in);
        Scanner mySpin = new Scanner(System.in);
        int X = 0;
        System.out.println("Choose a color Red or Black");
        String Color = myColor.nextLine();
        System.out.println("Pick a number between 1-5");
        int Spin = mySpin.nextInt();
        
        int colorWheel = (int)((Math.random()*2)+1);
        String colorWheel1 = "";
        String colorWheel2 = "";
        if(colorWheel == 1){
            colorWheel1 = "Red";
            colorWheel2 = "red";
            X = (int)((Math.random()*4)+1);
        }
         else if(colorWheel == 2){
            colorWheel1 = "Black";
            colorWheel2 = "black";
            X = (int)((Math.random()*4)+1);
        }
        
        if ((Color.equals(colorWheel1)) || (Color.equals(colorWheel2)) && Spin == X){
              
                System.out.println("WINNER! Your choice " + Color + " " + Spin + " is a match!");
            }
            else if ((!(Color.equals(colorWheel1))) && (!(Color.equals(colorWheel2))) || ((Spin != X))){
                System.out.println("Sorry, your choice " + Color + " " + Spin + " does not match the wheel spin " + colorWheel1 + " " + X);
            }
    }
    

    
    public static void main(String[] args){
        Scanner myScanner = new Scanner( System.in );
        
        System.out.println("Welcome to Will Gilbert's game center");
        System.out.println("Choose one of the three games: ");
        System.out.println("guessTheBox");
        System.out.println("spinTheWheel");
        System.out.println("Scrambler");
        String game = myScanner.nextLine();
        String guessTheBox = "guessTheBox";
         String spinTheWheel = "spinTheWheel";
          String Scrambler = "Scrambler";
        
        if((!(game.equals(guessTheBox))) && (!(game.equals(spinTheWheel))) && (!(game.equals(Scrambler)))){
        System.out.println("ERROR! Please choose one of the three options.");    
        System.exit(1);
        }
        else if(game.equals(guessTheBox)){
            guessTheBox();
            System.exit(1);
        }
        else if(game.equals(spinTheWheel)){
            spinTheWheel();
            System.exit(1);
        }
        else if(game.equals(Scrambler)){
            Scanner scramble = new Scanner(System.in);
            
            System.out.print("Please enter a word: ");
            String word = scramble.nextLine();
            System.out.println(Scrambler(word));
            System.exit(1);
        }
        
   
}
}
  
            