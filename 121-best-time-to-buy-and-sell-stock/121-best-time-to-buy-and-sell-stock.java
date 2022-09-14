class Solution {
    public int maxProfit(int[] arr) {
        int n=arr.length;
        int profit=0;
        int min=arr[0];

        int i=1;
        while(i<n){
            if(arr[i]<min){
                min=arr[i];
            }else{
                profit=Math.max(profit,arr[i]-min);
            }
            i++;
        }

        return profit;
    }
}