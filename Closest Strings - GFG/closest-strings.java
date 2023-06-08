//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(read.readLine());
            ArrayList<String> arr = new ArrayList<String>();
            String input[] = read.readLine().split(" ");
            
            for(int i = 0; i < n; i++){
                arr.add(input[i]);
            }
            String word1 = read.readLine();
            String word2 = read.readLine();
            
            Solution ob = new Solution();
            System.out.println(ob.shortestDistance(arr,word1,word2));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    int shortestDistance(ArrayList<String> s, String word1, String word2) {
        ArrayList<Integer> a=new ArrayList<>();
        ArrayList<Integer> a1=new ArrayList<>();
        ArrayList<Integer> a2=new ArrayList<>();
        for(int i=0;i<s.size();i++)
        {
            if(s.get(i).equals(word1))
            {
                a.add(i);
            }
        }
        
        for(int i=0;i<s.size();i++)
        {
            if(s.get(i).equals(word2))
            {
                a1.add(i);
            }
        }
        
        for(int i=0;i<a.size();i++)
        {
            for(int j=0;j<a1.size();j++)
            {
                a2.add(Math.abs(a.get(i)-a1.get(j)));
            }
        }
        return Collections.min(a2);
        
    }
};