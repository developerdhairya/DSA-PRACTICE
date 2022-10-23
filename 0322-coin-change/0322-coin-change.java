class Solution {
    public int coinChange(int[] coins, int change) {
        int[] tab=new int[change+1];
        Arrays.fill(tab,Integer.MAX_VALUE);
        tab[0]=0;
        for(int ele:coins){
            for(int i=ele;i<change+1;i++){
                if(i-ele>=0 && tab[i-ele]<Integer.MAX_VALUE)
                    tab[i]=Math.min(tab[i],tab[i-ele]+1);
            }
        }
        return tab[change]==Integer.MAX_VALUE?-1:tab[change];
    }
}