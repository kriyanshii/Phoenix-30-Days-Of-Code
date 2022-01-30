import java.util.*;
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] gain = new int[n];
        for(int i = 0; i<n; i++){
            gain[i] = sc.nextInt();
        }
        int max = 0, sum = 0;
        for(int point: gain){
            sum += point;
            if(max < sum){
                max = sum;
            }
        }
        System.out.println(max);

    }
}