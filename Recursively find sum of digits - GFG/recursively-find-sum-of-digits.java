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
            String s = br.readLine().trim();
            String[] s1 = s.split(" ");
            int A = Integer.parseInt(s1[0]);
            int B = Integer.parseInt(s1[1]);
            Solution ob = new Solution();
            int ans = ob.SumofDigits(A, B);
            System.out.println(ans);           
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    public int SumofDigits(int A, int B)
    {
        return powerDigitSum(A,B);
    }
    
         static int digSum(int n) 
{ 
    if (n == 0) 
    return 0; 
    return (n % 9 == 0) ? 9 : (n % 9); 
} 
 

static int powerDigitSum(int a, int n) 
{ 
    int res = 1; 
    while (n>0) { 
        if (n % 2 == 1) { 
            res = res * digSum(a); 
            res = digSum(res); 
        } 
        a = digSum(digSum(a) * digSum(a)); 
        n /= 2; 
    } 
 
    return res; 

    }
}