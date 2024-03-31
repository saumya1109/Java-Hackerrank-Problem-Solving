import java.io.*;
import java.util.*;



public class Solution {


    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        List<Integer> number =  new ArrayList<>();
        number.add(1);
        number.add(2);
        number.add(3);
        
        List<String> values =  new ArrayList<>();
        values.add("Hello");
        values.add("World");
        
       printArray(number);
       printArray(values);
    }
    
     static <T> void printArray(Collection<T> array){
        for(T element : array) {
            System.out.println(element);
        }
        
    }
    

}