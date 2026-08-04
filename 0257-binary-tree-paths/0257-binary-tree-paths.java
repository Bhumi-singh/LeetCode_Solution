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
    public List<String> binaryTreePaths(TreeNode root) {
        ArrayList<String> ans=new ArrayList<>();
        dfs(root,"",ans);
        return ans;
    }
    private void dfs(TreeNode root,String path,ArrayList<String> ans){
        if(root==null) return;
        path+=root.val;
        if(root.left==null && root.right==null){
            ans.add(path);
        }
        path+="->";
        dfs(root.left,path,ans);
        dfs(root.right,path,ans);
    }
}