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
            int Matrix[][] = new int[N][N];
            for(int i = 0; i < N*N; i++)
                Matrix[(i/N)][i%N] = Integer.parseInt(input_line[i]);
            
            Solution ob = new Solution();
            System.out.println(ob.maximumPath(N, Matrix));
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution{
    static int maximumPath(int N, int mat[][])
    {
        return cn(mat);
    }
    
    	public static int cn(int[][] input) {
		if(input.length==0) return 0;
		Integer[][] dp=new Integer[input.length][input[0].length];
		int out=0;
		for(int i=0;i<input.length;i++){
		    for(int j=0;j<input[0].length;j++){
		        out=Math.max(out,f(input,i,j,dp));
		    }
		}
		return out;
	}

	public static int f(int[][] mat,int r,int c,Integer[][] dp){

		if(r==mat.length-1) return mat[r][c];

		int output=Integer.MIN_VALUE;

		if(checkConstraints(mat,r+1,c)){
			if(dp[r+1][c]==null){
				dp[r+1][c]=f(mat,r+1,c,dp);
			}
			output=Math.max(dp[r+1][c],output);
		}
		if(checkConstraints(mat,r+1,c-1)){
			if(dp[r+1][c-1]==null){
				dp[r+1][c-1]=f(mat,r+1,c-1,dp);
			}
			output=Math.max(dp[r+1][c-1],output);
		}
		if(checkConstraints(mat,r+1,c+1)){
			if(dp[r+1][c+1]==null){
				dp[r+1][c+1]=f(mat,r+1,c+1,dp);
			}
			output=Math.max(dp[r+1][c+1],output);
		}

		return output+mat[r][c];

	}

	private static boolean checkConstraints(int[][] mat,int r,int c){
		return (r<mat.length && r>=0 && c<mat[0].length && c>=0);
	}
    
    
}