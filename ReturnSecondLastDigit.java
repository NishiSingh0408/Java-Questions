import java.util.Scanner;
public class ReturnSecondLastDigit{
     public static void main(String[] args){
      Scanner sc= new Scanner(System.in);
          int number =sc.nextInt();
       int absnumber= Math.abs(number);
      if(absnumber>=0 && absnumber<= 9){
       System.out.println("-1");      
      }
      else{
      System.out.println(Math.abs((number/10)%10));
      }
 }

}