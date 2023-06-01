//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());

            Solution ob = new Solution();
            System.out.println(ob.jumpingGeek(N));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    static String jumpingGeek(int N) {
        // code here
        int i=N%6;
       if(i==0 || i==1 || i==3) return "yes";
       return "no";
    }
};