import java.util.Scanner;
     public class CountDominantIndices{
         public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0; i<n; i++){
               arr[i] = sc.nextInt();
            }
            double sum = 0;
            for(int i=0; i<arr.length; i++){
                sum+=arr[i];
            }
             int count = 0;
             int m = arr.length;
            for(int i=0; i<arr.length; i++){
                sum-=arr[i];
                 m-=1;
                 if(arr[i]>(sum/m)){
                   count++;
                 }
            }
            System.out.println(count);
 }
}