//{ Driver Code Starts
//Initial Template for Java


import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            int n = Integer.parseInt(br.readLine().trim());
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            int[] ans = new Solution().constructLowerArray(arr, n);
            for (int i = 0; i < n; i++) {
                System.out.print(ans[i] + " ");
            }
            System.out.println();
        }
    }
}

// } Driver Code Ends


//User function Template for Java


class Solution {
    int[] constructLowerArray(int[] nums, int n) {
        // code here
        int res[]=new int[nums.length];
        int [][] a =new int[nums.length][2];
        for(int i=0;i<nums.length;i++)
        {
            a[i][0]=nums[i];
            a[i][1]=i;
        }
        mergeSort(a,res, 0 , nums.length-1);
        int ans[]=new int[n];
        for(int i=0;i<nums.length;i++)
        {
            ans[i]=res[i];
        }
        return ans;
    }
    public void mergeSort(int a[][], int res[], int start , int end )
    {
        if(start<end)
        {
            int mid=(start+end)/2;
            mergeSort(a , res , start , mid);
            mergeSort(a , res , mid+1 , end);
            merge(a, res , start , mid , end);
        }
    }
    public void merge(int a[][], int res[] , int start , int mid , int end)
    {
        int[][] left = Arrays.copyOfRange(a, start, mid+1);
        int[][] right = Arrays.copyOfRange(a, mid+1, end+1);
        int i=0;
        int j=0;
        int count=0;
        int k=start;
        while ( i<left.length && j<right.length ) {
            if ( left[i][0]<=right[j][0] ) {
                res[left[i][1]] += count;
                a[k++] = left[i++];
            } else {
                count++;
                a[k++] = right[j++];
            }
        }
        while ( i<left.length ) {
            res[left[i][1]] += count;
            a[k++] = left[i++];
        }
        while ( j<right.length ) {
            a[k++] = right[j++];
        }
    }
    
}