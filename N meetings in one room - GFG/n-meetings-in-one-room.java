//{ Driver Code Starts
import java.io.*;
import java.util.*;
import java.lang.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());

        while (t-- > 0) {
            String inputLine[] = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);

            int start[] = new int[n];
            int end[] = new int[n];

            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++)
                start[i] = Integer.parseInt(inputLine[i]);

            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) 
                end[i] = Integer.parseInt(inputLine[i]);
                
            int ans = new Solution().maxMeetings(start, end, n);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


class Solution 
{
    
    static class Unit implements Comparable<Unit>{
        int start;
        int end;
        
        Unit(int start,int end){
            this.start=start;
            this.end=end;
        }
        
        @Override
        public int compareTo(Unit u){
            return this.end-u.end;
        }
        
    }
    
    public static int maxMeetings(int start[], int end[], int n)
    {
        ArrayList<Unit> list=new ArrayList<>();
        for(int i=0;i<start.length;i++){
            list.add(new Unit(start[i],end[i]));
        }
        Collections.sort(list);
        Unit prev=list.get(0);
        int out=1;
        for(int i=1;i<list.size();i++){
            Unit ele=list.get(i);
            if(ele.start>prev.end){
                out++;
                prev=ele;
            }
        }
        return out;
    }
}
