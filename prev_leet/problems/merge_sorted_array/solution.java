class Solution {
    public void merge(int[] arr1, int n, int[] arr2, int m) {
        
        int i,j,nextIndx=0;
        i=0;
        j=0;
        
        int[] output=new int[m+n];
        
        while(i<n && j<m){
            if(arr1[i]<arr2[j]){
                output[nextIndx++]=arr1[i++];
            }else{
                output[nextIndx++]=arr2[j++];
            }
        }
        
        while(i<n){
            output[nextIndx++]=arr1[i++];
        }
                
        while(j<m){
            output[nextIndx++]=arr2[j++];
        }
        
        for(int k=0;k<output.length;k++){
            arr1[k]=output[k];
        }
        
    }
}