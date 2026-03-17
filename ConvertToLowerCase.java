import java.util.Scanner;
   public class ConvertToLowerCase{
      public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         String str = sc.nextLine();
         char[] ch = str.toCharArray();
         for(int i=0; i<ch.length; i++){
            if(ch[i]>='A' && ch[i]<='Z'){
              ch[i] = (char)(ch[i] + 32);
            }
         }
         System.out.println(ch);
 }
}