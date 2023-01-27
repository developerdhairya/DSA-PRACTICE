//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String[] S = br.readLine().trim().split(" ");
            int V = Integer.parseInt(S[0]);
            int E = Integer.parseInt(S[1]);
            ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
            for(int i = 0; i < V; i++){
                adj.add(new ArrayList<Integer>());
            }
            for(int i = 0; i < E; i++){
                String[] s = br.readLine().trim().split(" ");
                int u = Integer.parseInt(s[0]);
                int v = Integer.parseInt(s[1]);
                adj.get(u).add(v);
                adj.get(v).add(u);
            }
            Solution obj = new Solution();
            boolean ans = obj.isBipartite(V, adj);
            if(ans)
                System.out.println("1");
            else System.out.println("0");
       }
    }
}
// } Driver Code Ends


class Solution
{
    
    class Unit{
        int val;
        int color;
        Unit(int val,int color){
            this.val=val;
            this.color=color;
        }
        
    }
    
    
    public boolean isBipartite(int V, ArrayList<ArrayList<Integer>>adj)
    {
        Queue<Unit> q=new ArrayDeque<>();
        int[] visited=new int[V];
        
        boolean out=true;
        for(int i=0;i<V;i++){
            if(visited[i]!=0) continue;
            q.add(new Unit(i,-1));
            while(!q.isEmpty()){
                Unit front=q.remove();
                int f=front.val;
                int color=front.color;
                if(visited[f]==-1*color){
                    out=false;
                    continue;
                }
                if(visited[f]==color) continue;
                visited[f]=color;
                for(int ele:adj.get(f)){
                    q.add(new Unit(ele,-1*color));
                }
            }
        }
        return out;
    }
}