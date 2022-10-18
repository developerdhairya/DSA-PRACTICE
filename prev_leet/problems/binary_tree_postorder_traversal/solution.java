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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> output=new ArrayList<>();
        TreeNode curr=root;
        while(curr!=null){
            TreeNode pre=curr.right;
            if(pre==null){
                output.add(curr.val);
                curr=curr.left;
                continue;
            }
            while(pre.left!=null && pre.left!=curr){
                pre=pre.left;
            }
            if(pre.left==null){
                output.add(curr.val);

                pre.left=curr;
                curr=curr.right;
            }else if(pre.left==curr){
                pre.left=null;
                curr=curr.left;
            }
        }
        Collections.reverse(output);
        return output;
    }
}