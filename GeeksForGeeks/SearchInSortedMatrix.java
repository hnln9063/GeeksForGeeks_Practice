//{ Driver Code Starts
/*Search in a row-column sorted Matrix

Given a matrix of size n x m, where every row and column is sorted in increasing order, and a number x. Find whether element x is present in the matrix or not.

Example 1:

Input:
n = 3, m = 3, x = 62
matrix[][] = {{ 3, 30, 38},
              {36, 43, 60},
              {40, 51, 69}}
Output: 0
Explanation:
62 is not present in the matrix,
so output is 0.

Example 2:

Input:
n = 1, m = 6, x = 55
matrix[][] = {{18, 21, 27, 38, 55, 67}}
Output: 1
Explanation: 55 is present in the matrix.

*/

import java.io.*;
import java.util.*;

class SearchInSortedMatrix {
	public static void main(String args[]) throws IOException { 
		Scanner sc = new Scanner(System.in);
        	System.out.print("Enter number of testcases : ");
		int t = sc.nextInt();

        while(t > 0){
		System.out.print("Enter number of rows and columns : ");
       		int rows=sc.nextInt();
       		int columns=sc.nextInt();
			
			int matrix[][]=new int[rows][columns];
          	System.out.println("Enter elements into matrix : ");
        	for(int i=0; i<rows;i++){            
            	for(int j=0; j<columns;j++){
                	matrix[i][j]=sc.nextInt();
            	}
         	}
		System.out.print("Enter element to be searched : ");
         	int target = sc.nextInt();
         	
			Solution x = new Solution();
			
			if (x.search(matrix, rows, columns, target)) 
				System.out.println(1); 
			else
				System.out.println(0); 
			t--;
		}
	} 
}
// } Driver Code Ends

class Solution 
{ 
    //Function to search a given number in row-column sorted matrix.
	static boolean search(int matrix[][], int n, int m, int x) 
	{  
	    // code here 
	    int row=0,col=n-1;
	    while(row < n && col >= 0) {
	        if(matrix[row][col] == x) {
	            return true;
	        }
	        if(matrix[row][col] > x) {
	            col--;
	        } else {
	            row++;
	        }
	    }
	    return false;
	    
	    
	} 
}
