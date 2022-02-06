import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int[][] bookings = new int[length][3];
        for(int i=0;i<length;i++){
            for(int j=0;j<3;j++){
                bookings[i][j] = sc.nextInt();
            }
        }
        int n = sc.nextInt();
        //start your code from here.
        int[] res = new int[n];
        for(int[] booking: bookings){
            int start = booking[0] - 1;
            int end = booking[1];
            int reservation = booking[2];
            res[start] += reservation;
            if(end < n){
                res[end] -= reservation;   
            }
        }
        for(int i = 1; i<n; i++){
            res[i] += res[i - 1];
        }
        for(int i=0;i<n;i++){
            System.out.print(res[i] + " ");
        }
    }
}