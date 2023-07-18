//{ Driver Code Starts
//Initial Template for Java



import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            int n = Integer.parseInt(br.readLine().trim());
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            int ans = new Solution().findMaxSum(arr, n);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    int solve(int [] arr , int n , int []dp){
        if(n<0)
        {
            return 0;
        }
        if(n==0)
        {
            return arr[n];
        }
        if(dp[n]!=0)
        {
            return dp[n];
        }
        int include=solve(arr , n-2 , dp)+ arr[n];
        int exclude=solve(arr , n-1 , dp);
        dp[n]= Math.max(include , exclude);
        return dp[n];
    }
    int findMaxSum(int arr[], int n) {
        // code here
        int dp[]=new int[n];
        return solve(arr , n-1 ,dp);
    }
}