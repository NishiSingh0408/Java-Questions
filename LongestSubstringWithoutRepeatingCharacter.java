import java.util.Scanner;
   public class LongestSubstringWithoutRepeatingCharacter{
       public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         String s = sc.nextLine();
         int[] lastSeenIndex = new int[128];
         for(int i=0; i<128; i++){
           lastSeenIndex[i] = -1;
         }
         int max = 0;
         int left = 0;
         for(int right = 0; right<s.length(); right++){
           char currentChar = s.charAt(right);
           if(lastSeenIndex[currentChar]>=left){
              left = lastSeenIndex[currentChar] + 1;
           }
           lastSeenIndex[currentChar] = right;
           max = Math.max(max, right-left+1);
         }
         System.out.println(max);
 }
}