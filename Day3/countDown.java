//https://www.hackerrank.com/contests/day-3-of-30/challenges/find-me-1-6 
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0;
        while(n > 0){
            n /= 10;
            ans++;
        }
        if(ans % 2 == 0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
    }
}
