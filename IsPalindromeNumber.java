import java.util.Scanner;
      public class IsPalindromeNumber{
            public static void main(String[] args){
                  Scanner sc = new Scanner(System.in);
                  int number = sc.nextInt();
                  int temp = number;
                  int rem,sum=0;
                  while(number>0){
                   rem=number%10;
                   sum = rem+(sum*10);
                   number/=10;
                  }
                  if(temp==sum){
                     System.out.println("IsPalindrome");
                  }
                  else{
                     System.out.println("Not a Palindrome");
                  }
 }
}