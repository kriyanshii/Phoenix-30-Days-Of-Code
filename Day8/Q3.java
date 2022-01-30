import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] nums = new int[n];
        int[] index = new int[n];
        for(int i = 0; i<n; i++){
            nums[i] = sc.nextInt();
        }
        for(int i = 0; i<n; i++){
            index[i] = sc.nextInt();
        }
        ArrayList <Integer> list = new ArrayList<>();
        for(int i =0; i<nums.length; i++){
            list.add(index[i], nums[i]);
        }
        int[] target = new int [nums.length];
        for(int i=0; i<nums.length;i++){
            target[i] = list.get(i);
        }
        for(int i=0; i<nums.length;i++){
            System.out.print(target[i] + " ");
        }        
    }
}