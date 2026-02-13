import java.util.Scanner;
      public class CountingBits{
          public static void main(String[] args){
                 Scanner sc = new Scanner(System.in);
                 int n = sc.nextInt();
                 int num = 0;
                 for(int i=0; i<32; i++){
                    if((n&1)==1){
                      num++;
                    } 
                     n>>=1;
                 }
                 System.out.println(num);
 }
}