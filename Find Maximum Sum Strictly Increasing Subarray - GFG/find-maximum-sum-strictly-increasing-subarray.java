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
        int t = Integer.parseInt(br.readLine().trim());
        while(t-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            int arr[] = new int[n];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }
            
            Solution obj = new Solution();
            System.out.println( obj.maxsum_SIS(arr, n) );
            
        }
	}
}

// } Driver Code Ends


//User function Template for Java

 class Solution { 
	static int maxsum_SIS(int arr[], int n) 
	{
	    // Your code goes here 
	     int sum=arr[0];
	    int max=Integer.MIN_VALUE;
	    for(int i=1;i<n;i++)
	    {
	        if(arr[i]>arr[i-1])
	        {
	            sum=sum+arr[i];
	        }
	        else{
	            max=Math.max(max , sum);
	            sum=arr[i];
	        }
	    }
	    max=Math.max(max , sum );
	    return max;
	}
} 