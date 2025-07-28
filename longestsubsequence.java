import java.util.Scanner;
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int [] nums= new int [n];
        for(int i=0;i<nums.length;i++){
            nums[i]=sc.nextInt();
            
        }
        System.out.println(longestSubsequence(nums));
    }
    public static int longestSubsequence(int [] nums){
        Set<Integer> set = new HashSet<>();
        for(int num:nums){
            set.add(num);
        }
        int longest=0;
      
        for(int num:set){
            if(!set.contains(num-1)){
                 int length=1;
                 int current=num;
            
            while(set.contains(current+1)){
                 length++;
                current++;
            }
            longest=Math.max(longest,length);
        }
        }
        return longest;
    }
}
