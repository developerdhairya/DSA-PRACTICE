//{ Driver Code Starts
//Initial Template for Java



import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            int n = Integer.parseInt(br.readLine().trim());
            String[] arr = br.readLine().trim().split(" ");

            String ans = new Solution().printLargest(arr);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    
    class helper implements Comparator<String>{
        @Override
        public int compare(String n1,String n2){
            String c1=n1+n2;
            String c2=n2+n1;
            return -1*c1.compareTo(c2);
        }}
    
    
    String printLargest(String[] arr) {
        Arrays.sort(arr,new helper());
        String output="";
        for(String ele:arr){
            output+=ele;
        }
        return output;
    }
}