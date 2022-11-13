//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;
class GfG {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int sum = sc.nextInt();
            int N = sc.nextInt();
            int coins[] = new int[N];
            for (int i = 0; i < N; i++) coins[i] = sc.nextInt();
            Solution ob = new Solution();
            System.out.println(ob.count(coins, N, sum));
        }
    }
}


// } Driver Code Ends


// User function Template for Java

class Solution {

    public long count(int arr[], int N, int sum) {
         Long[][] dp=new Long[N+1][sum+1];
         return f(arr,0,sum,dp);
         
    }
    
    public long f(int[] arr,int indx,int sum,Long[][] dp){
        if(sum==0) return 1;
        if(sum<0 || indx>=arr.length)  return 0;
        long res=0;
        for(int i=indx;i<arr.length;i++){
            if(sum-arr[i]<0){
                continue;
            }
            if(dp[i][sum-arr[i]]!=null){
                res+=dp[i][sum-arr[i]];
            }else{
                long o=f(arr,i,sum-arr[i],dp);
                dp[i][sum-arr[i]]=o;
                res+=o;
            }
        }
        return res;
    }
}