/* Java and Regex to Rename Files of a Given Directory. */
/* The following program rename all the files ending with ".class" to ".out" of the directory specified. */

import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.io.File;

public class RegexRenameFiles {

   public static void main(String[] args) {

      String regexStr = ".class$";    // ending with ".class"
      String replacementStr = ".out"; // replace with ".out"

      // Allocate a Pattern object to compile a regex

      Pattern pattern = Pattern.compile(regexStr, Pattern.CASE_INSENSITIVE);
      Matcher matcher;

      File dir = new File(".");  // directory to be processed

      int count = 0;

      File[] files = dir.listFiles();   // list all files and directories

      for (File file : files) {

         if (file.isFile()) {   // file only, not directory

            String inFilename = file.getName();    // get filename, exclude path

            matcher = pattern.matcher(inFilename); // allocate Matches with input

            if (matcher.find()) {
               ++count;

               String outFilename = matcher.replaceFirst(replacementStr);

               System.out.print(inFilename + " -> " + outFilename);

               if (file.renameTo(new File(dir + "\\" + outFilename))) {  // execute rename

                  System.out.println(" SUCCESS");

               } else {

                  System.out.println(" FAIL");

               }
            }
         }
      }

      System.out.println(count + " files processed");

   }
}

//You can also use regex to specify the pattern, and back references in the replacement.
