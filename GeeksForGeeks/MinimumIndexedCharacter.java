/*
 Minimum indexed character
-----------------------------

Given a string str and another string patt. Find the minimum index of the character in str that is also present in patt.


Example 1:

Input:
str = geeksforgeeks
patt = set
Output: 1
Explanation: e is the character which is
present in given str "geeksforgeeks"
and is also presen in patt "set". Minimum
index of e is 1. 

Example 2:

Input:
str = adcffaet
patt = onkl
Output: -1
Explanation: There are none of the
characters which is common in patt
and str.


Your Task:
You only need to complete the function minIndexChar() that returns the index of answer in str or returns -1 in case no character of patt is present in str.


Expected Time Complexity: O(N).
Expected Auxiliary Space: O(Number of distinct characters).


Constraints:
1 ≤ |str|,|patt| ≤ 105 
'a' <= stri, patti <= 'z'
*/

//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;


// } Driver Code Ends
//User function template for JAVA

class Solution
{
    //Function to find the minimum indexed character.
    public static int minIndexChar(String str, String patt)
    {
        // assigning maximum value to ans
        int ans = Integer.MAX_VALUE;
        
        java.util.List<Character> al = new java.util.ArrayList<Character>();
        
        for(char c : patt.toCharArray()) {
            al.add(c);
        }
        
        for(int i=0;i<al.size();i++) {
            int val = str.indexOf(al.get(i));
            
            if(val < ans && val != -1) {
                ans = val;
            }
        }
        
        if(ans == Integer.MAX_VALUE) {
            return -1;
        }
        return ans;
        // Time limit exceeded (1.84sec)
    }
}

//{ Driver Code Starts.

class MinimumIndexedCharacter {
	public static void main (String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number of testcases : ");
		int t=sc.nextInt();
		while(t>0)
		{
		    t--;
		    System.out.print("Enter first string : ");
		    String s1=sc.next();
		    System.out.print("Enter second string : ");
		    String s2=sc.next();
		    
		    int res = new Solution().minIndexChar(s1, s2);
		    System.out.println(res);
		}
	}
}

// } Driver Code Ends
