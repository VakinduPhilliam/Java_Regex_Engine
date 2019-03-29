/* Using Java to Find and Replace All words in the Text that match regex definition. */
/* Finding a pattern and replacing it with something else is probably one of the most frequent tasks in text processing. */
/* Regex allows you to express the pattern liberally, and also the replacement text/pattern. */
/* This is extremely useful in batch processing a huge text document or many text files. */
/* For example, searching for stock prices from many online HTML files, rename many files in a directory with a certain pattern, etc. */

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class TestRegexFindReplace {

   public static void main(String[] args) {

      String inputStr = "This is an apple. These are 33 (Thirty-three) apples";
      String regexStr = "apple";         // pattern to be matched
      String replacementStr = "orange";  // replacement pattern

      // Step 1: Allocate a Pattern object to compile a regex

      Pattern pattern = Pattern.compile(regexStr, Pattern.CASE_INSENSITIVE);

      // Step 2: Allocate a Matcher object from the pattern, and provide the input

      Matcher matcher = pattern.matcher(inputStr);

      // Step 3: Perform the matching and process the matching result

      String outputStr = matcher.replaceAll(replacementStr);     // all matches

      System.out.println(outputStr);

   }

}