//{ Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

import java.util.HashMap; 
import java.util.Map; 
import java.util.Map.Entry; 


// } Driver Code Ends
//User function Template for Java

class Solution{
    // A1[] : the input array-1
    // N : size of the array A1[]
    // A2[] : the input array-2
    // M : size of the array A2[]
    
    //Function to sort an array according to the other array.
    public static int[] sortA1ByA2(int arr1[], int N, int arr2[], int M)
    {
        //Your code here
        HashMap<Integer, Integer> map=new HashMap<>();
        for(int i=0;i<arr1.length;i++)
        {
            if(map.containsKey(arr1[i]))
            {
                map.put(arr1[i], map.get(arr1[i])+1);
            }
            else{
                map.put(arr1[i],1);
            }
        }
        int a[]=new int[arr1.length];
        int k=0;
        int l=0;
        ArrayList<Integer> a1=new ArrayList<>();
        for(int i=0;i<arr2.length;i++)
        {
            if(map.containsKey(arr2[i]))
            {
                for(int j=0;j<map.get(arr2[i]);j++)
                {
                    a[l]=arr2[i];
                    l++;
                }
            }
            map.remove(arr2[i]);

        }
        for(int i:map.keySet())
        {
           for(int j=0;j<map.get(i);j++)
           {
               a1.add(i);
           }
        }
        Collections.sort(a1);
        for(int i=0;i<a1.size();i++)
        {
            a[l]=a1.get(i);
            l++;
        }
        return a;
    }
}



//{ Driver Code Starts.
class Main {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int t=sc.nextInt();
		
		while(t-->0)
		{
		    int n=sc.nextInt();
		    int m=sc.nextInt();
		    int a1[]=new int[n];
		    int a2[]=new int[m];
		    
		    for(int i=0;i<n;i++)
		    a1[i]=sc.nextInt();
		    
		    for(int i=0;i<m;i++)
		    a2[i]=sc.nextInt();
		    Solution ob=new Solution();
		    a1 = ob.sortA1ByA2(a1,n,a2,m);
		    for(int x:a1)
		    System.out.print(x+" ");
		    
		    System.out.println();
		}
	}
	

}



// } Driver Code Ends