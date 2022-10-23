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
        long[] tab=new long[sum+1];
        tab[0]=1;
        for(int ele:arr){
            for(int i=0;i<sum+1;i++){
                if(i-ele>=0)
                    tab[i]+=tab[i-ele];
            }
        }
        return tab[sum];
    }
}