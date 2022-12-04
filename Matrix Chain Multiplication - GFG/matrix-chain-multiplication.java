//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            int N = Integer.parseInt(in.readLine());
            String input_line[] = in.readLine().trim().split("\\s+");
            int arr[]= new int[N];
            for(int i = 0; i < N; i++)
                arr[i] = Integer.parseInt(input_line[i]);
            
            Solution ob = new Solution();
            System.out.println(ob.matrixMultiplication(N, arr));
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution{
    static int matrixMultiplication(int N, int arr[])
    {
        Integer[][] dp=new Integer[arr.length][arr.length];
        int ans=f(arr,1,arr.length-1,dp);
        return ans==Integer.MAX_VALUE?0:ans;
    }
    
    static int f(int[] arr,int si,int ei,Integer[][] dp){
        
        int output=Integer.MAX_VALUE;
        
        for(int i=si;i<ei;i++){
            
            int res=0;
            
            if(dp[si][i]==null){
                dp[si][i]=f(arr,si,i,dp);
            }
            if(dp[i+1][ei]==null){
                dp[i+1][ei]=f(arr,i+1,ei,dp);
            }
            
            if(dp[si][i]!=Integer.MAX_VALUE) res+=dp[si][i];
            if(dp[i+1][ei]!=Integer.MAX_VALUE) res+=dp[i+1][ei];
            
            
            res+=arr[si-1]*arr[i]*arr[ei];
            output=Math.min(output,res);
        }
        
        return output;
        
    }
    
    
}