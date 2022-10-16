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
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> queue=new ArrayDeque<>();
        
        List<List<Integer>> output=new ArrayList<>();
        if(root!=null)
            queue.add(root);
        
        while(!queue.isEmpty()){
            int n=queue.size();
            ArrayList<Integer> list=new ArrayList<>();
            for(int i=0;i<n;i++){
                TreeNode front=queue.remove();
                list.add(front.val);
                if(front.left!=null){
                    queue.add(front.left);
                }
                if(front.right!=null){
                    queue.add(front.right);
                }
            }
            output.add(list);
        }
        return output;
    }
}