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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> output=new ArrayList<>();
        TreeNode curr=root;
        while(curr!=null){
            TreeNode pre=curr.left;
            if(pre==null){
                output.add(curr.val);
                curr=curr.right;
                continue;
            }
            while(pre.right!=null && pre.right!=curr){
                pre=pre.right;
            }
            if(pre.right==null){
                output.add(curr.val);
                pre.right=curr;
                curr=curr.left;
            }else if(pre.right==curr){
                pre.right=null;
                curr=curr.right;
            }
            
        }
        return output;
    }
}