//CSE 2
//Will Gilbert
//May 2, 2016
//HW 13
import java.util.Scanner;

public class Holoporter{
    public static void main(String[] args){
     String [][][] array = SoRandom();   
    }//End of Main Method
    
    public static String [][][] soRandom(){
        int RanLen = (int)(Math.random() * 9);
        int RanLen2 = (int)(Math.random() * 9);
        int RanLen3 = (int)(Math.random() * 9);
        String [][][] Rando = new String[RanLen][][];
        for(int i = 0; i < RanLen; i++){
            Rando[i] = new String[RanLen2][];
            for(int j = 0; j < RanLen; j++){
            Rando[i][j] = new String[RanLen3];
        }
    } return Rando;
    }//End of SoRandom
    
    public static String coder(){
        String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String ret = "";
        for (int i = 0; i < 2; i++){
            int rand = (Math.random() * 25);
            ret = ret + letters.substring(rand, rand + 1);
        }
        String numbers = "0123456789";
        for (int i = 0; i < 4; i++){
            int rand = (Math.random() * 9);
            ret = ret + numbers.substring(rand, rand + 1);
        }
        return ret;
    }//End of coder
    
    public static void sampling(String key) {
       Scanner scan = new Scanner(System.in);
       while(true){
           if(Character.isLetter(key.charAt(0)) && Character.isLetter(key.charAt(1)) && Character.isDigit(key.charAt(2)) && Character.isDigit(key.charAt(3)) && Character.isDigit(key.charAt(4)) && Character.isDigit(key.charAt(5)) && Character.isUpperCase(key.charAt(0)) && Character.isUpperCase(key.charAt(1))){ //////////////
       break;
           } else {
               System.out.println("Not a Valid Code");
               key = scan.next();
           }
    }
    }//End of sampling
    
    public static void holoport(String[][][] source, String[][][] destination){
        for(int i = 0; i < destination.length; i++){
            for(int j = 0; j < destination[i].length; j++){
                for(int k = 0; k < destination[i][j].length; k++){
                    if(k >= source[i][j][k].length){
                        destination[i][j][k] = "$$$$$$";
                    }else{
                        destination[i][j][k] = source[i][j][k];
                    }
                }
            }
        }
    }//End of holoport 
    
    //Frankenstein method
    public static String[][][] Frankenstein(String[][][] mainArray){
    int x = 0;
        for(int i = 0; i < mainArray.length; i++){
            for(int j = 0; j < mainArray[i].length; j++){
                for(int k = 1; k < mainArray[i][j].length; k++){
                      x = k;
                      while(mainArray[i][j][x].compareTo(mainArray[i][j][x - 1]) < 0){
                        String temp = mainArray[i][j][pointer - 1];
                         mainArray[i][j][x - 1] = mainArray[i][j][x];
                        mainArray[i][j][x] = temp;
                        x--;
                    if(x == 0){
                      x = 0;
                      break;
                      
                     }
                 }
            }
                  
         }
    }
        for(int i = 0; i < mainArray.length; i++){
            for(int j = 1; j < mainArray[i].length; j++){
                      x = j;
                      while(mainArray[i][x].length < mainArray[i][x - 1].length){
                        String[] temp = mainArray[i][x - 1];
                         mainArray[i][x - 1] = mainArray[i][x];
                        mainArray[i][x] = temp;
                        x--;
                    if(x == 0){
                      break;
                  }
            }
        }
                  
    }
    return mainArray;
}//End of frankenstein

public static String percentage(String[][][] array, String[][][] array2){
        int counter = 0;
        int counter2 = 0;
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length; j++){
                for(int k = 0; k < array[i][j].length; k++){
                    counter++;
                }
            }
        }
        for(int i = 0; i < array2.length; i++){
            for(int j = 0; j < array2[i].length; j++){
                for(int k = 0; k < array2[i][j].length; k++){
                    counter2++;
                }
            }
        }
        
        double num = ((double)(counter2 - counter) / counter);
        double percent = num * 100;
        System.out.print("Percentage: " + ((int)(percent*100) / 100.00) + "%");
    }//End of percentage

}//End of Class    