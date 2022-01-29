import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sqr = n * n;
        boolean isPhoenix = true;
        while(n > 0){
            if(n %10 != sqr% 10){
                isPhoenix = false;
            }
            n = n/10;
            sqr = sqr/10;
        }
        if(isPhoenix){
            System.out.println("Phoenix number");
        }
        else{
            System.out.println("Not a phoenix number.");
        }
    }
}