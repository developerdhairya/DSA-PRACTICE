class Solution {
    public int[] twoSum(int[] arr, int k) {
        int n=arr.length;
        Map<Integer,Integer> map=new HashMap<>(); //<ele,index>
        for(int i=0;i<n;i++){
            int ele=arr[i];
            if(map.containsKey(k-ele)){
                int[] output=new int[2];
                output[0]=map.get(k-ele);
                output[1]=i;
                return output;
            }
            if(!map.containsKey(ele)){
                map.put(ele,i);
            }
        }
        return null;
    }
}