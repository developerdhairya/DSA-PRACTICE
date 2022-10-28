class Solution {
    
    public int numRollsToTarget(int n,int k,int target){
        int[][] dp=new int[n+1][target+1];
        for(int[] arr:dp){
            Arrays.fill(arr,-1);
        }
        return helper(n,k,target,dp);
    }
    
    public int helper(int n, int k, int target,int[][] dp) {
        if(n==0){
            return target==0?1:0;
        }
        if(target<0){
            return 0;
        }
        if(dp[n][target]!=-1){
            return dp[n][target];
        }
        int output=0;
        for(int i=1;i<=k;i++){
            output=(output+helper(n-1,k,target-i,dp))%1000000007;
        }
        dp[n][target]=output;
        return output;
    }
}