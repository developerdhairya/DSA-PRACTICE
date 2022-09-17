class Solution {
    public int[] singleNumber(int[] arr) {
        int n=arr.length;
		int xor=0;
		for(int ele:arr){
			xor^=ele;
		}
		int mask=xor&(~(xor-1));
		int o1=0;
		int o2=0;
		for(int ele:arr){
			if((ele&mask)==0){
				o1^=ele;
			}else{
				o2^=ele;
			}}
        int[] res=new int[2];
        res[0]=Math.min(o1,o2);
        res[1]=Math.max(o1,o2);
		return res;
    }
}