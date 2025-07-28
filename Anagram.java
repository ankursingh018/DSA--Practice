import java.util.Scanner;
import java.util.Arrays;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String word1= sc.next();
        String word2= sc.next();
        
        System.out.println(anagram(word1,word2));
        
    }
    public static boolean anagram(String word1,String word2){
        if(word1.length()!=word2.length()){
            return false;
        }
        
        char [] arr1= word1.toLowerCase().toCharArray();
        char [] arr2= word2.toLowerCase().toCharArray();
        
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        
        return Arrays.equals(arr1,arr2);
    }
}
