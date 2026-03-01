import java.util.Arrays;
import java.util.Scanner;
    public class RotateArray{
         public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
             int n = sc.nextInt();
             int[] arr = new int[n];
             for(int i=0; i<n; i++){
                  arr[i] = sc.nextInt();
             } 
             int k = sc.nextInt();
             k=k%n;
             for(int i=0; i<k; i++){
               int first = arr[0];
               for(int j =0; j<n-1; j++){
                  arr[j] = arr[j+1];
               }
               arr[n-1] = first;
             }
             System.out.println(Arrays.toString(arr));
             sc.close();
             // first element moves to the end-left rotation
 }
}