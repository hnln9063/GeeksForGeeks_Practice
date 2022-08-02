/*
MAJORITY ELEMENT
----------------

Given an array A of N elements. Find the majority element in the array. A majority element in an array A of size N is an element that appears more than N/2 times in the array.
 

Example 1:

Input:
N = 3 
A[] = {1,2,3} 
Output:
-1
Explanation:
Since, each element in 
{1,2,3} appears only once so there 
is no majority element.

Example 2:

Input:
N = 5 
A[] = {3,1,3,3,2} 
Output:
3
Explanation:
Since, 3 is present more
than N/2 times, so it is 
the majority element.


Your Task:
The task is to complete the function majorityElement() which returns the majority element in the array. If no majority exists, return -1.
 

Expected Time Complexity: O(N).
Expected Auxiliary Space: O(1).
 

Constraints:
1 ≤ N ≤ 107
0 ≤ Ai ≤ 106
*/
//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class MajorityElement
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of test cases : ");
	int t = sc.nextInt();
        
        while(t-- > 0)
        {
	    System.out.print("Enter size of an array : ");
            int n =sc.nextInt();
            int arr[] = new int[n];
            System.out.println("Enter elements into an array : ");
            for(int i = 0; i < n; i++)
             arr[i] = sc.nextInt();
             
           System.out.println(new Solution().majorityElement(arr, n)); 
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    static int majorityElement(int a[], int size)
    {
        // your code here
        int ans=0;
        // If array contains only one element then we should return it.
        if(size == 1) {
            return a[0];
        }
        
        
        for(int i=0;i<32;i++) {
            int count=0;
            for(int j=0;j<size;j++) {
                if( (a[j] & (1<<i)) != 0 )
                    //System.out.print( (a[j]&(1<<i)));
                    count++;
                    
            }
            //System.out.println();
            if(count > (size/2) ) {
                ans = ans + (1<<i);
            }
            
        }
        int count=0;
        for(int i=0;i<size;i++) {
            if(a[i] == ans) {
                count++;
            }
        }
        if(count > (size/2) ) {
            return ans;
        } else {
            return -1;
        }
    }
}
