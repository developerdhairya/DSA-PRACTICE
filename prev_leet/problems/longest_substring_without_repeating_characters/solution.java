class Solution {
    //optimized sliding window
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        int output=0;
        int i=0,j=0;
        while(j<s.length() && i<s.length()){
            char c=s.charAt(j);
            if(map.containsKey(c) && map.get(c)>=i){
                i=map.get(c)+1;
            }
            output=Math.max(output,j-i+1);
            map.put(c,j);
            j++;
        }
        return output;
    }
}