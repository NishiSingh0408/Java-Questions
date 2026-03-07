import java.util.Scanner;
   public class LinearSearch{
      public static void main(String[] args){
           Scanner sc = new Scanner(System.in);
           int n = sc.nextInt();
           int[] arr = new int[n];
           for(int i=0; i<n; i++){
             arr[i] = sc.nextInt();
           }
           int target = sc.nextInt();    // find particular number
           int index = -1;               // assuming that no. is at this index
           for(int i=0; i<n; i++){
             if(arr[i] == target){
                index = i;
                break;
             }
           }
           System.out.println(index);
 }
}