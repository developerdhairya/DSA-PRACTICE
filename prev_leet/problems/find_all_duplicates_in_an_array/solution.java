class Solution {
    public List<Integer> findDuplicates(int[] arr) {
        List<Integer> output_arr=new ArrayList<Integer>();
        for(int i=0;i<arr.length;i++){
            int ele=Math.abs(arr[i]);
            int signIndex=ele-1;
            if(arr[signIndex]>0){
                arr[signIndex]=-arr[signIndex];
            }else{
                output_arr.add(ele);
            }
        }
        return output_arr;
    }
}

