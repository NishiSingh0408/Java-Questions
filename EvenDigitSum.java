import java.util.Scanner;
   public class EvenDigitSum{
       public static void main(String[] args){
           Scanner sc = new Scanner(System.in);
           int number = sc.nextInt();
           int evenSum = 0;
           while(number>0){
              int digit = number%10;
              if(digit%2==0){
                 evenSum += digit;
              }
              number/=10;
           }
           System.out.println(evenSum);
 }
}