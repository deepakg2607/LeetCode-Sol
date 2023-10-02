//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    int n = sc.nextInt();
                    int A[] = new int[n];
                    for(int i = 0;i<n;i++)
                        A[i] = sc.nextInt();
                    Solution ob = new Solution();
                    System.out.println(ob.minDifference(A,n));
                }
        }
}    
// } Driver Code Ends


//User function Template for Java

class Solution
{

	public int minDifference(int nums[], int n) 
	{ 
	    // Your code goes here
	     int sum = 0;
        for(int i=0;i<nums.length;i++)
        {
            sum=sum+nums[i];
        }
        int target= sum;
       
        boolean [][] dp = new boolean[nums.length+1][target+1];
        for(int i=0;i<n;i++)
        {
            dp[i][0]= true;
        }
        if(nums[0]<=target)
        dp[0][nums[0]]= true;
        for(int j=1;j<n;j++)
        {
            for(int k = 1;k<=target;k++)
            {
                boolean nottake = dp[j-1][k];
                boolean take = false;
                if(nums[j]<=k)
                {
                    take = dp[j-1][k- nums[j]];
                }
                dp[j][k]= take || nottake;
            }
            
        }
        int min = Integer.MAX_VALUE;
        for(int i=0;i<=sum/2;i++)
        {
            if(dp[n-1][i]==true){
            min = Math.min(min , Math.abs((sum - i)-i));
            }
        }
        return min ;
	    
	} 
}
