import java.util.Scanner;
   public class TwoStringsAreRotationOfEachOther{
        public static void main(String[] args){
          Scanner sc = new Scanner(System.in);
          String s1 = sc.nextLine();
          String s2 = sc.nextLine();
          if(s1.length()!=s2.length() || s1.length()==0){
            System.out.println("not");
          }else{
          String s = s1 + s1;
             if(s.contains(s2)){
                System.out.println("Are rotation");
             }
             else{
               System.out.println("not");
             }
           }
 }
}