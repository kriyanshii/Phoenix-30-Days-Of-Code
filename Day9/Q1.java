import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n >= 10){
            n = sumOf(n);
        }
        System.out.println(n);
    }
    static int sumOf(int n){
        int sum = 0;
        while(n > 0){
            sum += n%10;
            n = n / 10;
        }
        return sum;
    }
}