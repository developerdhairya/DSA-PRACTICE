class Solution {
    public int longestConsecutive(int[] arr) {
        int n=arr.length;
        Set<Integer> set=new HashSet<>();
        int output=0;
        for(int ele:arr){
            set.add(ele);
        }
        for(int i=0;i<n;i++){
            int ele=arr[i];
            if(set.contains(ele-1))
                continue;
            int count=1;
            while(set.contains(ele+count)){
                count++;
            }
            output=Math.max(output,count);
        }
        return output;
    }
}