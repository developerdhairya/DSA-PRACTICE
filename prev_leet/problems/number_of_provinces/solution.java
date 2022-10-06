class Solution {
    public int findCircleNum(int[][] mat) {
        int v=mat.length;
        ArrayList<Integer>[] graph=new ArrayList[v];
        for(int i=0;i<v;i++){
            graph[i]=new ArrayList<Integer>();
        }
        for(int row=0;row<v;row++){
            for(int col=0;col<mat[0].length;col++){
                if(mat[row][col]==1 && row!=col){
                    graph[row].add(col);
                    graph[col].add(row);
                }
            }
        }
        
        boolean[] visited=new boolean[v];
        int ans=0;
        
        for(int i=0;i<v;i++){
            if(!visited[i]){
                ans++;
                dfs(graph,i,visited);
            }
        }
        return ans;
    }
    
    public void dfs(ArrayList<Integer>[] graph,int start,boolean[] visited){
        visited[start]=true;
        ArrayList<Integer> list=graph[start];
        for(int i=0;i<list.size();i++){
            if(!visited[list.get(i)]){
                dfs(graph,list.get(i),visited);
            }
        }
    }
}