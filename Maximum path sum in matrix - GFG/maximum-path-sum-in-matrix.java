//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            int N = Integer.parseInt(in.readLine());
            String input_line[] = in.readLine().trim().split("\\s+");
            int Matrix[][] = new int[N][N];
            for(int i = 0; i < N*N; i++)
                Matrix[(i/N)][i%N] = Integer.parseInt(input_line[i]);
            
            Solution ob = new Solution();
            System.out.println(ob.maximumPath(N, Matrix));
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution{
    // public static int solve(int m , int n, int[][] grid , int[][]dp)
    // {
    //     if(n==0 && m==0)
    //     {
    //         return grid[n][m];
    //     }
    //      if(m< 0 || n<0)
    //     {
    //         return Integer.MIN_VALUE;
    //     }

    //      if(dp[m][n]!=-1)
    //     {
    //         return dp[m][n];
    //     }
    //     int up = grid[m][n]+solve(m-1 , n , grid , dp);
    //     int left = grid[m][n]+solve(m-1 , n-1 , grid , dp);
    //     int down = grid[m][n]+solve(m-1 , n+1 , grid , dp);
    //     return dp[m][n]= Math.max( up ,Math.max( left , down));
    // }
    static int maximumPath(int N, int matrix[][])
    {
         int n = matrix.length;
        int dp[][]= new int[n][n];
        for(int i=0;i<n;i++){
            dp[0][i]= matrix[0][i];
        }
         
        //  int ld=0;
        //  int rd=0;
        for(int k=1;k<n;k++)
        {
            for(int j=0;j<n;j++)
            {
                int up = matrix[k][j]+dp[k-1][j];
                int ld = matrix[k][j];
                if (j - 1 >= 0) {
                    ld += dp[k - 1][j - 1];
                } else {
                    ld+= (int) Math.pow(-10, 9);
                }

                int rd = matrix[k][j];
                if (j + 1 < n) {
                    rd += dp[k - 1][j + 1];
                } else {
                    rd += (int) Math.pow(-10, 9);
                }
                dp[k][j]= Math.max(up , Math.max(ld , rd));
            }
        }
        int maxi = Integer.MIN_VALUE;
        for (int j = 0; j < n; j++) {
            maxi = Math.max(maxi, dp[n - 1][j]);
        }

        return maxi;
        
    }
}