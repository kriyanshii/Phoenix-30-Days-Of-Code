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
        int ans = point(nums);
        System.out.println(ans);
    }
    static int point(int[] nums){
                if(nums.length < 1){
                    return -1;
                }
                int start=0;
                int end = nums.length - 1;
                while(start < end){
                    int mid = start + (end - start)/2;
                    if(nums[mid] < mid){
                        start = mid + 1;
                    }else{
                        end = mid;
                    }
                }
                return nums[start] == start ? start : -1;
    }
}