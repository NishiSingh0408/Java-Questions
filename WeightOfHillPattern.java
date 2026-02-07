import java.util.Scanner;
      public class WeightOfHillPattern{
            public static void main(String[] args){
                 Scanner sc = new Scanner(System.in);
                 int num1 = sc.nextInt();
                 int num2 = sc.nextInt();
                 int num3 = sc.nextInt();
                 int totalWeight = 0;
                 for(int i=1; i<=num1; i++){
                     int weight = num2 +(i-1)*num3;
                     totalWeight+= i*weight;
                 }
                 System.out.println(totalWeight);
 }
}