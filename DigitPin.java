import java.util.Scanner;
     public class DigitPin{
         public static void main(String[] args){
               Scanner sc = new Scanner(System.in);
               int n1 = sc.nextInt();
               int n2 = sc.nextInt();
               int n3 = sc.nextInt();
               int unit = Math.min(n1%10, Math.min(n2%10, n3%10));
               int tens = Math.min((n1/10)%10, Math.min((n2/10)%10, (n3/10)%10));
               int hundred = Math.min(n1/100, Math.min(n2/100, n3/100));
               int thousand = Math.max(n1/100, Math.max((n1/10)%10, Math.max(n1%10, Math.max(n2/100, Math.max((n2/10)%10, Math.max(n2%10, Math.max(n3/100, Math.max((n3/10)%10, n3%10)))))))); 
               int pin = thousand*1000 + hundred*100 + tens*10 + unit*1;
                System.out.println(pin);
 }
}