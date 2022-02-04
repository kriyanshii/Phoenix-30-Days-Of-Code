//https://www.hackerrank.com/contests/day-10-of-30/challenges/building-from-arrays/problem
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i = 0; i<n; i++){
            nums[i] = sc.nextInt();
        }
        for(int i = 0;i<n; i++){
            nums[i] = nums[i] + n *(nums[nums[i]] % n);
        }
        for(int i = 0;i<n;i++){
            nums[i] = nums[i] / n;
        }
        for(int i = 0; i<n; i++){
            System.out.print(nums[i] + " ");
        }
    }
}