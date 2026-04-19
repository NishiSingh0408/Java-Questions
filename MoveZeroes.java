import java.util.Scanner;
    public class MoveZeroes{
       public static void main(String[] args){
          Scanner sc = new Scanner(System.in);
          int n = sc.nextInt();
          int[] n1 = new int[n];
          for(int i=0; i<n; i++){
            n1[i] = sc.nextInt();
          }
          int insert = 0;
          for(int num: n1){
            if(num!=0){
             n1[insert++] = num;
            }
          }
          while(insert<n1.length){
            n1[insert++] = 0;
          }
          for(int i=0; i<n1.length; i++){
             System.out.print(n1[i] + " ");
          }
 }
}