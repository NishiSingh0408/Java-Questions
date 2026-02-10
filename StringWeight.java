import java.util.Scanner;
      public class StringWeight{
            public static void main(String[] args){
              Scanner sc = new Scanner(System.in);
              String input1 = sc.nextLine();
              int input2 = sc.nextInt();
              int totalWeight = 0;
           for(int i=0; i< input1.length(); i++){
                char currentChar = input1.charAt(i);
                int charWeight = 0;

            if(Character.isLetter(currentChar)){
                char lowerCaseChar = Character.toLowerCase(currentChar);
               if(lowerCaseChar == 'a' || lowerCaseChar == 'e' || lowerCaseChar == 'i' || lowerCaseChar == 'o' || lowerCaseChar == 'u'){
               if(input2==1){
                   charWeight = lowerCaseChar - 'a' +1;
               }
              }else{
                charWeight = lowerCaseChar - 'a'+1;
               }
             }
               totalWeight+= charWeight;
         }
             System.out.println(totalWeight);
 }
}