class Solution {
    
    List<List<Integer>> output=new ArrayList<>();
    // boolean[] visited;
    
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        // visted=new boolean[graph.length];
        helper(graph,0,graph.length-1,new ArrayList<Integer>());
        return output;
    }
    
    public void helper(int[][] graph,int source,int dest,ArrayList<Integer> result){
        
        result.add(source);
        
        if(source==dest){
            output.add(new ArrayList<>(result));
            return;
        }
        
        int[] arr=graph[source];
        
        for(int ele:arr){
            helper(graph,ele,dest,result);
            result.remove(result.size()-1);
        }
        
        
    }
}