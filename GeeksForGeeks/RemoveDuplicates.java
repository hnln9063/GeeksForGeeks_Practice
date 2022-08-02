/*
 * REMOVE DUPLICATES:
 * -------------------
 
Given a string without spaces, the task is to remove duplicates from it.

Note: The original order of characters must be kept the same.

Example 1:

Input: S = "zvvo"
Output: "zvo"
Explanation: Only keep the first
occurrence

Example 2:

Input: S = "gfg"
Output: gf
Explanation: Only keep the first
occurrence

Your task:
Your task is to complete the function removeDups() which takes a single string as input and returns the string. You need not take any input or print anything.


Expected Time Complexity: O(|s|)
Expected Auxiliary Space: O(constant)

Constraints:
1 <= |S| <= 105
S conatins lowercase english alphabets
*/
// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class RemoveDuplicates {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter number of test cases : ");
	int t = Integer.parseInt(read.readLine());
	
        while (t-- > 0) {
		System.out.println("Enter a string : ");
            String s = read.readLine();

            Solution ob = new Solution();
            String result = ob.removeDups(s);

            System.out.println(result);
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution {
    String removeDups(String S) {

        // code here
        Set<Character> s1 = new LinkedHashSet<Character>();
         for (char c : S.toCharArray()) {
            s1.add(c);
        }
        String s2 = new String();
        for (Character s : s1)
            s2 = s2+s;
        return s2;
    }
}
