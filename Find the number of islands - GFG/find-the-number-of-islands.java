//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            String[] s = br.readLine().trim().split(" ");
            int n = Integer.parseInt(s[0]);
            int m = Integer.parseInt(s[1]);
            char[][] grid = new char[n][m];
            for (int i = 0; i < n; i++) {
                String[] S = br.readLine().trim().split(" ");
                for (int j = 0; j < m; j++) {
                    grid[i][j] = S[j].charAt(0);
                }
            }
            Solution obj = new Solution();
            int ans = obj.numIslands(grid);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


class Solution {
    // Function to find the number of islands.
    public int numIslands(char[][] grid) {
        boolean[][] visited=new boolean[grid.length][grid[0].length];
        int out=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(!visited[i][j] && grid[i][j]=='1'){
                    out+=1;
                    visit(grid,i,j,visited);
                }
            }
        }
        return out;
    }
    
    public void visit(char[][] grid,int i,int j,boolean[][] visited){
        if(i<0 || j<0 || i>=grid.length || j>=grid[0].length){
            return;
        }
        if(grid[i][j]=='0' || visited[i][j]){
            return;
        }
        visited[i][j]=true;
        visit(grid,i-1,j,visited);
        visit(grid,i+1,j,visited);
        visit(grid,i,j-1,visited);
        visit(grid,i,j+1,visited);
        visit(grid,i-1,j+1,visited);
        visit(grid,i-1,j-1,visited);
        visit(grid,i+1,j-1,visited);
        visit(grid,i+1,j+1,visited);
    }
    
    
}