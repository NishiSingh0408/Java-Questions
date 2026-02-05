import java.util.Scanner;
        public class IsPalindromePossible{
               public static void main(String[] args){
                    Scanner sc = new Scanner(System.in);
                    int number = sc.nextInt();
                    int count = 0;
                    int[]freq = new int[10];
                    while(number>0){
                     freq[number%10]++;
                     number/=10;  
                    }
                    for(int i=0;i<10;i++){
                       if(freq[i]%2!=0){
                          count++;
                       }
                    }
                    if(count<=1){
                       System.out.println("possible");
                    }
                    else{
                       System.out.println("not possible");
                    }
 }
}