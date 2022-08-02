/*
 * Sum of Middle Elements of two sorted arrays
 *
 * Given 2 sorted arrays Ar1 and Ar2 of size N each. Merge the given arrays and find the sum of the two middle elements of the merged array.
 * */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

  public class SumOfMiddleElements {

    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
	System.out.print("Enter number of test cases : ");
        int tc = Integer.parseInt(br.readLine());
        while (tc-- > 0) {
	    System.out.print("Enter number of elements in an array : ");
            int n = Integer.parseInt(br.readLine());
            int[] ar1 = new int[n], ar2 = new int[n];
            System.out.print("Enter elements into array 1 : ");
	    String[] inputLine = br.readLine().split(" ");
	    //System.out.print("Enter elements into array 1 : ");
            for (int i = 0; i < n; i++) {
                ar1[i] = Integer.parseInt(inputLine[i]);
            }
	    System.out.print("Enter elements into array 2 : ");
            inputLine = br.readLine().split(" ");
	    //System.out.print("Enter elements into array 2 : ");
            for (int i = 0; i < n; i++) {
                ar2[i] = Integer.parseInt(inputLine[i]);
            }
	    System.out.print("Sum of middle elements : ");
            System.out.println(new Solution().findMidSum(ar1, ar2, n));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    int findMidSum(int[] ar1, int[] ar2, int n) {
        // code here
        java.util.LinkedList<Integer> al = new java.util.LinkedList<Integer>();
        for(int i=0;i<ar1.length;i++) {
            al.add(ar1[i]);
        }
        for(int i=0;i<ar2.length;i++) {
            al.add(ar2[i]);
        }
        Collections.sort(al);
        
        return al.get(n)+al.get(n-1);
        
    }
}
