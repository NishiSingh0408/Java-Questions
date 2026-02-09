import java.util.Scanner;
      public class PalindromeString{
            public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                String s = sc.next();
                StringBuilder s1 = new StringBuilder(s);
                s1.reverse();

                if(s.equals(s1.toString())){
                    System.out.println("Palindrome");
                }else{
                    System.out.println("Not a Palindrome");
                 } 
 }
}