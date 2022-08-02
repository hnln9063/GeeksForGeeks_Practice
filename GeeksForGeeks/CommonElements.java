/*
Common elements
---------------

Given three arrays sorted in increasing order. Find the elements that are common in all three arrays.
Note: can you take care of the duplicates without using any additional Data Structure?

Example 1:

Input:
n1 = 6; A = {1, 5, 10, 20, 40, 80}
n2 = 5; B = {6, 7, 20, 80, 100}
n3 = 8; C = {3, 4, 15, 20, 30, 70, 80, 120}
Output: 20 80
Explanation: 20 and 80 are the only
common elements in A, B and C.

 

Your Task:  
You don't need to read input or print anything. Your task is to complete the function commonElements() which take the 3 arrays A[], B[], C[] and their respective sizes n1, n2 and n3 as inputs and returns an array containing the common element present in all the 3 arrays in sorted order. 
If there are no such elements return an empty array. In this case the output will be printed as -1.

 

Expected Time Complexity: O(n1 + n2 + n3)
Expected Auxiliary Space: O(n1 + n2 + n3)

 

Constraints:
1 <= n1, n2, n3 <= 10^5
The array elements can be both positive or negative integers.
*/

//{ Driver Code Starts
//Initial Template for Java

import java.util.*;

public class CommonElements
{
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
	System.out.print("Enter number of test cases : ");
        int t = sc.nextInt();
        while (t-- > 0) 
        {
	    System.out.print("Enter no of elements in Array A[] : ");
            int n1 = sc.nextInt();
	    System.out.print("Enter no of elements in Array B[] : ");
            int n2 = sc.nextInt();
	    System.out.print("Enter no of elements in Array C[] : ");
            int n3 = sc.nextInt();
            
            int A[] = new int[n1];
            int B[] = new int[n2];
            int C[] = new int[n3];
            System.out.print("Enter elements into Array A[] : ");
            for (int i = 0;i < n1;i++)
            {
                A[i] = sc.nextInt();
            }
	    System.out.print("Enter elements into Array B[] : ");
            for (int i = 0;i < n2;i++)
            {
                B[i] = sc.nextInt();
            }
	    System.out.print("Enter elements into Array C[] : ");
            for (int i = 0;i < n3;i++)
            {
                C[i] = sc.nextInt();
            }
            
            Solution sol = new Solution();
            ArrayList<Integer> res = sol.commonElements(A, B, C, n1, n2, n3);
            if (res.size() == 0)
            {
                System.out.print(-1);
            }
            else 
            {
                for (int i = 0;i < res.size();i++)
                {
                    System.out.print(res.get(i) + " ");
                }    
            }
            System.out.println();
        }
    }
}


// } Driver Code Ends


//User function Template for Java

class Solution
{
    ArrayList<Integer> commonElements(int A[], int B[], int C[], int n1, int n2, int n3) 
    {
        // code here 
        java.util.Set<Integer> hs1 = new java.util.HashSet<Integer>();
        java.util.Set<Integer> hs2 = new java.util.HashSet<Integer>();
        java.util.Set<Integer> hs3 = new java.util.HashSet<Integer>();
        
        for(int i=0;i<n1;i++) {
            hs1.add(A[i]);
        }
        for(int i=0;i<n2;i++) {
            hs2.add(B[i]);
        }
        for(int i=0;i<n3;i++) {
            hs3.add(C[i]);
        }
        
        hs1.retainAll(hs2); // Intersection operation

        hs1.retainAll(hs3); // Intersection operation

        java.util.ArrayList<Integer> a = new java.util.ArrayList<Integer>(hs1);
        Collections.sort(a);
        return a;
        
    }
}
