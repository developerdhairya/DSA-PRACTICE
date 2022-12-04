//{ Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
	    
	    //taking input using Scanner class
		Scanner sc=new Scanner(System.in);
		
		//taking total testcases
		int t=sc.nextInt();
		
		sc.nextLine();
		while(t-->0)
		{
		   //taking String X and Y
		   String S[]=sc.nextLine().split(" ");
		   String X=S[0];
		   String Y=S[1];
		   
		   //calling function shortestCommonSupersequence()
		   System.out.println(new Solution().shortestCommonSupersequence(X, Y, X.length(), Y.length()));
		}
	}




       
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    //Function to find length of shortest common supersequence of two strings.
    public static int shortestCommonSupersequence(String X,String Y,int m,int n)
    {
        return m+n-lcs(X,Y,m,n);
    }
    
    public static int lcs(String X,String Y,int m,int n){
        Integer[][] dp=new Integer[m+1][n+1];
        return f(X,Y,m,n,dp);
    }
    
    public static int f(String s1,String s2,int m,int n,Integer[][] dp){
        
        if(m==0 || n==0) return 0;
        
        if(s1.charAt(m-1)==s2.charAt(n-1)){
            if(dp[m-1][n-1]==null)  dp[m-1][n-1]=f(s1,s2,m-1,n-1,dp); 
            return 1+dp[m-1][n-1];
        }
        
        if(dp[m][n-1]==null) dp[m][n-1]=f(s1,s2,m,n-1,dp); 
        if(dp[m-1][n]==null) dp[m-1][n]=f(s1,s2,m-1,n,dp); 
        
        return Math.max(dp[m][n-1],dp[m-1][n]);
    }
    
    
}