import java.util.Scanner;
     public class Reverseadjacentelements{
          public static void main(String[] args){
             Scanner sc = new Scanner(System.in);
             String str = sc.nextLine();
             StringBuilder sb = new StringBuilder();
             for(int i=0; i<str.length()-1; i+=2){
              String result = str.substring(i, i+2);
                 sb.append(new StringBuilder(result).reverse());
             }
             if(str.length()%2!=0){
               sb.append(str.charAt(str.length()-1));
             }
             System.out.println(sb.toString());
 }
}