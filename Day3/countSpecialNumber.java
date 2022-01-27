// https://www.hackerrank.com/contests/day-3-of-30/challenges/count-special-number/problem
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n; i++){
            arr[i] = sc.nextInt();
        }
        countSpecials(arr, n , k);
    }
    
    static void countSpecials(int a[], int n, int k){
        int f = (int)Math.floor(n/k);
        int count=0;
        int arr[] = new int[1001];
        // your code here
        for(int i=0;i<n;i++){
            arr[a[i]]++;
        }
        
        for(int i=0;i<n;i++){
            if(arr[a[i]] == f){
                count++;
                arr[a[i]] =- 1;
            }
        }
        System.out.println(count);
    }
}