class Solution {
    public int change(int sum, int[] arr) {
        int[] tab=new int[sum+1];
        tab[0]=1;
        for(int ele:arr){
            for(int i=ele;i<sum+1;i++){
                tab[i]+=tab[i-ele];
            }
        }
        return tab[sum];
    }
}