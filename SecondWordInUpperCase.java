import java.util.Scanner;
     public class SecondWordInUpperCase{
           public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                String input = sc.nextLine();
                String[] words = input.trim().split("\\s+");
                if(words.length>=2){
                  System.out.println(words[1].toUpperCase());
                }
                else{
                  System.out.println("LESS");
                }
 }
}