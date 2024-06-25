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
    private int sum = 0;
    
    public TreeNode bstToGst(TreeNode root) {
        inOrder(root);
        return root; 
    }
    
    private void inOrder(TreeNode root){
        if (root == null) {
            return;
        }
        inOrder(root.right);
        sum += root.val;
        root.val = sum;
        inOrder(root.left);
    }
}
