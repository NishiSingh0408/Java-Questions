import java.util.Scanner;
   public class SumOFNonPrimeIndexValue{
       public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
         int[] arr = new int[n];
         long sum = 0;
         for(int i=0; i<n; i++){
           arr[i] = sc.nextInt();
           boolean isPrime = true;
           if(i<=1){
              isPrime = false;
           }
           else{
              for(int j=2; j<=Math.sqrt(i); j++){
                if(i%j==0){
                  isPrime = false;
                  break;
                }
              }
           }
           if(!isPrime){
              sum+=arr[i];
           }
         }
         System.out.println(sum);
 }
}