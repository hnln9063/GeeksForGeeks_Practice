/*
 *Uncommon characters
 ---------------------
Given two strings A and B. Find the characters that are not common in the two strings. 

Example 1:

Input:
A = geeksforgeeks
B = geeksquiz
Output: fioqruz
Explanation: 
The characters 'f', 'i', 'o', 'q', 'r', 'u','z' 
are either present in A or B, but not in both.

Example 2:

Input:
A = characters
B = alphabets
Output: bclpr
Explanation: The characters 'b','c','l','p','r' 
are either present in A or B, but not in both.


Your Task:  
You dont need to read input or print anything. Complete the function UncommonChars() which takes strings A and B as input parameters and returns a string that contains all the uncommon characters in sorted order. If no such character exists return "-1".


Expected Time Complexity: O(M+N) where M and N are the sizes of A and B respectively.
Expected Auxiliary Space: O(M+N)  


Constraints:
1<= M,N <= 104
String may contain duplicate characters.
 * */


// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class UncommonCharacters
{
    public static void main(String args[])throws IOException
        {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter number of testcases : ");
	    int t = sc.nextInt();
            while(t-->0)
                {
		    System.out.print("Enter first string : ");
                    String A = sc.next();
		    System.out.print("Enter second string : ");
                    String B = sc.next();
                    Solution ob = new Solution();
                    System.out.println(ob.UncommonChars(A, B));
                }
        }
}// } Driver Code Ends


//User function Template for Java

class Solution
{
    String UncommonChars(String A, String B)
    {
        // code here
        // We use TreeSet to maintain sorted order
        Set<Character> s1 = new TreeSet<Character>();
        
        for (char c : A.toCharArray()) {
            s1.add(c);
        }
        
        Set<Character> s2 = new TreeSet<Character>();

        for (char c : B.toCharArray()) {
            s2.add(c);
        }
        
        Set<Character> s3 = new TreeSet<Character>(s1);
        // Perform Union Operation
        s1.addAll(s2);
        // Perform Intersection Operation
        s3.retainAll(s2);
        // Removing all elements which are common
        s1.removeAll(s3);
        
        String str = "";
        for(Character c : s1) {
            str = str + c;
        }
        if(str == "") {
            return "-1";
        }
        return str;
        
    }
}
