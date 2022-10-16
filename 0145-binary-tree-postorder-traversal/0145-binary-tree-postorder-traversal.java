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
        if(root==null){
            return new ArrayList<>();
        }
        List<Integer> output=new ArrayList<>();
        output.addAll(postorderTraversal(root.left));
        output.addAll(postorderTraversal(root.right));
        output.add(root.val);
        
        return output;
    }
}