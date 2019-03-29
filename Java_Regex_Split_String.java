/* Java and Regex to split a string. */

public class StringSplitTest {

   public static void main(String[] args) {

      String source = "There are thirty-three big-apple";
      String[] tokens = source.split("\\s+|-");  // whitespace(s) or -

      for (String token : tokens) {

         System.out.println(token);

      }
   }
}

//Output

//There
//are
//thirty
//three
//big
//apple
