//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            int[] nums = new int[n];
            String[] S = br.readLine().trim().split(" ");
            for(int i = 0; i < n; i++){
                nums[i] = Integer.parseInt(S[i]);
            }
            Solution obj = new Solution();
            int[] ans = obj.sortedArrayToBST(nums);
            for(int i = 0; i < ans.length; i++)
                System.out.print(ans[i] + " ");
            System.out.println();
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    
    class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
        }
    }
    
    int[] output;
    int c=0;
    
    public int[] sortedArrayToBST(int[] nums)
    {
        Node root=constructFromInorderHelper(nums,0,nums.length-1);
        output=new int[nums.length];
        // Queue<Node> queue=new ArrayDeque<>();
        // queue.add(root);
        // while(!queue.isEmpty()){
        //     Node front=queue.remove();
        //     output[c++]=front.data;
        //     if(front.left!=null) queue.add(front.left);
        //     if(front.right!=null) queue.add(front.right);
        // }
        preOrder(root);
        return output;
    }
    
    void preOrder(Node node) {
        if (node == null) {
            return;
        }
        output[c++]=node.data;
        preOrder(node.left);
        preOrder(node.right);
    }
    
    
    private Node constructFromInorderHelper(int[] arr,int si,int ei){
        if(si>ei) return null;
        int mid=(si+ei)/2;
        Node out=new Node(arr[mid]);
        out.left=constructFromInorderHelper(arr, si, mid-1);
        out.right=constructFromInorderHelper(arr, mid+1, ei);
        return out;
    }
    
    
}