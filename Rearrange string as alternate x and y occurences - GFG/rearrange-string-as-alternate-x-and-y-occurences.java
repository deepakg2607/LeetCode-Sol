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
            String[] inp = read.readLine().split(" ");
            int x = Integer.parseInt(inp[0]);
            int y = Integer.parseInt(inp[1]);
            
            String s = read.readLine();
            
            Solution ob = new Solution();
            
            
            System.out.println(ob.arrangeString(s, x, y));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    
    public String arrangeString(String str, int x, int y)
    {
        StringBuilder sb=new StringBuilder();
        int count=0;
        int count1=0;
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)=='0')
            {
                count++;
            }
            else{
                count1++;
            }
        }
        while(count!=0 && count1!=0)
            {
                int dee=x;
                int man=y; 
                while(dee!=0){
                    sb.append("0");
                    dee--;
                    count--;
                    if(count==0)
                    {
                        break;
                    }
                }
                while(man!=0)
                {
                    sb.append("1");
                    man--;
                    count1--;
                    if(count1==0)
                    {
                        break;
                    }
                }
                
            }
            while(count!=0)
            {
                sb.append("0");
                count--;
            }
            while(count1!=0)
            {
                sb.append("1");
                count1--;
            }
            return sb.toString();
        
    }

}