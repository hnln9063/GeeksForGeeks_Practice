/*
Elements in the Range
---------------------

   Given an array arr[] containing positive elements. A and B are two numbers defining a range. The task is to check if the array contains all elements in the given range.

Example 1:

Input: N = 7, A = 2, B = 5
arr[] =  {1, 4, 5, 2, 7, 8, 3}
Output: Yes
Explanation: It has elements between 
range 2-5 i.e 2,3,4,5

Example 2:

Input: N = 7, A = 2, B = 6
arr[] = {1, 4, 5, 2, 7, 8, 3}
Output: No
Explanation: Array does not contain 6.


Your Task:
This is a function problem. You don't need to take any input, as it is already accomplished by the driver code. You just need to complete the function check_elements() that takes array arr, integer N, integer A, and integer B  as parameters and returns the boolean True if array elements contain all elements in the given range else boolean False.

Note: If the array contains all elements in the given range then driver code outputs Yes otherwise, it outputs No

Expected Time Complexity: O(N).
Expected Auxiliary Space: O(1).


Constraints:
1 ≤ N ≤ 107

OUTPUT:
------
Enter number of test cases : 1
44 5 7
4 9 2 9 3 6 5 3 7 8 1 2 9 2 9 9 6 4 3 10 10 8 9 10 3 5 9 3 4 4 5 5 6 10 5 2 5 6 8 4 5 5 7 4
Yes
*/

//{ Driver Code Starts
//Initial Template for Java


//Initial Template for Java



import java.io.*;
import java.util.*;


// } Driver Code Ends
//User function Template for Java


class Solution
{
    boolean check_elements(int arr[], int n, int A, int B)
    {
        java.util.LinkedHashSet<Integer> al = new java.util.LinkedHashSet<Integer>();
        for(int i=0;i<arr.length;i++) {
            al.add(arr[i]);
        }
       
        for(int i=A;i<=B;i++) {
            if(al.contains(i) == false) {
                return false;
            }
            //System.out.println(k)
        }
        return true;
    }
}


//{ Driver Code Starts.

// Driver class
class ElementsInRange {

    // Driver code
    public static void main(String[] args) throws IOException {
        // Taking input using buffered reader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	System.out.print("Enter number of test cases : ");
        int testcases = Integer.parseInt(br.readLine());
        // looping through all testcases
        while (testcases-- > 0) {
//            int n = Integer.parseInt(br.readLine());
            String line = br.readLine();
            String[] q = line.trim().split("\\s+");
            int n =Integer.parseInt(q[0]);
            int k =Integer.parseInt(q[1]);
            int y =Integer.parseInt(q[2]);
            String line1 = br.readLine();
            String[] a1 = line1.trim().split("\\s+");
            int a[] = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(a1[i]);
            }
//            String line2 = br.readLine();
//            String[] a2 = line2.trim().split("\\s+");
//            long b[] = new long[n];
//            for (int i = 0; i < m; i++) {
//                b[i] = Long.parseLong(a2[i]);
//            }
            Solution ob = new Solution();
            boolean ans=ob.check_elements(a,n,k,y);
           // System.out.println(ob.shuffleArray(a,n,k,y));
            if(ans)
            System.out.println("Yes");
            else
            System.out.println("No");

        }
    }
}




// } Driver Code Ends
