import java.util.Scanner;
  public class FreqOfEachCharacter{
      public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
         String str = sc.nextLine();
         char[] ch = str.toCharArray();
         int[] freq = new int[256];
         for(int i=0; i<ch.length; i++){
             freq[ch[i]]++;
         }
         for(int i=0; i<256; i++){
           if(freq[i]>0){
           System.out.println((char)i + " " + freq[i]);
           }
          }
 }
}