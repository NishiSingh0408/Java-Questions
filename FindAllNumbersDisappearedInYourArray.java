import java.util.*;
   public class FindAllNumbersDisappearedInYourArray{
       public static void main(String[] args){
          Scanner sc = new Scanner(System.in);
          int n = sc.nextInt();
          int[] arr = new int[n];
          for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
          }
          Set<Integer> set = new TreeSet<>();
          for(int num : arr){
             set.add(num);
          }
          List<Integer> list = new ArrayList<>();
          for(int i=1; i<=arr.length; i++){
              if(!set.contains(i)){
                 list.add(i);
              }
          }
          System.out.println(list);
 }
}