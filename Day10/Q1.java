import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean ans = power(n);
        System.out.println(ans);
    }
    static boolean power(int n){
        if(n <= 0) return false;
        while(n > 1){
            if(n % 2 != 0) return false;
            n = n/2;
        }
        return true;
    }
}