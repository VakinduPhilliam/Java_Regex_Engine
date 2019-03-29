/* Regular Expression (regex) is extremely useful in programming, especially in processing text files. Java is no exception. */
/* Regular expression was introduced in Java 1.4 in package java.util.regex. This package contains only two classes: */
/* java.util.regex.Pattern: represents a compiled regular expression. */
/* You can get a Pattern object via, static method Pattern.compile(String regexStr). */
/* java.util.regex.Matcher: an engine that performs matching operations on an */
/* input CharSequence (such as String, StringBuffer, StringBuilder, CharBuffer, Segment) by interpreting a pattern. */

//The steps to implement Java Regex operators are:

String regexStr = "......";   // Regex String
String inputStr = "......";   // Input for matching, any CharSequence such as String, StringBuffer, StringBuilder, CharBuffer

// Step 1: Compile a Regex String into a Pattern object

Pattern pattern = Pattern.compile(regexStr);

// Step 2: Allocate a matching engine for the regex pattern bind with the input string

Matcher matcher = pattern.matcher(inputStr);

// Step 3: Perform the matching and process the matching result
// Perform matching operations using:

matcher.find()      // Scans the input sequence looking for the next subsequence that matches the pattern
matcher.matches()   // Attempts to match the entire input sequence
matcher.lookingAt() // Attempts to match the input sequence, starting at the beginning, against the pattern.

matcher.replaceAll(replacementStr) // Find and replace all matches.
matcher.replaceFirst(replacementStr) // Find and replace the first match.

// Processing matching result

matcher.group() // Returns the input subsequence matched by the previous match.
matcher.start() // Returns the start index of the previous match.
matcher.end()   // Returns the offset after the last character matched.
