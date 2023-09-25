//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());

        while (tc-- > 0) {
            String[] nk = br.readLine().trim().split(" ");
            int n = Integer.parseInt(nk[0]);
            int k = Integer.parseInt(nk[1]);

            String[] str = br.readLine().trim().split(" ");
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(str[i]);
            }

            Solution sln = new Solution();
            ArrayList<ArrayList<Integer>> ans = sln.fourSum(a, k);
            for (ArrayList<Integer> v : ans) {
                for (int u : v) {
                    System.out.print(u + " ");
                }
                System.out.print("$");
            }
            if (ans.isEmpty()) {
                System.out.print(-1);
            }
            System.out.println();
        }
    }
}
// } Driver Code Ends




// User function Template for Java

// arr[] : int input array of integers
// k : the quadruple sum required

class Solution {
    public ArrayList<ArrayList<Integer>> fourSum(int[] arr, int k) {
        Set<ArrayList<Integer>> set=new LinkedHashSet<>();
        Arrays.sort(arr);
        for(int i=0;i<arr.length-3;i++)
        {
            for(int j=i+1;j<arr.length-2;j++)
            {
                int m=j+1;
                int l=arr.length-1;
                while(m<l)
                {
                    long sum=(long)arr[i]+(long)arr[j]+(long)arr[m]+(long)arr[l];
                    if(sum==k){
                       ArrayList<Integer> al = new ArrayList<>();
                       al.add(arr[i]);
                       al.add(arr[j]);
                       al.add(arr[m]);
                       al.add(arr[l]);
                       set.add(al);
                       m++;
                       l--;
                    }
                      
                   else if(sum>k)
                   {
                      l--; 
                   }else if(sum<k)
                   {
                       m++;
                   }
               }
           }
        }
       
       ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>(set);
       return ans;
                }

}
            
        