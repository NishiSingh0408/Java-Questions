import java.util.Scanner;
    public class DivideTwoIntegersWithoutUsingOp{
          public static void main(String[] args){
              Scanner sc = new Scanner(System.in);
               long dividend = sc.nextLong();
               long divisor = sc.nextLong();
               if(dividend == Integer.MIN_VALUE && divisor == -1){
                  System.out.println(Integer.MAX_VALUE);
                }
                long dnd = Math.abs((long)dividend);
                long dsr = Math.abs((long)divisor);
                int sign = (dividend>0)==(divisor>0)?1:-1;
                long ans = 0;
                while(dnd>=dsr){
                  long temp = dsr;
                  long multiple = 1;
                   while(dnd>=(temp<<1)){
                     temp<<=1;
                     multiple<<=1;
                   }  
                    dnd-= temp;
                    ans+= multiple;
                }
                System.out.println((int)sign*ans);
 }
}