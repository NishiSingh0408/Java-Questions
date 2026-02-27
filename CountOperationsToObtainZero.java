import java.util.Scanner;
      public class CountOperationsToObtainZero{
             public static void main(String[] args){
                 Scanner sc = new Scanner(System.in);
                   int n1 = sc.nextInt();
                   int n2 = sc.nextInt();
                   int count = 0;
                   while(n1>0 && n2>0){
                     if(n1>=n2){
                        n1-=n2;
                     }
                     else{
                       n2-=n1;
                     }
                    count++;
                   }
                   System.out.println(count);
 }
}