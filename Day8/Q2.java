
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
        int[] nums = new int[n];
        for(int i = 0; i<n; i++){
            nums[i] = sc.nextInt();
        }
        int min = 0;
        int diff = 0;
        if(n == 0 || n == 1){
            diff = 0;
        }
        for(int i = 0; i<n; i++){
            if(nums[i] - nums[min] > diff){
                diff = nums[i] - nums[min];
            }
            if(nums[i] < nums[min]){
                min = i;
            }
        }
        System.out.print(diff);
	}
}
