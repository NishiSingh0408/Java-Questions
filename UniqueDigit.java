import java.util.Scanner;
   public class UniqueDigit{
      public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
         int number = sc.nextInt();
         int[] arr = new int[10];
         int count = 0;
         while(number>0){
           arr[number%10]++;
           number = number/10;
         }
         for(int i=0;i<10;i++){
             if(arr[i]>0){
                count++;
             }
         }
          System.out.println(count);
 }
}