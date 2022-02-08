import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int len = sc.nextInt();
        int[][] indices = new int[len][2];
        for(int i = 0; i<len; i++){
            for(int j=0; j<2; j++){
                indices[i][j] = sc.nextInt();
            }
        }
        int[] row = new int[m];
        int[] col = new int[n];
        for(int[] indice: indices){
            row[indice[0]]++;
            col[indice[1]]++;
        }
        int count = 0;
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if((row[i] + col[j])% 2 != 0){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}