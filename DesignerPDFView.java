import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;
import java.util.Map.Entry;

class Result {

    /*
     * Complete the 'designerPdfViewer' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY h
     *  2. STRING word
     */

    public static int designerPdfViewer(List<Integer> h, String word) {
    /* This problem becomes so easy once you think about how can you get the height of each character from the list of heights given.

	The expression 'b' - 'a' calculates the difference between the Unicode values of the characters 'b' and 'a'.

	Example: The Unicode value of 'a' is 97. The Unicode value of 'b' is 98. So, 'b' - 'a' is equivalent to 98 - 97, which equals 1. 

*/
    
    int length=word.length();
    int height=0;
    
    Map<Character,Integer> map = new HashMap<>();
    
   for(int i=0;i< word.length();i++) {
       char c= word.charAt(i);
       map.put(c,h.get(c -'a'));
       
   }
   
    Entry<Character, Integer> maxEntry = 
    Collections.max(map.entrySet(), Comparator.comparingInt(Entry::getValue));
  
    height = maxEntry.getValue();
    return height*length;

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        List<Integer> h = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        String word = bufferedReader.readLine();

        int result = Result.designerPdfViewer(h, word);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
