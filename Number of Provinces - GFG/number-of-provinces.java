//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int V = Integer.parseInt(read.readLine());
            
            ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
            
            for(int i=0; i<V; i++)
            {
                String S[] = read.readLine().split(" ");
                ArrayList<Integer> temp = new ArrayList<>();
                for(int j=0; j<V; j++)
                    temp.add(Integer.parseInt(S[j]));
                adj.add(temp);
            }

            Solution ob = new Solution();
            System.out.println(ob.numProvinces(adj,V));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
     public static void dfs(ArrayList<ArrayList<Integer>> list , boolean[] visited , int node)
    {
       visited[node]= true;
       for(int i: list.get(node))
       {
            if(visited[i]!=true)
            {
                dfs(list , visited , i);
            }
       }
    }
    static int numProvinces(ArrayList<ArrayList<Integer>> isConnected, int V) {
        // code here
        int count=0;
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        for(int i=0;i<V;i++)
        {
            list.add(new ArrayList<>());
        }
        for(int i=0;i<V;i++)
        {
            for(int j=0;j<V;j++)
            {
                if(i!=j && isConnected.get(i).get(j)==1)
                {
                    list.get(i).add(j);
                    list.get(j).add(i);
                }
            }
        }
        boolean visited[] = new boolean[V];

        for(int i=0;i<V;i++)
        {
            if(visited[i]==false)
            {
                count++;
                dfs(list , visited , i);
            }
        }
       return count;
        
    }
};