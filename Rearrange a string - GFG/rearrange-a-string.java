//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GfG
{
    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    String s = sc.next();
                    Solution obj = new Solution();
                    System.out.println(obj.arrangeString(s));
                }
                
        }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    public String arrangeString(String s)
        {
            
            int sum=0;
            String dee="";
            for(int i=0;i<s.length();i++)
            {
                if(s.charAt(i)>='0' && s.charAt(i)<='9')
                {
                    int shi=Character.getNumericValue(s.charAt(i));
                    sum=sum+shi;
                    
                }
                else{
                  dee=dee+s.charAt(i); 
                  
                }
                
            }
            
            char a[]=dee.toCharArray();
            Arrays.sort(a);
            
            String man=new String(a);
            if(man.length()==1)
            {
                return man;
            }
            String z=man+sum;
            return z;
        }
}
