//{ Driver Code Starts
import java.util.*;
class Triplets{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			int[] a=new int[n];
			for(int i=0;i<n;i++){
				a[i]=sc.nextInt();
			}
			Solution g=new Solution();
			if(g.findTriplets(a,n))
				System.out.println("1");
			else
				System.out.println("0");
			
		}
	}
}
// } Driver Code Ends


/*Complete the function below*/


class Solution
{
    // arr[]: input array
    // n: size of the array
    //Function to find triplets with zero sum.
	public boolean findTriplets(int arr[] , int n)
    {
        //add code here.
        
        var m = new HashMap<Integer,Integer>();
        int s = 0;
        
        for(int i=0;i<n;i++)
        {
            m.put(arr[i],i);
        }
        
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(j==i) continue;
                
                s = arr[i]+arr[j];
                
                if(m.containsKey(0-s) && m.get(0-s)!= i &&  m.get(0-s)!= j )  return true;
               
                s = 0;
            }
            
        }
        
        return false;
    }
}
    