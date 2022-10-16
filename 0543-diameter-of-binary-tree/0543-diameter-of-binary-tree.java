/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int diameterOfBinaryTree(TreeNode root) {
        int[] output=new int[1];
        height(root,output);
        return output[0];
    }
    public int height(TreeNode root,int[] output){
        if(root==null){
            return 0;
        }        
        int l=height(root.left,output);
        int r=height(root.right,output);
        output[0]=Math.max(output[0],l+r);
        return Math.max(l,r)+1;
    }
}