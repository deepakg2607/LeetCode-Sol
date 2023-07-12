//{ Driver Code Starts
import java.io.*;
import java.util.*;


class IntArray
{
    public static int[] input(BufferedReader br, int n) throws IOException
    {
        String[] s = br.readLine().trim().split(" ");
        int[] a = new int[n];
        for(int i = 0; i < n; i++)
            a[i] = Integer.parseInt(s[i]);

        return a;
    }

    public static void print(int[] a)
    {
        for(int e : a)
            System.out.print(e + " ");
        System.out.println();
    }

    public static void print(ArrayList<Integer> a)
    {
        for(int e : a)
            System.out.print(e + " ");
        System.out.println();
    }
}

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            
            int n;
            n = Integer.parseInt(br.readLine());
            
            
            int[] arr = IntArray.input(br, n);
            
            Solution obj = new Solution();
            boolean res = obj.isFrequencyUnique(n, arr);
            
            int _result_val = (res) ? 1 : 0;
            System.out.println(_result_val);
        }
    }
}

// } Driver Code Ends



class Solution {
    public static boolean isFrequencyUnique(int n, int[] arr) {
        // code here
        HashMap<Integer, Integer> map=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            if(map.containsKey(arr[i]))
            {
                map.put(arr[i], map.get(arr[i])+1);
            }
            else{
                map.put(arr[i], 1);
            }
        }
        HashSet<Integer> set=new HashSet<>();
        for(int i: map.keySet())
        {
            set.add(map.get(i));
        }
        return set.size()==map.size();
        }
}
        
