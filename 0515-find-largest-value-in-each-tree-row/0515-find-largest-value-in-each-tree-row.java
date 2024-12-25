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
import java.util.*;

class Solution {
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        if (root == null) return ans; // If the tree is empty, return an empty list.
        
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root); // Start with the root node.
        
        while (!queue.isEmpty()) {
            int size = queue.size(); // Number of nodes at the current level.
            int maxVal = Integer.MIN_VALUE; // Initialize the maximum value for this level.
            
            for (int i = 0; i < size; i++) {
                TreeNode current = queue.poll();
                maxVal = Math.max(maxVal, current.val); // Update the maximum value.
                
                // Add child nodes to the queue for the next level.
                if (current.left != null) queue.add(current.left);
                if (current.right != null) queue.add(current.right);
            }
            
            ans.add(maxVal); // Add the maximum value of this level to the answer.
        }
        
        return ans;
    }
}
