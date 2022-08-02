//{ Driver Code Starts
import java.io.*;
import java.util.*;
class SpirallyTraversingAMatrix
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
	System.out.print("Enter number of test cases : ");
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
	    System.out.print("Enter number of rows : ");
            int r = sc.nextInt();
	    System.out.print("Enter number of columns : ");
            int c = sc.nextInt();
            
            int matrix[][] = new int[r][c];
            System.out.println("Enter elements into matrix : ");
            for(int i = 0; i < r; i++)
            {
                for(int j = 0; j < c; j++)
                 matrix[i][j] = sc.nextInt();
            }
            Solution ob = new Solution();
            ArrayList<Integer> ans = ob.spirallyTraverse(matrix, r, c);
	    System.out.println("Spiral Traversal of a matrix : ");
            for (Integer val: ans) 
                System.out.print(val+" "); 
            System.out.println();
        }
    }
}
// } Driver Code Ends


class Solution
{
    //Function to return a list of integers denoting spiral traversal of matrix.
    static ArrayList<Integer> spirallyTraverse(int matrix[][], int r, int c)
    {
        // code here 
        java.util.ArrayList<Integer> al = new java.util.ArrayList<Integer>();
        
        // Direction to move
        int dir = 0;
        
        // We use these four variables as pointers for boundary cases
        int top = 0;
        int bottom = r-1;
        int left = 0;
        int right = c-1;
        
        while(top <= bottom && left <= right) {
            
            if(dir == 0) {
                // Traversing from left to right, in top most row
                // Here, row (top) is constant
                for(int i=left; i<=right; i++) {
                    al.add(matrix[top][i]);
                }
                // As we traversed entire top most row, we will increase top pointer
                top++;
                
            } else if (dir == 1) {
                // Traversing from top to bottom, in right most column
                // Here, column (right) is constant
                for(int i=top;i<=bottom;i++) {
                    al.add(matrix[i][right]);
                }
                // As we traversed entire right most column, we decrease right pointer
                right--;
                
            } else if (dir == 2) {
                // Traversing from right to left, in bottom most row
                // Here, row (bottom) is constant
                for(int i=right;i>=left;i--) {
                    al.add(matrix[bottom][i]);
                }
                // As we traversed entire bottom most row, we decrease bottom pointer
                bottom--;
                
            } else if (dir == 3) {
                // Traversing from bottom to top, in left most column
                // Here, column (left) is constant
                for(int i=bottom;i>=top;i--) {
                    al.add(matrix[i][left]);
                }
                // As we traversed entire left most column, we increase left pointer
                left++;
                
            }
            
            dir = (dir+1)%4;
            
        }
        
        return al;
        
    }
}
