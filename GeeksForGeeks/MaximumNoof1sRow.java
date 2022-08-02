/*
Maximum no of 1's row
---------------------
Given a boolean 2D array, where each row is sorted. Find the row with the maximum number of 1s.

Example 1:

Input:
N = 3, M = 4
Mat[] = {{0 1 1 1},
         {0 0 1 1},
         {0 0 1 1}}
Output: 0
Explanation: Row 0 has 3 ones whereas
rows 1 and 2 have just 2 ones.

Example 2:

Input:
N = 2, M = 2
Mat[] = {{0 1},
         {1 1}}
Output: 1
Explanation: Row 1 has 2 ones whereas
row 0 has just a single one.


Your Task:
You don't need to read input or print anything. Your task is to complete the function maxOnes () which takes a 2D array Mat[][] and its dimensions N and M as inputs and returns the row index with the maximum number of 1s (0-based index). If there are multiple rows with the maximum number of ones, then return the row with the smaller index.


Expected Time Complexity: O(NLogM).
Expected Auxiliary Space: O(1).


Constraints:
1 <= N, M <= 40
0 <= M[ ][ ] <= 1
*/

//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class MaximumNoof1sRow
{
    public static void main (String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of testcases : ");
	int t = sc.nextInt();
        
        while(t-- > 0)
        {
	    System.out.print("Enter no of rows and columns : ");
            int n = sc.nextInt();
            int m = sc.nextInt();
            int [][]arr = new int[n][m];
            System.out.println("Enter matrix : ");
            for (int i = 0; i < n; ++i)
                for (int j = 0; j < m; ++j)
                    arr[i][j] = sc.nextInt ();

    		System.out.println (new Sol().maxOnes (arr, n, m));
        }
        
    }
}
// } Driver Code Ends


//User function Template for Java

class Sol
{
    public static int maxOnes (int Mat[][], int N, int M)
    {
        // your code here
        int row = 0, col = M-1;
        int min = 0;
        int val = 0,count=0;
        // As matrix is sorted we traverse from last column of every row
        while(row < N && col >= 0) {
            // if element = 1 then we increase count and decrease column index
            // if entire row contains element = 1 then count = column_length which is maximum, so we return row index directly.
            if(Mat[row][col] == 1 ) {
                count++;
                if(count == M) {
                    return row;
                }
                col--;
            } else {
                // if count is greater than min then we update min
                if(count > min) {
                    min = count;
                    val = row;
                }
                // As we found 0, we have to move to next row.
                // So we make count to 0 and columns to M-1
                count=0;
                row++;
                col = M-1;
            }
            
        }
        return val;
    }
}
