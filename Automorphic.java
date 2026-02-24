import java.util.Scanner;
     public class Automorphic{
          public static void main(String[] args){
              Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();
                int square = n*n;
                int temp = n;
                 int power = 1;
                while(temp>0){
                   power*=10;
                    temp/=10;
                }
                 int ans = square%power;
                 if(ans==n){
                    System.out.println("Automorphic Number");
                 }
                 else{
                    System.out.println("Not An Automorphic Number");
                 }
 }
}