import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();
        boolean ans = true;
        int[] alpa = new int[26];
        int len =  sentence.length();
        
        for(int i=0; i<len ;i++){            
            int index = sentence.charAt(i);            
            alpa[index-'a'] = 1;         
                        
        }
        
        for(int j=0; j< alpa.length; j++){
            if(alpa[j] == 0){
                ans = false;
            }
        }
        
        System.out.println(ans);
    }
}