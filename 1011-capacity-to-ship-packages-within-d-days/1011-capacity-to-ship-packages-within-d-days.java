class Solution {
    
    public static int countSt(int[] arr,int N,int M,int mid){
        int output=1;
        int currsum=0;
        for(int ele:arr){
            if(ele>mid){
                return Integer.MAX_VALUE;
            }
            currsum+=ele;
            if(currsum>mid){
                currsum=ele;
                output++;
            }
        }
        return output;
    }
    
    public int shipWithinDays(int[] arr, int M) {
        int N=arr.length;
        if(N<M){
            return -1;
        }
        
        int start=0;
        int end=0;
        for(int ele:arr){
            end+=ele;
        }
        int result=0;
        while(start<=end){
            int mid=start+(end-start)/2;
            int stCount=countSt(arr,N,M,mid);
            if(stCount<=M){
                result=mid;
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return result;
    }
}