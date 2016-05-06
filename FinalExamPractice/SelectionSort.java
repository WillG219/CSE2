//This program performs Selection Sorting of single dimmensional Array
import java.util.Scanner;
public class SelectionSort {
    
    public static int[] selectionSort(int[] list){//This is the selection sort method
        for(int i = 0; i < list.length - 1; i++){
            int currentMin = list[i];
            int currentMinIndex = i;
         
         for(int j = i + 1; j < list.length; j++){
             if(currentMin > list[j]){
                 currentMin = list[j];
                 currentMinIndex = j;
             }
             }
             if(currentMinIndex != i){
                 list[currentMinIndex] = list[i];
                 list[i] = currentMin;
             }
         }return list;   
        }
        
        //This method asks the user for 7 numbers and calls the selection sort method. 
        public static void main(String[] args){
            Scanner scan = new Scanner(System.in);
            System.out.println("Please Enter 7 numbers: ");
        
            int[] list = new int[7];
            for(int i = 0; i < list.length; i++){
                list[i] = scan.nextInt();
            }
            
            int[] x = selectionSort(list);//This calls the selection sort method
            System.out.println("Sorted: ");
            for(int i = 0; i < x.length; i++){
                
            System.out.print(x[i] + " ");
        }
        System.out.println();
        }
        
    }
