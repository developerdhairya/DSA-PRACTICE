class Solution {
    public int missingNumber(int[] nums) {
        int N=nums.length;
        int sum=N*(N+1)/2;
        int numsSum=0;
        for(int i=0;i<nums.length;i++){
            numsSum+=nums[i];
        }
        return sum-numsSum;
    }
}