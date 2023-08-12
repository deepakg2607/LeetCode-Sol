//{ Driver Code Starts
import java.io.*;
import java.util.*; 

class GFG{
    public static void main(String args[]) throws IOException { 
        
        //taking input using Scanner class
        Scanner sc = new Scanner(System.in);
        
        //taking total testcases
        int t = sc.nextInt();
        while(t > 0){
            
            //taking size of array
            int n = sc.nextInt();
            int array[] = new int[n];
            
            //inserting elements in the array
            for (int i = 0; i < n; ++i)
            {
                array[i] = sc.nextInt();
            }
            
            //creating an object of class Solution
            Solution ob = new Solution();
            
            //calling longestSubsequence() method of class
            //Solution
            System.out.println(ob.longestSubsequence(n,array));
            t--;
        }
    } 
} 
// } Driver Code Ends




class Solution 
{
    //Function to find length of longest increasing subsequence.
    static int longestSubsequence(int size, int nums[])
    {
        // code here
        ArrayList<Integer> list=new ArrayList<>(nums.length);
        list.add(nums[0]);
        for(int i=1;i<nums.length;i++){
            if(list.get(list.size()-1)<nums[i]){
                list.add(nums[i]);
            }
            else{
                int lbound=fun(0,list.size()-1,list,nums[i]);
                list.set(lbound,nums[i]);
            }
            
        }
        return list.size();
        
    }
    public static int fun(int s,int e ,ArrayList<Integer> list,int tar){
        while(s<=e){
            int mid=s+(e-s)/2;
            if(list.get(mid)>=tar){
                e=mid-1;
            }
            else {
                s=mid+1;
            }
        }
        return s;
    }
} 