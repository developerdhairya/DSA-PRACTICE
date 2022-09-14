class Solution {
    public int maxSubArray(int[] arr) {
        int n=arr.length;
        int i=1;
        int csum=arr[0];
        int sum=csum;

        while(i<n){
            if(arr[i]>arr[i]+csum){
                csum=arr[i];
            }else{
                csum+=arr[i];
            }
            sum=Math.max(sum,csum);
            i++;
        }
        return sum;
    }
}