//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            String[] str = br.readLine().split(" ");

            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(str[i]);
            }

            int[] ans = new Solve().findTwoElement(a, n);
            System.out.println(ans[0] + " " + ans[1]);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solve {
    int[] findTwoElement(int arr[], int n) {
        int c=1;
        int out=0;
        for(int ele:arr){
            out^=ele;
            out^=c;
            c++;
        }
        int mask=out&-out;
        int a=0,b=0;
        c=1;
        for(int ele:arr){
            if((ele&mask)==0){
                a^=ele;
            }else{
                b^=ele;
            }
            if((c&mask)==0){
                a^=c;
            }else{
                b^=c;
            }
            c++;
        }
        for(int ele:arr){
            if(ele==a) return new int[]{a,b};
            if(ele==b) return new int[]{b,a};
        }
        return null;
    }
}

// 001
// 010
// 011
// 011



