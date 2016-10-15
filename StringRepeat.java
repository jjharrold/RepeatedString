package repeatedstring;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class StringRepeat {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        long n = in.nextLong();
        in.close();
        char[] arr = s.toCharArray(); // Change the string to a character array
        char a = 'a';

        long aCount = 0; // The number of a's
        for(int i = 0; i < arr.length; i++){ // Index through the array looking for a's
            if(arr[i] == a){
                aCount++; // Add 1 for every a
            }
        }

        if(n % arr.length == 0){ // If the length of the array is divisible by n
            aCount = (n/arr.length)*aCount; // For every time the string repeats, 
            								//multiply it by the number of a's in the original string
            System.out.println(aCount);
        }
        else{ // If the array length is not divisible by n
            long rem = n % arr.length; // Get the remainder of n divided by the array
            aCount = (n/arr.length)*aCount; // Multiply the number of a's by the number of times the string repeats
            for(int j = 0; j < rem; j++){ // Loop through the original string from 0 to the remainder
                if(arr[j] == a){
                    aCount++;
                } 
            }
            System.out.println(aCount);
        }
        
    }
}
