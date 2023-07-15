//{ Driver Code Starts
// Initial Template for Java

// Initial Template for Java

import java.util.*;
import java.io.*;

  public class validip {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            String s = sc.next();
            Solution obj = new Solution();

            if (obj.isValid(s))
                System.out.println(1);
            else
                System.out.println(0);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {

    public boolean isValid(String s) {
        String[] l = s.split("\\.",-1);
        if(l.length!=4) return false;
        for(int i=0;i<4;i++){
            int x=-1;
            try{
                x=Integer.parseInt(l[i]);
            }
            catch(Exception ignored){}
            if(x<0 || x>255 || (l[i].charAt(0)=='0' &&  l[i].length()>1))return false;
        }
        return true;
    }
}