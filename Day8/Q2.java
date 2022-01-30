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
        int min = 0;
        int diff = 0;
        if(n == 0 || n == 1){
            diff = 0;
        }
        for(int i = 0; i<n; i++){
            if(nums[i] - nums[min] > diff){
                diff = nums[i] - nums[min];
            }
            if(nums[i] < nums[min]){
                min = i;
            }
        }
        System.out.print(diff);
    }
}