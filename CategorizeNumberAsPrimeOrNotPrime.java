import java.util.Scanner;
   public class CategorizeNumberAsPrimeOrNotPrime{
      public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        for(int num: arr){
           boolean isPrime = true;
           if(num<2){
              isPrime = false;
           }
           else{
             for(int i=2; i*i<=num; i++){
                if(num%i==0){
                  isPrime = false;
                  break;
                }
             }
           }
           if(isPrime){
              System.out.println("Prime");
           }
           else{
              System.out.println("Not Prime");
           }
        }
 }
}