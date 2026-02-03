import java.util.Scanner;
    public class OddDigitSum{
         public static void main(String[] args){
             Scanner sc = new Scanner(System.in);
             int number = sc.nextInt();
             int odd = 0;
             while(number>0){
               int digit = number%10;
               if(digit%2!=0){
                 odd+=digit;
               }
              number/=10;
             }
             System.out.println(odd);
 }
}