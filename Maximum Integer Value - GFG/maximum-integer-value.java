//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    // Position this line where user code will be pasted.
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S = read.readLine();
            Solution ob = new Solution();
            System.out.println(ob.MaximumIntegerValue(S));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    long MaximumIntegerValue(String S) {
        long sum=0;
        long max=Integer.MIN_VALUE;
        for(int i=0;i<S.length();i++)
        {
            char c=S.charAt(i);
            int a=Character.getNumericValue(c);
            sum=Math.max(sum+a , sum*a);
            
            
        }
        return sum;
    }
}