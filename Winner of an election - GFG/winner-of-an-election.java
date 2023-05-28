//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GfG
{
    public static void main (String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            String arr[] = new String[n];
            
            for(int i = 0; i < n; i++)
                arr[i] = sc.next();
            
            Solution obj = new Solution();    
            String result[] = obj.winner(arr, n);
            System.out.println(result[0] + " " + result[1]);
            
           
        }
        
    }
}

// } Driver Code Ends


//User function Template for Java


class Solution
{
    //Function to return the name of candidate that received maximum votes.
    public static String[] winner(String arr[], int n)
    {
        // add your code
        HashMap<String, Integer> map=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            if(map.containsKey(arr[i]))
            {
                map.put(arr[i], map.get(arr[i])+1);
            }
            else{
                map.put(arr[i],1);
            }
        }
        ArrayList<Integer> e=new ArrayList<>();
        for(Map.Entry<String, Integer> man:map.entrySet())
        {
            e.add(man.getValue());
        }
        int d=Collections.max(e);
        ArrayList<String> a=new ArrayList<>();
        for(Map.Entry<String , Integer> dee:map.entrySet())
        {
            if(dee.getValue()==d)
            {
                a.add(dee.getKey());
            }
        }
        Collections.sort(a);
        return new String[]{a.get(0),String.valueOf(d)};
        
    }
}

