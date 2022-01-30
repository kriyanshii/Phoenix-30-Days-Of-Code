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
        int[] res = new int[nums.length];
        for(int i=0; i<nums.length;i++){
            int count = 0;
            for(int j=0;j<nums.length;j++){
                if(i==j) continue;
                if(nums[j] < nums[i]){
                    count++;
                }
            }
            res[i] = count;
        }
        for(int i = 0; i<n; i++){
            System.out.print(res[i] + " ");
        }
    }
}