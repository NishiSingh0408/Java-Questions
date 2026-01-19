import java.util.Scanner;
public class SumOfLastDigit{
    public static void main(String[] args){
     Scanner sc=new Scanner(System.in);
    int input1= sc.nextInt();
    int input2= sc.nextInt();
     int last1=Math.abs(input1%10);
     int last2=Math.abs(input2%10);
     System.out.println(last1+last2);
  }
}