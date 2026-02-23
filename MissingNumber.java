import java.util.Scanner;
     public class MissingNumber{
         public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int count = 0;
            int sum = 0;
            while(n>0){
               count++;
               sum+= n%10;
               n/=10;
            }
             n = count+1;
             int total = n*(n+1)/2;
             System.out.println(total-sum);
 }
}