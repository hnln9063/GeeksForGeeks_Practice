//{ Driver Code Starts
import java.util.*;

class SpiralMatrix 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of test cases : ");
		int t = sc.nextInt();
		while(t > 0)
		{
			System.out.print("Enter no of rows : ");
			int n = sc.nextInt();
			System.out.print("Enter no of columns : ");
			int m = sc.nextInt();
			System.out.print("Enter value of K : ");
			int k = sc.nextInt();
			int arr[][] = new int[n][m];
			System.out.println("Enter elements into a matrix : ");
			for(int i=0; i<n; i++)
			{
				for(int j=0; j<m; j++ )
				{
					arr[i][j] = sc.nextInt();
				}
			}
			Solution obj = new Solution();
			System.out.println(obj.findK(arr, n, m, k));
		t--;
		}
	}
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
   
	public int findK(int a[][], int n, int m, int k)
	{
	    // Your code goes here
	    int top = 0;
	    int bottom = n-1;
	    int left = 0;
	    int right = m-1;
	    int dir = 0;
	    java.util.ArrayList<Integer> al = new java.util.ArrayList<Integer>();
	    while(top <= bottom && left <= right) {
	        
	        if(dir == 0) {
	            for(int i=left;i<=right;i++) {
	                al.add(a[top][i]);
	            }
	            top++;
	        } else if(dir == 1) {
	            for(int i=top;i<=bottom;i++) {
	                al.add(a[i][right]);
	            }
	            right--;
	        } else if(dir == 2) {
	            for(int i=right;i>=left;i--) {
	                al.add(a[bottom][i]);
	            }
	            bottom--;
	        } else if(dir == 3) {
	            for(int i=bottom;i>=top;i--) {
	                al.add(a[i][left]);
	            }
	            left++;
	        }
	        dir = (dir+1)%4;
	        
	    }
	    return al.get(k-1);
	}
	
}
