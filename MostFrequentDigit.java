import java.util.Scanner;
     public class MostFrequentDigit{
             public static void main(String[] args){
                 Scanner sc = new Scanner(System.in);
                 int n1 = sc.nextInt();
                 int n2 = sc.nextInt();
                 int n3 = sc.nextInt();
                 int n4 = sc.nextInt();
                 int[] count = new int[10];
                 int temp1 = n1;
                  if(temp1==0) count[0]++;
                  while(temp1!=0){
                    count[temp1%10]++;
                     temp1/=10;
                  }
                  int temp2 = n2;
                  if(temp2==0) count[0]++;
                  while(temp2!=0){
                     count[temp2%10]++;
                     temp2/=10;
                  }
                  int temp3 = n3;
                   if(temp3==0) count[0]++;
                   while(temp3!=0){
                      count[temp3%10]++;
                      temp3/=10;
                   }
                   int temp4 = n4;
                   if(temp4==0) count[0]++;
                   while(temp4!=0){
                      count[temp4%10]++;
                      temp4/=10;
                   }
                   int maxCount = -1;
                   int mostFrequent = -1;

                   for(int i= 9;i>=0;i--){
                     if(count[i]>maxCount){
                       maxCount = count[i];
                       mostFrequent = i;
                     }
                   }
                    System.out.println(mostFrequent);
 }
}