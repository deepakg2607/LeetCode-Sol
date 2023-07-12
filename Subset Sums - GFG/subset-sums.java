//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int N=sc.nextInt();
			ArrayList<Integer> arr = new ArrayList<>();
			for(int i = 0; i < N ; i++){
			    arr.add(sc.nextInt());
			}
            Solution ob = new Solution();
         
            ArrayList<Integer> ans = ob.subsetSums(arr,N);
            Collections.sort(ans);
            for(int sum : ans){
                System.out.print(sum+" ");
            }
            System.out.println();
        }  
    }
}

// } Driver Code Ends


//User function Template for Java//User function Template for Java
class Solution{
    public void deepak(ArrayList<Integer> arr, int i , int sum, ArrayList<Integer> ans, int N)
    {
        if(i==N)
        {
            ans.add(sum);
            return ;
        }
        deepak(arr , i+1, sum+arr.get(i) , ans , N);
        deepak(arr , i+1 ,sum , ans , N);
    }
    ArrayList<Integer> subsetSums(ArrayList<Integer> arr, int N){
        // code here
        ArrayList<Integer> ans=new ArrayList<>();
        int index=0;
        int sum=0;
        deepak(arr , index , sum , ans, N);
        Collections.sort(ans);
        return  ans;
    }
}