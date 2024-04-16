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
    public void dfs(TreeNode node, int val, int depth, int curDepth) {
        if (node == null) {
            return;
        }

        if (curDepth < depth - 1) {
            dfs(node.left, val, depth, curDepth + 1);
            dfs(node.right, val, depth, curDepth + 1);
        }

        if (curDepth == depth - 1) {
            // Create new nodes and insert them at the specified depth
            TreeNode exLeft = node.left;
            TreeNode exRight = node.right;
            TreeNode newLeft = new TreeNode(val);
            TreeNode newRight = new TreeNode(val);

            node.left = newLeft;
            newLeft.left = exLeft;

            node.right = newRight;
            newRight.right = exRight;
        }
    }

    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        if (depth == 1) {
            // If depth is 1, create a new root node and attach the original root as its left child
            TreeNode newNode = new TreeNode(val);
            newNode.left = root;
            return newNode;
        }

        // Call DFS helper function to add the row of nodes
        dfs(root, val, depth, 1);
        return root;
    }
    }