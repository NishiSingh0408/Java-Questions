import java.util.Scanner;
   public class RemoveDuplicatesFromSortedArray{
       public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
         int[] nums = new int[n];
         for(int i=0; i<n; i++){
           nums[i] = sc.nextInt();
         }
         if(nums.length==0){
           System.out.println("0");
         }
         int i = 0;
         for(int j=1; j<nums.length; j++){
             if(nums[i]!=nums[j]){
               i++;
               nums[i] = nums[j];
             }
         }
         System.out.println(i+1);
 }
}