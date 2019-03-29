/* Java group matching. */
/* Parentheses () have two meanings in regex: */
/* Grouping sub-expressions: For example xyz+ matches one 'x', one 'y', followed by one or more 'z'. */
/* But (xyz)+ matches one or more groups of 'xyz', e.g., 'xyzxyzxyz'. */
/* Parenthesized Back Reference: Provide back references to the matched subsequences. */
/* The matched subsequence of the first pair of parentheses can be referred to as $1, second pair of patentee as $2, and so on. */
/* In the above example, there are 4 pairs of parentheses, which were referenced in the replacement pattern as $1, $2, $3, and $4. */
/* You can use groupCount() (of the Matcher) to get the number of groups captured, and group(groupNumber), start(groupNumber), */
/* end(groupNumber) to retrieve the matched subsequence and their indices. */
/* In Java, $0 denotes the entire regular expression. */

      while (matcher.find()) {

         System.out.println("find() found substring \"" + matcher.group()
               + "\" starting at index " + matcher.start()
               + " and ending at index " + matcher.end());

         System.out.println("Group count is: " + matcher.groupCount());

         for (int i = 0; i < matcher.groupCount(); ++i) {
            System.out.println("Group " + i + ": substring=" 
                  + matcher.group(i) + ", start=" + matcher.start(i) 
                  + ", end=" + matcher.end(i));

         }

      }

//find() found substring "One:two:three:four" starting at index 0 and ending at index 18
//Group count is: 4
//Group 0: substring=One:two:three:four, start=0, end=18
//Group 1: substring=One, start=0, end=3
//Group 2: substring=two, start=4, end=7
//Group 3: substring=three, start=8, end=13
