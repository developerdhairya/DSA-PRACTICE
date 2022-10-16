//{ Driver Code Starts
import java.util.*;

class MaxLenZeroSumSub
{

    // Returns length of the maximum length subarray with 0 sum

    // Drive method
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0)
        {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++)
                arr[i] = sc.nextInt();

            GfG g = new GfG();
            System.out.println(g.maxLen(arr, n));
            T--;
        }
    }
}
// } Driver Code Ends


class GfG
{
    int maxLen(int arr[], int n)
    {
        return solution(arr,n,0);
    }
    
    int solution(int[] arr,int n,int k){
        Map<Integer,Integer> map=new HashMap<>(); // <p_sum,index>
        int output=0;
        int p_sum=0;
        for(int i=0;i<n;i++){
            int ele=arr[i];
            p_sum+=ele;
            if(p_sum==k){
                output=Math.max(output,i+1);
            }
            if(map.containsKey(p_sum-k)){
                output=Math.max(output,i-map.get(p_sum-k));
            }else{
                map.put(p_sum,i);
            }
            
        }
        return output;
    }
}