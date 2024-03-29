class Solution {
    public int maxSum(int[] arr1, int[] arr2) {
        int n=arr1.length;
        int m=arr2.length;
        long sum1=0;
        long sum2=0;
        long output=0;
        int i=0;
        int j=0;

        while(i<n && j<m){
            if(arr1[i]<arr2[j]){
                sum1+=arr1[i++];
            }else if(arr1[i]>arr2[j]){
                sum2+=arr2[j++];
            }else{
                output+=Math.max(sum1,sum2)+arr1[i];
                sum1=0;
                sum2=0;
                i++;
                j++;
            }
        }

        while(i<n){
            sum1+=arr1[i++];
        }

        while(j<m){
            sum2+=arr2[j++];
        }

        output+=Math.max(sum1,sum2);

        int fo=(int)(output % 1000000007);

        return fo;
    }
}