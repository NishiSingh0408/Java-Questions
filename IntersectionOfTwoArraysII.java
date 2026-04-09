import java.util.*;
   public class IntersectionOfTwoArraysII{
      public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
         int[] num1 = new int[n];
         for(int i=0; i<n; i++){
            num1[i] = sc.nextInt();
         }
         int m = sc.nextInt();
         int[] num2 = new int[m];
         for(int i=0; i<m; i++){
           num2[i] = sc.nextInt();
         }
         Arrays.sort(num1);
         Arrays.sort(num2);
         int i=0;
         int j =0;
         int k=0;
         while(i<num1.length && j<num2.length){
             if(num1[i] < num2[j]){
               i++;
             }
             else if(num1[i]>num2[j]){
               j++;
             }
             else{
               num1[k++] = num1[i];
               i++;
               j++;
             }
         }
         System.out.println(Arrays.toString(Arrays.copyOfRange(num1, 0, k)));
 }
}