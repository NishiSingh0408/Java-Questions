import java.util.Scanner;
   public class DigitSum{
      public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         int number = sc.nextInt();
         int result = number;
         int temp;
         int sum;
         boolean isNegative = result<0;
         if(isNegative){
         result = -result;
         }
         while(result>9){
           sum = 0;
           temp = result;
           while(temp!=0){
             sum+=(temp%10);
             temp/=10;
           }
           result = sum;
         }
         if(isNegative){
            result = -result;
         }
         System.out.println(result);
 }
}