//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG{
    public static void main(String args[]) throws IOException{
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int N=sc.nextInt();
            int []arr=new int[N];
            for(int i=0;i<N;i++){
                arr[i]=sc.nextInt();
                
            }
            Solution obj=new Solution();
            int res=obj.minimumEnergy(arr,N);
            System.out.println(res);
            
        }
    }
}


// } Driver Code Ends


//User function Template for Java

class Solution{
    public int minimumEnergy(int heights[],int n){
        //code here
         int dee=0;
        int shi=0;
        for(int i=1;i<n;i++)
        {
            int left=dee+Math.abs(heights[i]-heights[i-1]);
            int right=Integer.MAX_VALUE;
            if(i>1)
            {
            right=shi+Math.abs(heights[i]-heights[i-2]);
            }
            int curi=Math.min(left , right);
            
            shi=dee;
            dee=curi;
           

        }
        return dee;
    }
}