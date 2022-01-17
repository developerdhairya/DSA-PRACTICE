class Solution {
    public int[] singleNumber(int[] arr) {
        Arrays.sort(arr);
        int[] output_arr=new int[2];
        int p=0;
        for(int i=0;i<arr.length;i++){
            if(i!=arr.length-1 && arr[i]==arr[i+1]){
                i++;
            }else{
                output_arr[p]=arr[i];
                p++;
                if(p==2){
                    break;
                }
            }
        }
        return output_arr;
    }
}


// 1,1,2,2,3,5