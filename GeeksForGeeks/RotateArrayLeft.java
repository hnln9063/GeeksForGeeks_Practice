/*
Rotating An Array
-----------------

Given an array of size N. The task is to rotate array by D elements where D ≤ N.

Example 1:

Input:
N = 7
Arr[] = {1, 2, 3, 4, 5, 6, 7}
D = 2
Output: 3 4 5 6 7 1 2
Explanation: 
Rotate by 1: [2, 3, 4, 5, 6, 7, 1]
Rotate by 2: [3, 4, 5, 6, 7, 1, 2]


Example 2:

Input:
N = 4
Arr[] = {1, 3, 4, 2}
D = 3
Output: 2 1 3 4

Your Task:
You don't need to read input or print anything. Your task is to complete the function leftRotate() which takes the array of integers arr[], its size n and d as input parameters and rotates arr[] in-place without using any extra memory.


Expected Time Complexity: O(N)
Expected Auxiliary Space: O(1)


Constraints:
1 ≤ N ≤ 105
1 ≤ Arr[i] ≤ 1000
0 ≤ D ≤ N
*/
//{ Driver Code Starts
//Initial Template for Java



import java.io.*;
import java.util.*;

public class RotateArrayLeft {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter number of test cases : ");
	int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            inputLine = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }
            int d = Integer.parseInt(br.readLine().trim());

            new Solution().leftRotate(arr, n, d);
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
}


// } Driver Code Ends


//User function Template for Java

class Solution {
    void leftRotate(int[] arr, int n, int d) {
        // code here
        int a[] = new int[d];
        for(int i=0;i<d;i++) {
            a[i] = arr[i];
        }
        
        for(int i=d;i<n;i++) {
            arr[i-d] = arr[i];
        }
        
        for(int i=0;i<d;i++) {
            arr[n-d+i] = a[i];
        }
    }
}
