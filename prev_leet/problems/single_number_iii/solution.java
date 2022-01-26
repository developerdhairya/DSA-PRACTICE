class Solution {
    public int[] singleNumber(int[] arr) {
        int N=arr.length;
        int[] output_arr=new int[2];
        
        int xor_arr=0;
        
        for(int i=0;i<=N-1;i++){
            xor_arr^=arr[i];
        }
        
        int lowest_on_bit=xor_arr&(-xor_arr);
        
        for(int i=0;i<=N-1;i++){
            if((arr[i] & lowest_on_bit)==0){
                output_arr[0]^=arr[i];
            }else{
                output_arr[1]^=arr[i];
            }
        }
        
        return output_arr;
        
    }
}