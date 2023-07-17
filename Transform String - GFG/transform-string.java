//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main(String args[])throws IOException
        {
            BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
            int t = Integer.parseInt(br.readLine());
            while(t-->0)
                {
                    String arr[] = br.readLine().split(" ");
                    String A = arr[0];
                    String B = arr[1];
                    Solution obj = new Solution();
                    System.out.println(obj.transform (A, B));
                }
        }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    int transform (String A, String B)
    {
        // code here
        int ans = 0;

        if (A.length() != B.length()) {
            return -1;
        }
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();
        for (int i = 0; i < A.length(); i++) {
            char ch = A.charAt(i);

            if (map1.containsKey(ch)) {
                map1.put(ch, map1.get(ch) + 1);
            } else {
                map1.put(ch, 1);
            }

        }
        for (int i = 0; i < B.length(); i++) {
            char ch = B.charAt(i);

            if (map2.containsKey(ch)) {
                map2.put(ch, map2.get(ch) + 1);
            } else {
                map2.put(ch, 1);
            }

        }
         if (!map1.equals(map2)) {
            return -1;
        }
         int i = A.length() - 1;
        int j = A.length() - 1;

        while (i >= 0) {
            char ch1 = A.charAt(i);
            char ch2 = B.charAt(j);
            
            if (ch1==ch2){
                i--;
                j--;
            }
            else{
                i--;
                ans++;
            }
        }

        return ans;
        
    }
}