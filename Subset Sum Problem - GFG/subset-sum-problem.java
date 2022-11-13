//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int N = Integer.parseInt(read.readLine());
            String input_line[] = read.readLine().trim().split("\\s+");
            int arr[]= new int[N];
            for(int i = 0; i < N; i++)
                arr[i] = Integer.parseInt(input_line[i]);
            int sum = Integer.parseInt(read.readLine());

            Solution ob = new Solution();
            if(ob.isSubsetSum(N, arr, sum))
            System.out.println(1);
            else
            System.out.println(0);

            
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution{


    static Boolean isSubsetSum(int N, int arr[], int sum){
        Boolean[][] dp=new Boolean[N+1][sum+1];
         return f(arr,0,sum,dp);
    }
    
    static public Boolean f(int[] arr,int indx,int sum,Boolean[][] dp){
        if(sum==0) return true;
        if(sum<0 || indx>=arr.length)  return false;
        boolean res=false;
        for(int i=indx;i<arr.length;i++){
            if(sum-arr[i]<0){
                continue;
            }
            if(dp[i][sum-arr[i]]!=null){
                res=res || dp[i][sum-arr[i]];
            }else{
                Boolean o=f(arr,i+1,sum-arr[i],dp);
                dp[i][sum-arr[i]]=o;
                res=res || o;
            }
            if(res){
                return true;
            }
        }
        return res;
    }
    
    
}