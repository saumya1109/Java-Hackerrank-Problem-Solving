import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        
        System.out.println(sumOfStrings(A,B));
        System.out.println(checkGreater(A,B));
         System.out.println(capLetter(A,B));
        
    }
    
    public static int sumOfStrings(String a, String b){
        return a.length()+b.length();
         }
    
    public static String checkGreater( String a, String b) {
       
       if(a.compareTo(b)<=0) {
           return "No";
       }
       else if (a.compareTo(b) >0) {
           return "Yes";
       }
       
       return null;
    }
    public static String capLetter(String a, String b) {
        String newString="";
        
       newString=a.substring(0,1).toUpperCase()+a.substring(1).toLowerCase()+ " " +b.substring(0,1).toUpperCase()+b.substring(1).toLowerCase();
        
        
        return newString;
    }
}



