class Solution {
    public int subarraySum(int[] arr, int k) {
        Map<Integer,Integer> map=new HashMap<>();
        int output=0;
        int p_sum=0;
        for(int ele:arr){
            p_sum+=ele;;
            if(p_sum==k){
                output++;
            }
            if(map.containsKey(p_sum-k)){
                output+=map.get(p_sum-k);
            }
            if(map.containsKey(p_sum)){
                map.put(p_sum,map.get(p_sum)+1);
            }else{
                map.put(p_sum,1);
            }
        }
        return output;
    }
}