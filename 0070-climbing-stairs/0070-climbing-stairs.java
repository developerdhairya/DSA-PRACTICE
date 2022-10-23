class Solution {
    public int climbStairs(int n) {
        int[] tab=new int[n+1];
        tab[n]=1;
        for(int i=n;i>=0;i--){
            if(i+1<=n){
                tab[i]+=tab[i+1];
            }
            if(i+2<=n){
                tab[i]+=tab[i+2];
            }
        }
        return tab[0];
    }
}