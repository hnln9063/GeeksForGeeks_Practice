//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.util.*;

class NoOfOneBits {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of test cases : ");
	int t = sc.nextInt();
        while (t-- > 0) {
	    System.out.print("Enter a positive number : ");
            int N = sc.nextInt();

            Solution ob = new Solution();
            int cnt = ob.setBits(N);
            
	    System.out.println("Number of one bits are : "+cnt);
        }
    }
}

// } Driver Code Ends


// User function Template for Java
class Solution {
    static int setBits(int N) {
        // code here
        String str = Integer.toBinaryString(N);
        char s[] = str.toCharArray();
        int count=0;
        for(int i=0;i<s.length;i++) {
            if(s[i] == '1') {
                count++;
            }
        }
        
        return count;
    }
}
