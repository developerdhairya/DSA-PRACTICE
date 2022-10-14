class Solution {
    public int largestRectangleArea(int[] arr) {
        int output=Integer.MIN_VALUE;
        int[] nseR=nseR(arr);
        int[] nseL=nseL(arr);
        for(int i=0;i<arr.length;i++){
            output=Math.max(output,Math.abs(nseR[i]-nseL[i]-1)*arr[i]);
        }
        return output;
    }
    
    
    
    public int[] nseR(int[] arr){
        int n=arr.length;
        int[] output=new int[n];
        Stack<Integer> stack=new Stack<>();
        for(int i=n-1;i>=0;i--){
            while(!stack.isEmpty() && arr[stack.peek()]>=arr[i]){
                stack.pop();
            }
            output[i]=stack.isEmpty()?n:stack.peek();
            stack.push(i);
        }
        return output;
    }
    
    public int[] nseL(int[] arr){
       int n=   arr.length;
        int[] output=new int[n];
        Stack<Integer> stack=new Stack<>();
        for(int i=0;i<n;i++){
            while(!stack.isEmpty() && arr[stack.peek()]>=arr[i]){
                stack.pop();
            }
            output[i]=stack.isEmpty()?-1:stack.peek();
            stack.push(i);
        }
        return output;
    }
    
}