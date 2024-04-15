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
    int sum =0;
    public int sumNumbers(TreeNode root) {
        getSumOfLeaf(root, 0);
        return sum; 
    }
    public void getSumOfLeaf(TreeNode root, int curNum){
        if(root == null){
            return; 
        }
        //form the num 
        curNum = curNum*10 + root.val;
        if(root.left==null && root.right == null){
            sum+=curNum;
            return;
        }
        //left call
        getSumOfLeaf(root.left, curNum); 
        //right call
        getSumOfLeaf(root.right, curNum);

    }
}

