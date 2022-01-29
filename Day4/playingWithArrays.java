import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i = 0;i<n;i++){
            nums[i] = sc.nextInt();
        }
        int sum = 0;
        for(int i =0;i<n; i++){
            sum += nums[i];
            nums[i] = sum;
        }
        for(int i =0;i<n; i++){
            System.out.print(nums[i]+ " ");
        }
    }
}