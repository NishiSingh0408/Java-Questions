import java.util.Scanner;
    public class SumOfOddOrEvenDigit{
         public static void main(String[] args){
              Scanner sc = new Scanner(System.in);
              int number = sc.nextInt();
              String str = sc.next();
              int sum = 0;
              while(number>0){
                 int digit = number%10;
                   if((str.equals("even") && digit%2==0) || (str.equals("odd") && digit%2!=0)){
                       sum+=digit;
                   }
                   number/=10;
              }
              System.out.println(sum);
 }
}