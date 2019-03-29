
/* Java, Regex, The Scanner & useDelimiter(). */
/* The Scanner class, by default, uses whitespace as the delimiter in parsing input tokens. */
/* You can set the delimiter to a regex via use delimiter() methods below: */
/* public Scanner useDelimiter(Pattern pattern) */
/* public Scanner useDelimiter(String pattern) */

import java.util.Scanner;

public class ScannerUseDelimiterTest {

   public static void main(String[] args) {

      String source = "There are thirty-three big-apple";
      Scanner in = new Scanner(source);

      in.useDelimiter("\\s+|-");  // whitespace(s) or -
      while (in.hasNext()) {

         System.out.println(in.next());

      }
   }
}

