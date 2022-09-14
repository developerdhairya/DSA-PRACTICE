class Solution {
    public int maxProfit(int[] arr) {
        int n=arr.length;
        if(n==1){
            return 0;
        }

        boolean hold=false;
        int cp=0;
        int profit=0;
        int i=0;
        while(i<n){
            if(i==0 && arr[0]<arr[1]){
                cp=arr[0];
                hold=true;
            }else if(i==n-1){
                if(hold){
                    profit+=arr[i]-cp;
                    hold=false;
                }
            }else if(arr[i]<arr[i+1] && !hold){
                cp=arr[i];
                hold=true;
            }else if(arr[i]>arr[i+1] && hold){
                profit+=arr[i]-cp;
                hold=false;
            }
            i++;
        }
        return profit;
    }
}