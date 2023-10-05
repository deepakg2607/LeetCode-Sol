//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*; 

class GFG{
    public static void main(String args[]) throws IOException { 
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0){
            int n = Integer.parseInt(read.readLine());
            
            

            Solution ob = new Solution();
            
            System.out.println(ob.lookandsay(n));
        }
    } 
} 
// } Driver Code Ends


//User function Template for Java

class Solution{
    static String lookandsay(int n) {
        //your code here
         String s="1";
        for(int i=2;i<=n;i++)
        {
            s=Final(s);
        }
        return s;
    }
    public static String Final(String s)
    {
        StringBuilder sb=new StringBuilder();
        char c=s.charAt(0);
        int cnt=1;
        for(int i=1;i<s.length();i++)
        {
            if(s.charAt(i)==c)
            {
                cnt ++;
            }
            else
            {
                sb.append(cnt);
                sb.append(c);
                c=s.charAt(i);
                cnt=1;
            }
        }
        sb.append(cnt);
        sb.append(c);
        return sb.toString();
    }
        
    
}
