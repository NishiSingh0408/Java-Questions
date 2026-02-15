import java.util.Scanner;
     public class SumOfSumsOfDigitInCyclicOrder{
             public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                 int input1  = sc.nextInt();
                String numStr = String.valueOf(input1);
                 int totalSum = 0;
                 for(int i=0; i<numStr.length(); i++){
                   int currentPartialSum = 0;
                   for(int j = i; j<numStr.length(); j++){
                       currentPartialSum+= Character.getNumericValue(numStr.charAt(j));
                   }
                   totalSum+= currentPartialSum;
                 }
                 System.out.println(totalSum);
 }
}