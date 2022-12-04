//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {

		Scanner sc=new Scanner(System.in);
		int test=sc.nextInt();
		while(test-- > 0){
		    int p=sc.nextInt();             // Take size of both the strings as input
		    int q=sc.nextInt();
		    
		    String s1=sc.next();            // Take both the string as input
	        String s2=sc.next();
		    
		    Solution obj = new Solution();
		    
		    System.out.println(obj.lcs(p, q, s1, s2));
		}
	}
}
// } Driver Code Ends


class Solution
{
    //Function to find the length of longest common subsequence in two strings.
    static int lcs(int x, int y, String s1, String s2)
    {
        Integer[][] dp=new Integer[x+1][y+1];
        return f(x,y,s1,s2,dp);
    }
    
    static int f(int m,int n,String s1,String s2,Integer[][] dp){
        if(m==0 || n==0) return 0;
        
        if(s1.charAt(m-1)==s2.charAt(n-1)){
            if(dp[m-1][n-1]==null){
                dp[m-1][n-1]=f(m-1,n-1,s1,s2,dp);
            }
            return 1+dp[m-1][n-1];
        }
        
        if(dp[m-1][n]==null) dp[m-1][n]=f(m-1,n,s1,s2,dp);
        if(dp[m][n-1]==null) dp[m][n-1]=f(m,n-1,s1,s2,dp);
        
        return Math.max(dp[m-1][n],dp[m][n-1]);
        
    }
    
    
}