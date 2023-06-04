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
                    int n=sc.nextInt();
                    int d=sc.nextInt();
                    Solution obj = new Solution();
                    
                    Vector<Integer> v= obj.solve(n,d);
                    
                    for (int i = 0; i < v.size(); i++) 
                        System.out.print(v.get(i) + " ");
                        
                    System.out.println();
                }
                
        }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    public Vector<Integer> solve(int n, int d)
    {
        //code here
        String s = new String();

        Vector<Integer> v = new Vector<Integer>();

        String c = Integer.toString(d);

        int x =0;

        

        for(int i=0;i<=n;i++)

        {

            s=Integer.toString(i);

            if(s.contains(c))

            {

                x = Integer.parseInt(s);

                v.add(x);

            }

        }

        

        if(v.size()==0)

            {

                v.add(-1);

            }

        return v;
    }
}