class Solution {
    public List<Integer> findDisappearedNumbers(int[] arr) {
        List<Integer> output_arr=new ArrayList<Integer>();
        
        for(int i=0;i<arr.length;i++){
            int ele=Math.abs(arr[i]);
            int secIndex=ele-1;
            if(arr[secIndex]>0){
                arr[secIndex]=-arr[secIndex];
            }
        }
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0){
                output_arr.add(i+1);
            }
        }
        
        return output_arr;
    }
}


