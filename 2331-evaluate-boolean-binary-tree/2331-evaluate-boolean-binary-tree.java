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

// Inorder -> 
// preorder ->
// postorder -> 


class Solution {
    public boolean evaluateTree(TreeNode root) {
        Stack<TreeNode> st = new Stack<>();
        st.push(root);
        HashMap<TreeNode, Boolean> evaluated = new HashMap<>();

        while (!st.isEmpty()) {
            TreeNode topNode = st.peek();

            // If the node is a leaf node, store its value in the evaluated hashmap
            // and continue
            if (topNode.left == null && topNode.right == null) {
                st.pop();
                evaluated.put(topNode, topNode.val == 1);
                continue;
            }

            // If both the children have already been evaluated, use their
            // values to evaluate the current node.
            if (evaluated.containsKey(topNode.left) &&
                evaluated.containsKey(topNode.right)) {
                st.pop();
                if (topNode.val == 2) {
                    evaluated.put(topNode,
                            evaluated.get(topNode.left) || evaluated.get(topNode.right));
                } else {
                    evaluated.put(topNode,
                            evaluated.get(topNode.left) && evaluated.get(topNode.right));
                }
            } else {
                // If both the children are not leaf nodes, push the current
                // node along with its left and right child back into the stack.
                st.push(topNode.right);
                st.push(topNode.left);
            }
        }
        
        return evaluated.get(root);
    }
}