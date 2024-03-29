//{ Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;

class DriverClass
{
    public static void main(String args[]) throws IOException {

        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String str[] = read.readLine().trim().split(" ");
            int V = Integer.parseInt(str[0]);
            int E = Integer.parseInt(str[1]);
    
            ArrayList<ArrayList<ArrayList<Integer>>> adj = new ArrayList<ArrayList<ArrayList<Integer>>>();
            for(int i=0;i<V;i++)
            {
                adj.add(new ArrayList<ArrayList<Integer>>());
            }
            
            int i=0;
            while (i++<E) {
                String S[] = read.readLine().trim().split(" ");
                int u = Integer.parseInt(S[0]);
                int v = Integer.parseInt(S[1]);
                int w = Integer.parseInt(S[2]);
                ArrayList<Integer> t1 = new ArrayList<Integer>();
                ArrayList<Integer> t2 = new ArrayList<Integer>();
                t1.add(v);
                t1.add(w);
                t2.add(u);
                t2.add(w);
                adj.get(u).add(t1);
                adj.get(v).add(t2);
            }
            
            Solution ob = new Solution();
            
            System.out.println(ob.spanningTree(V, adj));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution
{
    
    static class Unit implements Comparable<Unit>{
        int v;
        int pw;
        Unit(int v,int pw){
            this.v=v;
            this.pw=pw;
        }
        @Override
        public int compareTo(Unit u){
            return this.pw-u.pw;
        }
    }
    //Function to find sum of weights of edges of the Minimum Spanning Tree.
    static int spanningTree(int V, ArrayList<ArrayList<ArrayList<Integer>>> adj) 
    {
        int out=0;
        boolean[] visited=new boolean[V];
        PriorityQueue<Unit> pq=new PriorityQueue<>();
        pq.add(new Unit(0,0));
        while(!pq.isEmpty()){
            //remove
            Unit front=pq.remove();
            // check
            if(visited[front.v]) continue;
            //mark
            visited[front.v]=true;
            //operate
            out+=front.pw;
            
            for(ArrayList<Integer> pair:adj.get(front.v)){
                int vertex=pair.get(0);
                int pWeight=pair.get(1);
                if(visited[vertex]) continue;
                pq.add(new Unit(vertex,pWeight));
            }
        }
        return out;
        
    }
}
