import java.util.Scanner;
 public class HowManyAreEvenOrOdd{
      public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
           int input1 = sc.nextInt();
           int input2 = sc.nextInt();
           int input3 = sc.nextInt();
           int input4 = sc.nextInt();
           int input5 = sc.nextInt();
           String input6 = sc.next();
           int even=0;
           int odd=0;
       if(input1%2==0){
        even++;
       }
       else{
        odd++;
       }
       if(input2%2==0){
        even++;
       }
       else{
         odd++;
       }
       if(input3%2==0){
         even++;
       }
       else{
          odd++;
       }
       if(input4%2==0){
         even++;
       }
       else{
         odd++;
      }
      if(input5%2==0){
       even++;
      }
     else{
      odd++;
     }
      System.out.println(input6.equals("even")?even:odd);
 }
}