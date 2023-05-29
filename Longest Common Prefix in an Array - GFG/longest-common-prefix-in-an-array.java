//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int n = Integer.parseInt(read.readLine().trim());
            String arr[] = read.readLine().trim().split(" ");

            Solution ob = new Solution();
            System.out.println(ob.longestCommonPrefix(arr, n));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    String longestCommonPrefix(String arr[], int n){
         Arrays.sort(arr);
            String res = "";
        for(int i = 0;i<arr[0].length();i++){
            String x= arr[0];
            String y = arr[n-1];
            if(x.charAt(i)==y.charAt(i)){
                res = res+x.charAt(i);
            }
            else{
                break;
            }
        }
        if(res==""){
            return "-1";
        }
        else
        return res;
    }
}