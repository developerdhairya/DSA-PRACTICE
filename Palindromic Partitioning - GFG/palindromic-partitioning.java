//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            String str = in.readLine();
            Solution ob = new Solution();
            System.out.println(ob.palindromicPartition(str));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    static int palindromicPartition(String str)
    {
       Integer[] dp=new Integer[str.length()+1];
       return count(str,0,dp);
       
    }
    
    static int count(String str,int si,Integer[] dp){
        if(si>=str.length()-1) return 0;
        if(isPalindrome(str,si,str.length()-1)) return 0;
        int min=Integer.MAX_VALUE;
        for(int k=si;k<=str.length()-1;k++){
            if(isPalindrome(str,si,k)){
                if(dp[k+1]==null) dp[k+1]=count(str,k+1,dp);
                min=Math.min(dp[k+1]+1,min);
            }
        }
        return min;
    }
    
    
    static boolean isPalindrome(String str,int si,int ei){
        int i=si,j=ei;
        while(i<j){
            if(str.charAt(i++)!=str.charAt(j--)) return false;
        }
        return true;
    }
}