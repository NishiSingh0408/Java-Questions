import java.util.*;
  public class IntersectionOfTwoArrays{
       public static void main(String[] args){
          Scanner sc = new Scanner(System.in);
          int n = sc.nextInt();
          int[] nums1 = new int[n];
          for(int i=0; i<n; i++){
            nums1[i] = sc.nextInt();
          }
          int m = sc.nextInt();
          int[] nums2 = new int[m];
          for(int i=0; i<m; i++){
             nums2[i] = sc.nextInt();
          }
          Set<Integer> set = new HashSet<>();
          for(int num : nums1){
            set.add(num);
          }
          Set<Integer> intersection = new HashSet<>();
          for(int num : nums2){
            if(set.contains(num)){
                intersection.add(num);
            }
          }
          int[] result = new int[intersection.size()];
          int i=0;
          for(Integer num : intersection){
            result[i++] = num;
          }
          System.out.println(Arrays.toString(result));
 }
}