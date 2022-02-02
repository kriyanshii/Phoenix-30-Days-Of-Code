import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        HashSet <Integer> set = new HashSet();
        for(int i = 0; i<n;i++){
            set.add(sc.nextInt());
        }
        for(int i = 0; i<m;i++){
            set.add(sc.nextInt());
        }
        // for(int i = 0; i<n;i++){
        //     set.add(arr[i]);
        // }
        // for(int i = 0; i<m;i++){
        //     set.add(brr[i]);
        // }
        System.out.println(set.size());
    }
}