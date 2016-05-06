import java.util.Scanner;
public class Prac{
    public static void main(String[] args){
        int num = (int)(Math.random()* 2);
        if(num == 1){
            System.out.println("HEADS");
        }
        if(num == 0){
            System.out.println("TAILS");
        }
        else{
            System.exit(-1);
        }
    }
}