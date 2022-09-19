class Solution {
    public int maxSubArray(int[] arr) {
        int n=arr.length;
        int sum=Integer.MIN_VALUE;
        int csum=0;
        for(int i=0;i<n;i++){
            if(arr[i]+csum>arr[i]){
                csum+=arr[i];
            }else{
                csum=arr[i];
            }
            sum=Math.max(sum,csum);
        }
            return sum;
        
    }
}