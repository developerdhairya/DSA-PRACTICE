class Solution {
    public int singleNumber(int[] arr) {
        int N=arr.length;
        Arrays.sort(arr);
        if(N==1) return arr[0];
        for(int i=1;i<=N-2;i++){
            if(arr[i-1]!=arr[i] && arr[i+1]!=arr[i]){
                return arr[i];
            }
        }
        if(arr[0]!=arr[1]){
            return arr[0];
        }
        if(arr[N-1]!=arr[N-2]){
            return arr[N-1];
        }
        return-1;
    }
}