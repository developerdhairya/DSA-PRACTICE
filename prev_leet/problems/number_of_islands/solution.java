class Solution {
    public int numIslands(char[][] grid) {
        int m=grid.length,n=grid[0].length;
        boolean[][] visited=new boolean[m][n];
        int output=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(!visited[i][j] && grid[i][j]!='0'){
                    output+=dfs(grid,visited,i,j)+1;
                }
            }
        }
        return output;
        
    }
    
    public int dfs(char[][] grid,boolean[][] visited,int i,int j){
        int m=grid.length,n=grid[0].length;
        if(i<0 || i>=m || j<0 || j>=n || visited[i][j] || grid[i][j]=='0'){
            return 0;
        }
        visited[i][j]=true;
        int c1=dfs(grid,visited,i+1,j);
        int c2=dfs(grid,visited,i-1,j);
        int c3=dfs(grid,visited,i,j+1);
        int c4=dfs(grid,visited,i,j-1);
        return c1+c2+c3+c4;
    }
}