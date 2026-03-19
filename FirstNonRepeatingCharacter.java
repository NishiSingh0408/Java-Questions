import java.util.Scanner;
   public class FirstNonRepeatingCharacter{
        public static void main(String[] args){
          Scanner sc = new Scanner(System.in);
          String str = sc.nextLine();
          String a = "";
          for(char b : str.toCharArray()){
             if(a.indexOf(b)>=0){
               continue;
             }
             else{
                a = a+b;
             }
          }
          System.out.print(a);
 }
}