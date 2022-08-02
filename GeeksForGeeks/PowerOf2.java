//{ Driver Code Starts
// //Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class PowerOf2
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter total number of Test Cases : ");
	int t = Integer.parseInt(read.readLine());//testcases
        
        while(t-- > 0)
        {
            //input a number n
	    System.out.print("Enter a number : ");
            long n = Long.parseLong(read.readLine());
            
            
            // if n is less than equal to zero then 
            //it can't be a power of 2 so we print No
            if(new Solution().isPowerofTwo(n) == true)
              System.out.println("YES");
            else System.out.println("NO");
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution{
    
    // Function to check if given number n is a power of two.
    public static boolean isPowerofTwo(long n){
        
        long m = n-1;
	/*
	 * Example :
	 *  Given number : 8
	 *  Let n = 8 (8 in binary representation : 1 0 0 0)
	 *  then m = n - 1 = 7 (7 in binary representation : 0 1 1 1)
	 *  So if we perform & operation between n and m, we always get 0 as output for powers of two.
	 *  */
        if ((n & m) == 0 && n != 0){
            return true;
        } else {
            return false;
        }
    }
    
}
