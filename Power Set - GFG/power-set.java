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
            Solution ob = new Solution();
            List<String> ans = ob.AllPossibleStrings(s);
            for(String i: ans)
                System.out.print(i + " ");
            System.out.println();
            
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    public static void deepak(String s, String ans , int i, List<String> a)
    {
        if(i>=s.length())
        {
            if(ans.length()>0)
            a.add(ans);
            return;
        }
        //exclude
        deepak(s, ans, i+1, a);
        
        char dee=s.charAt(i);
        ans=ans+Character.toString(dee);
        deepak(s, ans, i+1, a);
    }
    public List<String> AllPossibleStrings(String s)
    {
        List<String> a=new ArrayList<>();
        int index=0;
        String ans="";
        deepak(s , ans, index, a);
        Collections.sort(a);
        return a;
    }
}