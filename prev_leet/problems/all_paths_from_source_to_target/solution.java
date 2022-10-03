class Solution {
    
    List<List<Integer>> output=new ArrayList<>();
    boolean[] visited; // To detect cycle
    
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        visited=new boolean[graph.length];
        helper(graph,0,graph.length-1,new ArrayList<Integer>());
        return output;
    }
    
    public void helper(int[][] graph,int source,int dest,ArrayList<Integer> result){
        
        result.add(source);
        visited[source]=true;
        
        if(source==dest){
            output.add(new ArrayList<>(result));
            return;
        }
        
        int[] arr=graph[source];
        
        for(int nbr:arr){
            if(visited[nbr]){
                continue;
            }
            helper(graph,nbr,dest,result);
            result.remove(result.size()-1);
            visited[nbr]=false;
        }
        
        
        
        
        
    }
}