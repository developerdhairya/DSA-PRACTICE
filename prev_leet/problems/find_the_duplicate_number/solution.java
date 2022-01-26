class Solution {
    public int findDuplicate(int[] arr) {
        int N=arr.length;
        for(int i=0;i<=N-1;i++){
            int ele=Math.abs(arr[i]);
            if(arr[ele-1]<0){
                return ele;
            }else{
                arr[ele-1]=-arr[ele-1];
            }
        }
        return -1;
        
    }
}