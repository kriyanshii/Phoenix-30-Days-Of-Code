//https://www.hackerrank.com/contests/day-10-of-30/challenges/story-of-negative-and-positive/problem
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
        HashSet<Integer> integer = new HashSet<>();
        int max = -1;
        for(int i = 0; i<nums.length; i++){
            integer.add(-nums[i]);
            if(integer.contains(nums[i]) && Math.abs(nums[i]) > max){
                max = Math.abs(nums[i]);
            }
        }
        System.out.println(max);
    }
}