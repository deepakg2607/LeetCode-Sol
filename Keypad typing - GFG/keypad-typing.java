//{ Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		sc.nextLine();
		while(t-->0)
		{
		    String s=sc.nextLine();
		    
		    System.out.println(printNumber(s,s.length()));
		}
		
	}

// } Driver Code Ends
//User function Template for Java


//Function to find matching decimal representation of a string as on the keypad.
public static String printNumber(String s, int n) 
{
    //Your code here
    StringBuilder sb=new StringBuilder();
    for(int i=0;i<n;i++)
    {
        if(s.charAt(i)>='a' && s.charAt(i)<='c')
        {
            sb.append('2');
        }
        else if(s.charAt(i)>='d' && s.charAt(i)<='f')
        {
            sb.append('3');
        }
        else if(s.charAt(i)>='g' && s.charAt(i)<='i')
        {
            sb.append('4');
        }
        else if(s.charAt(i)>='j' && s.charAt(i)<='l')
        {
            sb.append('5');
        }
        else if(s.charAt(i)>='m' && s.charAt(i)<='o')
        {
            sb.append('6');
        }
         else if(s.charAt(i)>='p' && s.charAt(i)<='s')
        {
            sb.append('7');
        }
         else if(s.charAt(i)>='t' && s.charAt(i)<='v')
        {
            sb.append('8');
        }
         else if(s.charAt(i)>='w' && s.charAt(i)<='z')
        {
            sb.append('9');
        }
        
    }
    return sb.toString();
}

//{ Driver Code Starts.

}

// } Driver Code Ends