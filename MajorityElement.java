import java.util.Arrays;
import java.util.Scanner;
   public class MajorityElement{
      public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
         int[] nums = new int[n];
         for(int i=0; i<n; i++){
           nums[i] = sc.nextInt();
         }
         if(n>0){
         Arrays.sort(nums);
         System.out.println(nums[nums.length/2]);
         }
 }
}