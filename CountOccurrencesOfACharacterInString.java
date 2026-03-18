import java.util.Scanner;
   public class CountOccurrencesOfACharacterInString{
       public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char ch = sc.next().charAt(0);
        char[] c = str.toCharArray();
        int count = 0;
        for(int i=0; i<c.length; i++){
          if(c[i] == ch){
            count++;
          }
        }
        System.out.println(count);
 }
}