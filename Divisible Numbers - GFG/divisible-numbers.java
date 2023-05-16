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
            String S[] = read.readLine().split(" ");
            long A = Long.parseLong(S[0]);
            long B = Long.parseLong(S[1]);
            Solution ob = new Solution();
            System.out.println(ob.find(A,B));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    static long find(long A,long B){ 
      if(A%B==0)
      {
          A=A+1;
      }
      while(A%B!=0)
      {
          A++;
      }
      return A;
      
    } 
}