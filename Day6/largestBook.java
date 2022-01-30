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
         Arrays.sort(nums);
        // Calculate product of two smallest numbers
        int sum1 = nums[0] * nums[1];
      
        // Calculate product of two largest numbers
        int sum2 = nums[nums.length - 1] * nums[nums.length - 2];
        int ans = (sum1>sum2)?sum1 : sum2;
        System.out.println(ans);
    }
}