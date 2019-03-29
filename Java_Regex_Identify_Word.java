/* Java Program to identify predefined words in a string sentence. */

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LogicalOperatorDemo {

   private static final String REGEX = "t|o";
   private static final String INPUT = "Welcome to the New World.";

   public static void main(String[] args) {

      // create a pattern

      Pattern  pattern = Pattern.compile(REGEX);
      
      // get a matcher object

      Matcher matcher = pattern.matcher(INPUT); 

      while(matcher.find()) {

         //Prints the start index of the match.

         System.out.println("Match String start(): "+matcher.start());

      }
   }
}

//Output:

//Match String start(): 4
//Match String start(): 8
//Match String start(): 9
//Match String start(): 13
//Match String start(): 14
//Match String start(): 21
//Match String start(): 24
