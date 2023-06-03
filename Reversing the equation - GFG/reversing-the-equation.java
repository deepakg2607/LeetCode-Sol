//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int t = Integer.parseInt(in.readLine().trim());
        while(t-- > 0)
        {
            String s;
            s = in.readLine().trim();
            
            Solution ob = new Solution();
            
            out.println(ob.reverseEqn(s));    
        }
        out.close();
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution
{
   
    String reverseEqn(String s)
    {
        Stack<Character> st=new Stack<>();
        StringBuilder sb=new StringBuilder();
        for(int i=s.length()-1;i>=0;i--)
        {
            if(s.charAt(i)!='+'&&s.charAt(i)!='-'&&s.charAt(i)!='*'&& s.charAt(i)!='/')
            {
                st.push(s.charAt(i));
            }
            else{
                while(st.size()!=0)
                {
                    sb.append(st.pop());
                }
                sb.append(s.charAt(i));
            }
        }
        while(st.size()!=0)
        {
            sb.append(st.pop());
        }
        return sb.toString();
        
    }
}