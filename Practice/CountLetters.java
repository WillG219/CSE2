//This program generates 100 lowercase letters randomly and assigns them to an array of characters and counts the number of occurences of each letter in the array
public class CountLetters{
    public static void main(String[] args){
        char[] chars = createArray();
        System.out.println("The lowercase letters are: ");
        displayArray(chars);//calls displayArray method
        int [] counts = countLetters(chars); // calls countLetters method
        System.out.println();
        System.out.println("The occurences of each letter are: ");
        displayCounts(counts);
    } 
    
    public static char[] createArray() {
        char[] chars = new char[100];
        
        for(int i = 0; i < chars.length; i++){//This creates the lowercase letters randomly and assigns them to an array
        chars[i] = getRandomLowerCaseLetter();
        }
        return chars;
    }
    public static void displayArray(char[] chars){
        for(int i =0; i < chars.length; i++){//This displays the characters in the array 20 on each line
            if((i + 1) % 20 == 0){
                System.out.println(chars[i]);
            }
            else{
                System.out.print(chars[i] + " ");
            }
        }
    }
    public static int[] countLetters(char[] chars){
        int[] counts = new int[26]; 
        for(int i = 0; i < chars.length; i++){//This counts each lowercase letter in the array
        counts[chars[i] - 'a']++;
        }
        return counts;
    }
    public static void displayCounts(int[] counts){
        for(int i = 0; i < counts.length; i++){
            if((i+1) % 10 == 0){
                System.out.println(counts[i] + " " + (char)(i + 'a'));
            }
            else{
                System.out.print(counts[i] + " " + (char)(i + 'a') + " ");
            }
        }
    }
    public static char getRandomLowerCaseLetter() {
        return getRandomCharacter('a', 'z');
    }
    public static char getRandomCharacter(char ch1, char ch2){//This method generates the letters
        return (char)(ch1 + Math.random() * (ch2 - ch1 + 1));
    }
        
    }
