class Solution {
    public int findDuplicate(int[] arr) {
        int N=arr.length;
        int ele;
        int secIndex;
        
        for(int i=0;i<=N-1;i++){
            
            ele=Math.abs(arr[i]);
            secIndex=ele-1;
            
            if(arr[secIndex]>0){
                arr[secIndex]=-arr[secIndex];
            }else{
                return ele;
            }
            
        }
        return -1;
        
    }
}