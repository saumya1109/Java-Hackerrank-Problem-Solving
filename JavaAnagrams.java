import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        
        if(a.length() ==b.length()) {
            char[] achar =a.toLowerCase().toCharArray();
            char[] bchar = b.toLowerCase().toCharArray();
            java.util.Arrays.sort(achar);
            java.util.Arrays.sort(bchar);
             return java.util.Arrays.equals(achar, bchar);
           
            }
        else{
            return false;
        }
       
    }

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}