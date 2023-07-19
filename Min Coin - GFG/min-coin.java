//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String S = br.readLine().trim();
            String[] S1 = S.split(" ");
            int n = Integer.parseInt(S1[0]);
            int amount  = Integer.parseInt(S1[1]);
            String s = br.readLine().trim();
            String[] s1 = s.split(" ");
            int[] nums = new int[n];
            for(int i = 0; i < s1.length; i++)
                nums[i] = Integer.parseInt(s1[i]);
            Solution ob = new Solution();
            int ans = ob.MinCoin(nums, amount);
            System.out.println(ans);           
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution

{
    public int minimum (int [] nums , int amount ,  int dp[][] , int n)
    {
        if(n==0)
        {
            if(amount % nums[0]==0)
            {
                return amount/nums[0];
            }
            else{
                return (int)Math.pow(10 , 9);
            }
        }
        if(dp[n][amount]!=-1)
        {
            return dp[n][amount];
        }
        int notTake =  0+ minimum(nums , amount ,  dp , n-1);
        int take = (int)Math.pow(10,9);
        if(nums[n]<=amount)
        take=1+minimum(nums , amount-nums[n] , dp, n);
        
        return dp[n][amount] =Math.min(take , notTake);
    }
    public int MinCoin(int[] nums, int amount)
    {
        // Code here
        int n=nums.length;
        int dp[][]=new int[nums.length][amount+1];
        
        for(int row[]: dp)
        {
            Arrays.fill(row , -1);
        }
        
        int ans= minimum(nums , amount , dp , n-1);
        if(ans >=(int)Math.pow(10, 9))
        {
            return -1;
        }
        return ans;
    }
}