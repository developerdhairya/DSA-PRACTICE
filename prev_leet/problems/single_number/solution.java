class Solution {
    public int singleNumber(int[] nums) {
        int out=0;
        for(int ele:nums){
            out^=ele;
        }
        return out;
    }
}