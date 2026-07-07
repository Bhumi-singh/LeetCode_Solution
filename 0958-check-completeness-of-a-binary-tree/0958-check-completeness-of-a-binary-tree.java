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
    public boolean isCompleteTree(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<TreeNode>();
        q.add(root);
        TreeNode prev=root;
        while(!q.isEmpty()){
            TreeNode curr=q.remove();
            if(curr!=null){
                if(prev==null) return false;
                q.add(curr.left);
                q.add(curr.right);
            }
            prev=curr;
        }
        return true;
    }
}