//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    int v = sc.nextInt();
                    int m = sc.nextInt();
                    int coins[] = new int[m];
                    for(int i = 0;i<m;i++)
                        coins[i] = sc.nextInt();
                    Solution ob = new Solution();
                    System.out.println(ob.minCoins(coins, m, v));
                }
        }
}    
// } Driver Code Ends


class Solution{

	public int minCoins(int coins[], int M, int k) 
	{ 
	    Integer[] dp=new Integer[k+1];
	    int output=f(coins,k,dp);
	    if(output==Integer.MAX_VALUE) return -1;
	    return output;
	} 
	
	public int f(int[] coins,int k,Integer[] dp){
	    if(k==0) return 0;
	    if(k<0) return Integer.MAX_VALUE;
	    int output=Integer.MAX_VALUE;
	    
	    for(int i=0;i<coins.length;i++){
	        if(k-coins[i]<0) continue;
	        int temp;
	        if(dp[k-coins[i]]==null){
	            temp=f(coins,k-coins[i],dp);
	            dp[k-coins[i]]=temp;
	         }else{
	            temp=dp[k-coins[i]];
	         }     
	        if(temp!=Integer.MAX_VALUE){
	            output=Math.min(output,temp+1);
	        } 
	    }
	    
	    return output;
	    
	}
	
	
	
}