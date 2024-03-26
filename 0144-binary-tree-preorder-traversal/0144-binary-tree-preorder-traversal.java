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
        //creating a list to store the values ;
        List<Integer> list = new ArrayList<>();
        preorderTraversal(root, list);
        return list;
    }

  private void preorderTraversal(TreeNode root, List<Integer> list) {
    if (root == null) return;
    list.add(root.val);
    preorderTraversal(root.left, list);
    preorderTraversal(root.right, list);
  }
}