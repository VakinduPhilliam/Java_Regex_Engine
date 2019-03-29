/* Java and Regex to Find and ReplaceFirst element with Back References. */
/* Given the input "One:two:three:four", the following program produces "four-three-two-One" by matching the 4 words separated by colons, */
/* and uses the so-called parenthesized back-references $1, $2, $3 and $4 in the replacement pattern. */

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class TestRegexBackReference {

   public static void main(String[] args) {

      String inputStr = "One:two:three:four";
      String regexStr = "(.+):(.+):(.+):(.+)";  // pattern to be matched
      String replacementStr = "$4-$3-$2-$1";    // replacement pattern with back references

      // Step 1: Allocate a Pattern object to compile a regex

      Pattern pattern = Pattern.compile(regexStr);

      // Step 2: Allocate a Matcher object from the Pattern, and provide the input

      Matcher matcher = pattern.matcher(inputStr);

      // Step 3: Perform the matching and process the matching result

      String outputStr = matcher.replaceFirst(replacementStr); // first match only

      System.out.println(outputStr);   // Output: four-three-two-One

   }

}
