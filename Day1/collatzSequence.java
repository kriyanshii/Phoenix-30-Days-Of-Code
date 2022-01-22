import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        while(n > 1){
            if(n % 2 == 0){
                n = n/2;
                i++;
            }else{
                n = 3 * n + 1;
                i++;
            }
        }
        System.out.println(i);
    }
}