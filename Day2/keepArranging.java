import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double i, s = 0.0;
        for(i = 1; i <= n; i++)
            s = s + 1 / i;

        System.out.printf("Harmonic sum upto 4 decimal places: %.4f", s);
    }
}