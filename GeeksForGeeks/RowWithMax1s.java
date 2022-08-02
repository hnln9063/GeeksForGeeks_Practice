//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;

public class RowWithMax1s {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter number of test cases : ");
	int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            inputLine = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            int m = Integer.parseInt(inputLine[1]);
            int[][] arr = new int[n][m];
            inputLine = br.readLine().trim().split(" ");
        
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    arr[i][j] = Integer.parseInt(inputLine[i * m + j]);
                }
            }
            int ans = new Solution().rowWithMax1s(arr, n, m);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution {
    int rowWithMax1s(int arr[][], int n, int m) {
        // code here
        int row = 0;
        int col = m -1;
        int max = 0;
        int count = 0;
        int val = -1;
        while(row < n && col >= 0) {
            if(arr[row][col] == 1) {
                count++;
                if(count == m) {
                    return row;
                }
                col--;
            } else {
                
                if(count > max) {
                    max = count;
                    val = row;
                }
                row++;
                col = m-1;
                count=0;
            }
        }
        return val;
    }
}
