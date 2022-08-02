//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;


// } Driver Code Ends
//User function Template for Java


class Solution
{
    //Function to check if the number is sparse or not.
    public static boolean isSparse(int n)
    {
        // Your code here
        // To convert Decimal number to Binary 
        //1 0 1 0 1 0 1 0
        String s = Integer.toBinaryString(n);
	System.out.println(s);
        for(int i=0;i<s.length()-1;i++) {
            if(s.charAt(i) == s.charAt(i+1) && s.charAt(i) == '1') {
                return false;
            }
        }
        return true;
    }
    
}


//{ Driver Code Starts.

class IsSparse {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//testcases
		int t = sc.nextInt();
		
		while(t-->0){
		    
		    		     
            //initializing n
		    int n = sc.nextInt();
		    
		    Solution obj = new Solution();
		    
		    //printing 1 if isSparse returns true
            //else 0
		    if(obj.isSparse(n)){
		        System.out.println("1");
		    } else {
                System.out.println("0");
		    }
		}
	}
}
// } Driver Code Ends
