/* Using Java and Regex to Find predefined words in a Text. */
/* The following example takes in a given input "This is an apple. These are 33 (thirty-three) apples."
/* And you wish to find all occurrences of pattern "Th" (either case-sensitive or case-insensitive) in the sentence. */

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class TestRegexFindText {
   public static void main(String[] args) {

      // Input String for matching the regex pattern

      String inputStr = "This is an apple. These are 33 (thirty-three) apples.";

      // Define Regex to be matched

      String regexStr = "\\w+"; // escape sequence \\ for \

      // Step 1: Compile a regex via static method Pattern.compile(), default is case-sensitive

      Pattern pattern = Pattern.compile(regexStr);

      // Pattern.compile(regex, Pattern.CASE_INSENSITIVE);  // for case-insensitive matching

      // Step 2: Allocate a matching engine from the compiled regex pattern,
      //And bind to the input string

      Matcher matcher = pattern.matcher(inputStr);

      // Step 3: Perform matching and process the matching results

      // Try Matcher.find(), which finds the next match

      while (matcher.find()) {
         System.out.println("find() found substring \"" + matcher.group()
               + "\" starting at index " + matcher.start()
               + " and ending at index " + matcher.end());
      }

      // Try Matcher.matches(), which tries to match the entrie input string

      if (matcher.matches()) {
         System.out.println("matches() found substring \"" + matcher.group()
               + "\" starting at index " + matcher.start()
               + " and ending at index " + matcher.end());
      } else {

         System.out.println("matches() found nothing");

      }

      // Try Matcher.lookingAt(), which tries to match from the beginning of the input string

      if (matcher.lookingAt()) {
         System.out.println("lookingAt() found substring \"" + matcher.group()
               + "\" starting at index " + matcher.start()
               + " and ending at index " + matcher.end());
      } else {

         System.out.println("lookingAt() found nothing");

      }
   }
}

//Output
//find() found substring "Th" starting at index 0 and ending at index 2
//find() found substring "Th" starting at index 18 and ending at index 20
//matches() found nothing
//lookingAt() found substring "Th" starting at index 0 and ending at index 2


/* How It Works */
// Three steps are required to perform regex matching:
// Allocate a Pattern object. 
// There is no constructor for the Pattern class. 
// Instead, you invoke the static method Pattern.compile(regexStr) to compile the regexStr, which returns a Pattern instance.
// Allocate a Matcher object (a matching engine). 
// Again, there is no constructor for the Matcher class. 
// Instead, you invoke the matcher(inputStr) method from the Pattern instance (created in Step 1), and bind the input string to this Matcher.
// Use the Matcher instance (created in Step 2) to perform the matching and process the matching result. 
// The Matcher class provides a few boolean methods for performing the matches:
// boolean find(): scans the input sequence to look for the next subsequence that matches the pattern. 
// If match is found, you can use the group(), start() and end() to retrieve the matched subsequence and its starting and ending indices, 
// as shown in the above example.
// boolean matches(): try to match the entire input sequence against the regex pattern. 
// It returns true if the entire input sequence matches the pattern. That is, include regex's begin and end position anchors ^ and $ to the pattern.
// boolean lookingAt(): try to match the input sequence, starting from the beginning, against the regex pattern. 
// It returns true if a prefix of the input sequence matches the pattern. That is, include regex's begin position anchors ^ to the pattern.
// To perform case-insensitive matching, use Pattern.compile(regexStr, Pattern.CASE_INSENSITIVE) to 
// create the Pattern instance (as commented out in the above example).
