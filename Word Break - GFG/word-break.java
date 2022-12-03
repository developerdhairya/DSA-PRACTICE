//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
public class GfG
{
    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    int n;
                    n = sc.nextInt();
                    ArrayList<String> arr = new ArrayList<String>();
                    for(int i = 0;i<n;i++)
                        {
                            String p = sc.next();
                            arr.add(p);
                        }
                    String line = sc.next();
                    Sol obj = new Sol();  
                    System.out.println(obj.wordBreak(line,arr));  
                    
                }
        }
}
// } Driver Code Ends


//User function Template for Java

class Sol
{
    public static int wordBreak(String str, ArrayList<String> dict )
    {
        Boolean[] dp=new Boolean[str.length()];
        return f(str,0,dict,dp)?1:0;
    }
    
    public static boolean f(String str,int si,ArrayList<String> dict,Boolean[] dp){
        
        // if(si==str.length()) return 1;
        // if(dict.contains(str.substring(si))) return 1;
        boolean ans=false;
        for(int i=si;i<str.length();i++){
            if(dict.contains(str.substring(si,i+1))){
                if(i+1==str.length()) return true;
                if(dp[i+1]==null){
                    dp[i+1]=f(str,i+1,dict,dp);
                }
                ans|=dp[i+1];
            }
        }
        
        return ans;
    }
    
    
    
}