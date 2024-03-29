class Solution {
    public boolean isBipartite(int[][] adjList) {
        int V=adjList.length;
        int[] colored=new int[V];
        Arrays.fill(colored,-1);
        boolean ans=true;
        for(int i=0;i<adjList.length;i++){
            if(colored[i]==-1){
                ans&=canColor(adjList,colored,i,0);
            }
            if(!ans){
                return false;
            }
        }
        return true;
    }
    
    public boolean canColor(int[][] adjList,int[] colored,int v,int c){

        
        if(colored[v]==c){
            return true;
        }
        
        if(colored[v]==1-c){
            return false;
        }
        colored[v]=c;
        boolean output=true;
        
        
        for(int j=0;j<adjList[v].length;j++){
            output&=canColor(adjList,colored,adjList[v][j],1-c);
            if(!output){
                return false;
            }
        }
        
        return output;
        
    }}