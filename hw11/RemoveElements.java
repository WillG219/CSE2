//Will Gilbert 
//CSE 2
//Program 2
// April 18, 2016
import java.util.Random;
import java.util.Scanner;
public class RemoveElements{
  public static void main(String [] arg){
	Scanner scan=new Scanner(System.in);
    int num[]=new int[10];
    int newArray1[];
    int newArray2[];
    int index,target;
	String answer="";
	do{
  	System.out.print("Random input 10 ints [0-9]");
  	num = randomInput();
  	String out = "The original array is:";
  	out += listArray(num);
  	System.out.println(out);
 
  	System.out.print("Enter the index ");
  	index = scan.nextInt();
  	newArray1 = delete(num,index);
  	String out1="The output array is ";
  	out1+=listArray(newArray1); //return a string of the form "{2, 3, -9}"  
  	System.out.println(out1);
 
      System.out.print("Enter the target value ");
  	target = scan.nextInt();
  	newArray2 = remove(num,target);
  	String out2="The output array is ";
  	out2+=listArray(newArray2); //return a string of the form "{2, 3, -9}"  
  	System.out.println(out2);
  	 
  	System.out.print("Go again? Enter 'y' or 'Y', anything else to quit-");
  	answer=scan.next();
	}while(answer.equals("Y") || answer.equals("y"));
  }
 
  public static String listArray(int num[]){
	String out="{";
	for(int j=0;j<num.length;j++){
  	if(j>0){
    	out+=", ";
  	}
  	out+=num[j];
	}
	out+="} ";
	return out;
  }
  //method for random number generator 
  public static int[] randomInput(){
      int [] num = new int[10];
      Random input = new Random();
      for(int i = 0; i < num.length; i++){
          num[i] = input.nextInt(9);
      }
      return num;
  }
  //method for deleting position
  public static int[] delete(int list[], int pos){
      int delete1[] = new int[list.length - 1];
      for(int i = 0; i < delete1.length; i++){
          if( i >= pos){
              delete1[i] = list[i+1];
          }
          else{
              delete1[i] = list[i];
          }
      }
      return delete1;
  }
  public static int[] remove(int list[], int target){
    int x = 0;
    int y = 0;
    for(int i = 0; i < list.length; i++){
            if(list[i] == target){
                x++;
            }
    }
    int removal[] = new int[list.length - x];
    for(int i = 0; i < removal.length; i++){
        if(list[i] == target){
                y++;
                removal[i] = list[i + y];
        }
        else{
            removal[i] = list[i + y];
        }
    }
    return removal;
} 
  
  
}
