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