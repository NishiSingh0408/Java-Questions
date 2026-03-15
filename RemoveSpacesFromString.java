public class RemoveSpacesFromString{
      public static void main(String[] args){
             String str = "hello \n \tworld";
             String result = str.replaceAll("\\s", "");
             System.out.println(result);
 }
}