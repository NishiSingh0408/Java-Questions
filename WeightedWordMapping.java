import java.util.Scanner;
    public class WeightedWordMapping{
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int m = sc.nextInt();
            String[] words = new String[m];
            for(int i=0; i<m; i++){
               words[i] = sc.next();
            }
            int n = sc.nextInt();
            int[] weights = new int[n];
            for(int i=0; i<n; i++){
              weights[i] = sc.nextInt();
            }
            StringBuilder sb = new StringBuilder();
            for(String str: words){
             int wordWeight = 0;
             for(char c: str.toCharArray()){
                 int index = c-'a';
                 wordWeight += weights[index];
             }
             int modulo = wordWeight%26;
             char map = (char)('z' - modulo);
             sb.append(map);
        }
       System.out.println(sb.toString());
    }
}