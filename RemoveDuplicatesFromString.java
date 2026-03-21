import java.util.Scanner;
   public class RemoveDuplicatesFromString{
       public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         String str = sc.nextLine();
         char[] ch = str.toCharArray();
         int[] freq = new int[256];
         StringBuilder sb = new StringBuilder();
         for(int i=0; i<ch.length; i++){
            if(freq[ch[i]] ==0){
               sb.append(ch[i]);
               freq[ch[i]]++;
            }
         }
          System.out.println(new String(sb));
 }
}