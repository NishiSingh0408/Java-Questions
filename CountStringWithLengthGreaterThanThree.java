import java.util.Scanner;
import java.util.Arrays;
   public class CountStringWithLengthGreaterThanThree{
       public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
         sc.nextLine();
         String[] arr = new String[n];
         for(int i=0; i<n; i++){
            arr[i] = sc.nextLine();
         }
         int count = 0;
         for(int i=0; i<n; i++){
            if(arr[i].length()>3){
              count++;
            }
         }
         System.out.println(count);
 }
}