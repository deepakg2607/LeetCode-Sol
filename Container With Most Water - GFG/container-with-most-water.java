//{ Driver Code Starts
//Initial Template for Java


import java.io.*;
import java.util.*;
import java.lang.*;


class GFG {
	public static void main (String[] args) throws IOException{
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
		while(t-->0){
		    int n = Integer.parseInt(br.readLine()); // input size of array
		    int arr[] = new int[n];
		    String inputLine[] = br.readLine().trim().split("\\s+");
		    for(int i=0; i<n; i++){
		        arr[i] = Integer.parseInt(inputLine[i]); // input elements of array
		    }
		    Solve T = new Solve();
            long ans = T.maxArea(arr,n);
            System.out.println(ans);
		}
	}
}

// } Driver Code Ends


//User function Template for Java


class Solve{
    
    long maxArea(int height[], int len){
        // Code Here
        int i=0;
        int j=height.length-1;
        long max=0;
        while(i<j)
        {
          int dee = j-i;
          int calc = dee* (Math.min(height[i] , height[j]));
          max=Math.max(max , calc);
          if(height[i]<height[j])
          {
              i++;
          } 
          else{
              j--;
          }
        }
        return max;
        
    }
    
}