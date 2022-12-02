//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GfG { 
    
	public static void main (String[] args) throws IOException  {
	    
	    //reading input using BufferedReader class
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//reading total testcases
		int t = Integer.parseInt(br.readLine().trim());
		while(t-->0){
		    
		    //reading number of eggs and floors
		    String inputLine[] = br.readLine().trim().split(" ");
		    
		    int n = Integer.parseInt(inputLine[0]);
		    int k = Integer.parseInt(inputLine[1]);
		    
		    //calling eggDrop() method of class
		    //EggDrop
		    System.out.println(new Solution().eggDrop(n, k));
		}
	}
}



// } Driver Code Ends


class Solution 
{
    //Function to find minimum number of attempts needed in 
    //order to find the critical floor.
    static int eggDrop(int e, int fc) 
	{
	    Integer[][] dp=new Integer[e+1][fc+1];
	    return f(e,fc,dp);
	}
	
	static int f(int e,int fc,Integer[][] dp){
	    
	    if(e==1) return fc;
	    
	    if(e<=0) return -1;
	    
	    if(fc==1 || fc==0) return fc;
	    
	    int out=Integer.MAX_VALUE;
	    for(int i=1;i<=fc;i++){
	        if(dp[e-1][i-1]==null){
	            dp[e-1][i-1]=f(e-1,i-1,dp);
	        }
	        int c1=dp[e-1][i-1];
	        int c2=-1;
	        if(fc-i>=0){
	            if(dp[e][fc-i]==null){
    	            dp[e][fc-i]=f(e,fc-i,dp);
    	        }
	            c2=dp[e][fc-i];
	        }
	        if(c1==-1 && c2==-1) continue;
	        int res=Math.max(c1,c2);
	        out=Math.min(out,res);
	    }
	    
	    return out==Integer.MAX_VALUE?Integer.MAX_VALUE:out+1;
	    
	}
}