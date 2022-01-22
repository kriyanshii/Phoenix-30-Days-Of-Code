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
        int count = 0;
        while(n > 0){
            if(n % 2 == 1){
                count++;
            }
            n = n / 2;
        }
        System.out.print(count);
        
	}
}