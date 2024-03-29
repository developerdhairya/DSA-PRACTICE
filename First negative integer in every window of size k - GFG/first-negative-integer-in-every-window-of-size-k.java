//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main(String[] args) throws IOException
	{
	        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while(t-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            long a[] = new long[(int)(n)];
            // long getAnswer[] = new long[(int)(n)];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Long.parseLong(inputLine[i]);
            }
            int k = Integer.parseInt(br.readLine().trim());
            
            Compute obj = new Compute();
            long answer[] = obj.printFirstNegativeInteger(a, n, k);
            int sz = answer.length;
            
            StringBuilder output = new StringBuilder();
            for(int i=0;i<sz;i++)
                output.append(answer[i]+" ");
            System.out.println(output);
            
        }
	}
}


// } Driver Code Ends


//User function Template for Java


class Compute {
    
    public long[] printFirstNegativeInteger(long[] arr, int N, int k)
    {
        ArrayDeque<Integer> dq = new ArrayDeque<>(k);
        long[] out = new long[N-k+1];
        int c=0;
        for(int i=0;i<k;i++){
            if(arr[i]<0){
                dq.addLast(i);
            }
        }
        for(int i=0;i<N-k+1;i++){
            while(!dq.isEmpty() && dq.peekFirst()<i) dq.removeFirst();
            if(arr[i+k-1]<0 && i+k-1>=k ) dq.addLast(i+k-1);
            out[c++]=dq.isEmpty()?0:arr[dq.peekFirst()];
        }
        return out;
        
    }
}