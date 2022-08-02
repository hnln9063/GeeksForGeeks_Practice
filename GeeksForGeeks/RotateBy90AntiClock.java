/*
Rotate by 90 degree
-------------------

Given a square matrix[][] of size N x N. The task is to rotate it by 90 degrees in an anti-clockwise direction without using any extra space.

Example 1:

Input:
N = 3
matrix[][] = [[1 2 3],
              [4 5 6],
              [7 8 9]]
Output:
3 6 9 
2 5 8 
1 4 7

Your Task:
You only need to implement the given function rotate(). Do not read input, instead use the arguments given in the function. 

Expected Time Complexity: O(N*N)
Expected Auxiliary Space: O(1)

Constraints:
1 ≤ N ≤ 50
1 <= matrix[][] <= 100
*/

//{ Driver Code Starts
//Initial Template for Java

import java.util.*; 
import java.io.*;
import java.lang.*;

class RotateBy90AntiClock
{
	public static void main(String[] args) 
	{ 
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of test cases : ");
		int t = sc.nextInt();

		while (t-- > 0)
		{
			System.out.print("Enter size of a matrix : ");
			int n = sc.nextInt();
			int[][] arr = new int[n][n];
			System.out.println("Enter elements : ");
			for (int i = 0; i < n; i++)
				for (int j = 0; j < n; j++)
					arr[i][j] = sc.nextInt();

			GFG g = new GFG();
			g.rotate(arr);
			System.out.println("After rotating 90 degrees in anti clock wise : ");
			printMatrix (arr);
		}
	} 

	static void printMatrix(int arr[][]) 
	{ 
		for (int i = 0; i < arr.length; i++) { 
			for (int j = 0; j < arr[0].length; j++) 
				System.out.print(arr[i][j] + " "); 
			System.out.println(""); 
		} 
	} 
}
// } Driver Code Ends


//User function Template for Java

class GFG
{
	static void rotate(int matrix[][]) 
	{
		// Code Here

		// Transpose the matrix
		for(int i=0;i<matrix.length;i++) {
			for(int j=i;j<matrix[i].length;j++) {
				int temp = matrix[j][i];
				matrix[j][i] = matrix[i][j];
				matrix[i][j] = temp;
			}
		}

		// swapping rows
		for(int i=0;i<matrix.length/2;i++) {
			int lr = matrix.length-i-1;
			for(int j=0;j<matrix.length;j++) {
				int temp = matrix[i][j];
				matrix[i][j] = matrix[lr][j];
				matrix[lr][j] = temp;
			}
		}

	}
}
