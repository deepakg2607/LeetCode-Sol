//{ Driver Code Starts
import java.util.*;

class Find_Given_Element_Of_Spiral_Matrix 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t > 0)
		{
			int n = sc.nextInt();
			int m = sc.nextInt();
			int k = sc.nextInt();
			int arr[][] = new int[1000][1000];
			for(int i=0; i<n; i++)
			{
				for(int j=0; j<m; j++ )
				{
					arr[i][j] = sc.nextInt();
				}
			}
			System.out.println(new Solution().findK(arr, n, m, k));
		t--;
		}
	}
}
// } Driver Code Ends


   /*You are required to complete this method*/
    

class Solution
{
    /*You are required to complete this method*/
    int findK(int matrix[][], int n, int m, int k)
    {
	    ArrayList<Integer>a =new ArrayList<>();
       int top=0, left=0, right=m-1, bottom=n-1;
       while(top<=bottom&&left<=right)
       {
       for(int i=left;i<=right;i++)
       {
           a.add(matrix[top][i]);
       }
       top++;
       for(int i=top;i<=bottom;i++)
       {
           a.add(matrix[i][right]);
       }
       right--;
       if(top<=bottom)
       {
           for(int i=right;i>=left;i--)
           {
               a.add(matrix[bottom][i]);
           }
           bottom--;
       }
       if(right>=left)
       {
           for(int i=bottom;i>=top;i--)
           {
               a.add(matrix[i][left]);
               
           }
           left++;
       }
       }
       return a.get(k-1);
       	
    }
}
