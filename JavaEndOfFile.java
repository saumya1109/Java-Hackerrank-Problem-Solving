import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
       Map<Integer,String> output =  new HashMap<>();
       int index=1;
       Scanner sc =  new Scanner(System.in);
       while (sc.hasNext()) {
           String read = sc.nextLine();
           output.put(index, read);
           index++;
       }
       for(Map.Entry<Integer,String> entry : output.entrySet()) {
           System.out.println(entry.getKey() +" " + entry.getValue());
       }
    }
}