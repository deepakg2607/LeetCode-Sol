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
    public List<String> subset(String s ,String ans)
    {
       if(s.isEmpty())
       {
           List<String> list=new ArrayList<>(); 
           list.add(ans);
           return list;
       }
        List<String> left =subset(s.substring(1) , ans+s.charAt(0));
        List<String> right =subset(s.substring(1) , ans);
        left.addAll(right);
        return left;
    }
    public List<String> AllPossibleStrings(String s)
    {
        // Code here
        List<String> list =new ArrayList<>();
        String ans="";
        List<String> dee= subset(s, ans);
        Collections.sort(dee);
        dee.remove("");
        return dee;
        
    }
}