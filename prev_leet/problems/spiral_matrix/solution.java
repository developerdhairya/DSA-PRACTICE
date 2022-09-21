class Solution {
    public List<Integer> spiralOrder(int[][] mat) {
        int m=mat.length;
        int n=mat[0].length;
        int total=m*n;
        int row=0,col=0;
        int minR=0,minC=0,maxR=m-1,maxC=n-1;
        ArrayList<Integer> list=new ArrayList<Integer>();
        while(total>0){
            // top row
            while(col<=maxC && total>0){
                list.add(mat[row][col++]);
                total--;
            }
            minR++;
            row++;
            col--;
            
            //right col
            while(row<=maxR && total>0){
                list.add(mat[row++][col]);
                total--;
            }
            maxC--;
            col--;
            row--;
            
            //bottom row
            while(col>=minC && total>0){
                list.add(mat[row][col--]);
                total--;
            }
            maxR--;
            row--;
            col++;
            
            //left col
            while(row>=minR && total>0){
                list.add(mat[row--][col]);
                total--;
            }
            minC++;
            col++;
            row++;
            
            
        }
        return list;
    }
}