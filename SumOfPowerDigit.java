import java.util.Scanner;
        public class SumOfPowerDigit{
             public static void main(String[] args){
                 Scanner sc = new Scanner(System.in);
                 String str = sc.nextLine();
                 int n = str.length();
                 long sum = 0;
                 for(int i=0; i<n-1; i++){
                    int currentDigit = Character.getNumericValue(str.charAt(i));
                    int nextDigit = Character.getNumericValue(str.charAt(i+1));
                     sum+= (long)Math.pow(currentDigit, nextDigit);
                 }
                    int lastDigit = Character.getNumericValue(str.charAt(n-1));
                      sum+= (long)Math.pow(lastDigit, 0);
                     System.out.println(sum);
 }
}