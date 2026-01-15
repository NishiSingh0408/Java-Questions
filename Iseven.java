import java.util.Scanner;

public class Iseven{
    public static void main(String[] args){
     int number;
     Scanner input =new Scanner(System.in);
     System.out.print("Enter an integer number: ");
       number=input.nextInt();
       
       if(number%2==0){
       System.out.println("2");
       }
       else{
       System.out.println("1");
      }
  input.close();
 }
}