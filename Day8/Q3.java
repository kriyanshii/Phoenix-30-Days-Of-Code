/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
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
