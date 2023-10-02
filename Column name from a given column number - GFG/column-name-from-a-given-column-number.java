//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
import java.lang.*; 
class GfG
{
    public static void main (String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            long n = sc.nextLong();
    		System.out.println (new Solution().colName (n));
        }
        
    }
}

// Contributed By: Pranay Bansal 

// } Driver Code Ends


//User function Template for Java

class Solution
{
    String colName (long columnNumber)
    {
        // your code here
        StringBuilder ans = new StringBuilder();
        while(columnNumber!=0)
        {
            columnNumber--;
            ans.append((char)(columnNumber%26 + 'A'));
            columnNumber /=26;
        }
        ans.reverse();
        return ans.toString();
    }
}