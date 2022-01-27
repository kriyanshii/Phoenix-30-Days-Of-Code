// https://www.hackerrank.com/contests/day-3-of-30/challenges/fact-sum/problem
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int tmp = n;
        int sum = 0;
        while(n > 0){
            int a = n % 10;
            sum += fact(a);
            n /= 10;
            // System.out.println(sum);
        }
        if(tmp == sum){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
    static int fact(int n){
        int f = 1;
        while(n > 0){
            f = f * n;
            n--;
        }
        return f;
    }
}