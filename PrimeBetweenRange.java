import java.util.Scanner;
    public class PrimeBetweenRange{
        public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
          int start = sc.nextInt();
          int end = sc.nextInt();
          int count =0;
         for(int i=start;i<=end;i++){
              boolean isPrime = true;
              if(i<=1){
                isPrime = false;
              }
              else{
                for(int j=2;j*j<=i;j++){
                     if(i%j==0){
                        isPrime = false;
                         break;
                     }
                }
              }
              if(isPrime){
                 count++;
              }
         }
         System.out.println(count);
 }
}