import java.util.Scanner;
  public class ReturnLastDigit{
     public static int getlastdigit(int number){
        return Math.abs(number%10);
    }
  public static void main(String[] args){
   Scanner sc=new Scanner(System.in);
    int num1= sc.nextInt();
    System.out.println(getlastdigit(num1));


  }
}