import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int n1 = sc.nextInt();
        int sum = 0, mul = 1; 
        while(n1 > 0){
            int s = n1 % 10;
            mul *= s;
            sum += s;
            n1 /= 10;
        }
        System.out.print(mul - sum);
    }
}