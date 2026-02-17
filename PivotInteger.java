import java.util.Scanner;
     public class PivotInteger{
            public static void main(String[] args){
                 Scanner sc = new Scanner(System.in);
                   int n = sc.nextInt();
                   int total = n*(n+1)/2;
                   int x = (int)Math.sqrt(total);
                   if(x*x==total){
                     System.out.println(x);
                   }
                   else{
                     System.out.println("-1");
                   }
 }
}