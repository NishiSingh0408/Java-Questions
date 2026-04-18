import java.util.*;
   public class SquaresOfSortedArray{
     public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] n1 = new int[n];
        for(int i=0; i<n; i++){
           n1[i] = sc.nextInt();
        }
        for(int i=0; i<n; i++){
           n1[i] = n1[i]*n1[i];
        }
        Arrays.sort(n1);
        for(int i=0; i<n; i++){
          System.out.println(n1[i] + "");
        }
 }
}