//{ Driver Code Starts
//Initial template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG
{
    public static void main (String[] args)
	{
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0)
        {
            int n = sc.nextInt();
            int arr[]= new int[n];
            for(int i=0; i<n; i++)
                arr[i] = sc.nextInt();
            Solution ob = new Solution();
            if(ob.recreationalSpot(arr,n))
                System.out.println("True");
            else
                System.out.println("False");
        }
	}
}
// } Driver Code Ends


//User function template for C++

class Solution{
    static boolean recreationalSpot(int[] nums , int n){
        // Your code goes here 
        Stack<Integer> st = new Stack<>();
        int temp =Integer.MIN_VALUE;
        for(int i= n-1;i>=0;i--)
        {
            if(nums[i]<temp)
            {
                return true;
            }
            while(!st.isEmpty() && st.peek()<nums[i])
            {
                temp = st.pop();
            }
            st.push(nums[i]);
        }
        return false;
    }
};