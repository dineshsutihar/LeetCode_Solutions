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
    public TreeNode removeLeafNodes(TreeNode root, int target) {
        Stack<TreeNode> stack = new Stack<>();
        TreeNode currentNode = root, lastRightNode = null;

        while (!stack.isEmpty() || currentNode != null) {
            while (currentNode != null) {
                stack.push(currentNode);
                currentNode = currentNode.left;
            }

            currentNode = stack.peek();

            if (currentNode.right != lastRightNode && currentNode.right != null) {
                currentNode = currentNode.right;
                continue; 
            }

            stack.pop();

            if (currentNode.right == null && currentNode.left == null && currentNode.val == target) {
                // If the stack is empty after popping, it means the root was a target leaf node.
                if (stack.isEmpty()) {
                    return null; // The tree becomes empty as the root itself is removed.
                }
                
                // Identify the parent of the current node.
                TreeNode parent = stack.isEmpty() ? null : stack.peek();

                // Disconnect the current node from its parent.
                if (parent != null) {
                    if (parent.left == currentNode) {
                        parent.left = null; // If current is a left child, set the left pointer to null.
                    } else {
                        parent.right = null; // If current is a right child, set the right pointer to null.
                    }
                }
            }

            // Mark this node as visited by setting 'lastRightNode' to 'currentNode' before moving to the next iteration.
            lastRightNode = currentNode;
            // Reset 'currentNode' to null to ensure the next node from the stack is processed.
            currentNode = null;
        }
        return root; // Return the modified tree.
    }
}