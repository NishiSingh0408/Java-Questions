import java.util.Scanner;
   public class NonRepeatedDigitCount{
       public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int[]arr = new int[20];
        if(number ==0){
         arr[0]++;
        }
        else{
           int temp = number;
           while(temp!=0){
             int digit = temp%10;
             arr[digit]++;
             temp/=10;
           }
        }
        int count = 0;
        for(int c:arr){
           if(c==1){
            count++;
           }  
        }
        System.out.println(count);
 }
}