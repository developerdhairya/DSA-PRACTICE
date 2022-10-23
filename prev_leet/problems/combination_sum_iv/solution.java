class Solution {
    //coin change permutation
    public int combinationSum4(int[] nums, int sum) {
        int[] tab=new int[sum+1];
        tab[0]=1;
        for(int i=0;i<sum+1;i++){
            for(int ele:nums){
                if(i-ele>=0)
                    tab[i]+=tab[i-ele];
            }
        }
        return tab[sum];
    }
}