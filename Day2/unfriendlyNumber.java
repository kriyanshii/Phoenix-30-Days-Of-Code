import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(isLucky(n)){
            System.out.println("The number is lucky.");
        }else{
            System.out.println("The number is unlucky.");
        }
        
    }
    static boolean isLucky(int n)
    {
        // Create an array of size 10 and initialize all
        // elements as false. This array is used to check
        // if a digit is already seen or not.
        boolean arr[]=new boolean[10];
        for (int i = 0; i < 10; i++)
            arr[i] = false;
     
        // Traverse through all digits
        // of given number
        while (n > 0)
        {
            // Find the last digit
            int digit = n % 10;
     
            // If digit is already seen,
            // return false
            if (arr[digit])
            return false;
     
            // Mark this digit as seen
            arr[digit] = true;
     
            // Remove the last digit from number
            n = n / 10;
        }
        return true;
    }
}