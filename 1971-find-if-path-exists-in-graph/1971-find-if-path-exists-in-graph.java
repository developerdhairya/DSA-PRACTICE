class Solution {
    static boolean[] visited;
    public boolean validPath(int vcount, int[][] edges, int source, int dest) {
        visited=new boolean[vcount];
        
        int ecount=edges.length;
        // building graph
        ArrayList<Edge>[] graph=new ArrayList[vcount];
        for(int i=0;i<vcount;i++){
            graph[i]=new ArrayList<>();
        }
        for(int[] arr:edges){
            int src=arr[0];
            int nbr=arr[1];
            int wt=0;
            graph[src].add(new Edge(src,nbr,wt));
            graph[nbr].add(new Edge(nbr,src,wt));
        }
        
        //solution
        return hasPath(graph,source,dest);
        
    }
    
    public boolean hasPath(ArrayList<Edge>[] graph,int source,int dest){
         if(source==dest){
             return true;
         }
        if(visited[source]){
            return false;
        }else{
            visited[source]=true;
        }
        
        
        for(Edge edge:graph[source]){
            if(hasPath(graph,edge.nbr,dest)){
                return true;
            }
        }
        
        return false;
    }
    
    
}

class Edge{
    int src;
    int nbr;
    int wt;
    Edge(int src,int nbr,int wt){
        this.src=src;
        this.nbr=nbr;
        this.wt=wt;
    }
}

