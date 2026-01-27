import java.util.Scanner;
    public class Nthprime{
        public static void main(String[] args){
           Scanner sc = new Scanner(System.in);
           int number = sc.nextInt();
           int countPrime = 0;
           int i = 2;
          while(countPrime<=number){
                 int count = 0;
            for(int j=2;j<=i/2;j++){
                if(i%j==0){
                 count++;
                }
            }
              if(count==0){
                countPrime++;
                 if(countPrime==number){
                    System.out.println(i);
                      break;
                 }
              }
                i++;
          }
 }
}