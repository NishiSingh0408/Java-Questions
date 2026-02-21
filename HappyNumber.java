import java.util.Scanner;
     public class HappyNumber{
         public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
             int n = sc.nextInt();
              int temp = n;
              while(temp!=1 && temp!=4){
               int sum = 0;
               int temp2 = temp;
                while(temp2>0){
                  int digit = temp2%10;
                  sum+= digit*digit;
                   temp2/=10;
                }
                 temp=sum;
              }
              if(temp==1){
                 System.out.println("Happy Number");
              }
               else{
                  System.out.println("Not a Happy Number");
               }
 }
}