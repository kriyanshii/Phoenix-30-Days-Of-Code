import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] nums = new int[n];
        for(int i=0; i<n; i++){
            nums[i] = sc.nextInt();
        }
        int sum = 0;
        boolean ans = false;
        // double kD = (double) k;
        for(int i=0; i<n; i++){
            sum = sum + nums[i];
        }
        for(int i=0; i<n; i++){
            if(nums[i] == sum - k * (n - 1)){
                ans = true;
            }
        }
        System.out.println(ans);
    }
}