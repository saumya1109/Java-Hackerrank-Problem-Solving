import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Set<String> input = new HashSet<>();
        Scanner sc= new Scanner(System.in);
        int max= sc.nextInt();
        sc.nextLine();
        
        while(max>0){
            String s = sc.nextLine();
            input.add(s);
            System.out.println(input.size());
            max--;
        }
         
        
        
    }
}
