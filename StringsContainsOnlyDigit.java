import java.util.Scanner;
   public class StringsContainsOnlyDigit{
       public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         String s  = sc.nextLine();
         char[] ch = s.toCharArray();
         boolean isDigit = true;
         for(int i=0; i<ch.length; i++){
           char c = ch[i];
           if(c>='0' && c<='9'){
             isDigit = true;
           }
           else{
             isDigit = false;
             break;
           }
         }
         if(isDigit){
           System.out.println("Contains only digit");
         }
         else{
           System.out.println("not");
         }
 }
}