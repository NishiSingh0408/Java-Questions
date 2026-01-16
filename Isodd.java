import java.util.Scanner;
public class Isodd{
  public static void main(String[] args){
   Scanner s=new Scanner(System.in);
   System.out.print("Enter a number: ");
    int number =s.nextInt();
    s.close();

   if(number%2!=0){
     System.out.println("2");
    }
   else{
    System.out.println("1");
   }

 }

}