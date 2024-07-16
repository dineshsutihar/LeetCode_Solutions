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
//     public TreeNode lca(TreeNode root, int p, int q){
//         if(root==null || root.val ==p || root.val ==q ){
//             return root; 
            
//         }
//         TreeNode left = lca(root.left, p, q);
//         TreeNode right = lca(root.right, p, q);
//         if(left == null){
//             return right; 
//         }else if(right == null){
//             return left;
//         }else{
//             return root; 
//         }
//     }
    
    public boolean findPath(TreeNode root, int target,  StringBuilder path){
        if(root == null){
            return false; 
        }
        if(root.val == target){
            return true;
        }
        
        path.append('L');
        if(findPath(root.left, target, path)){
            return true; 
        }
        
        //backtracking 
        path.setLength(path.length()-1);
        path.append('R');
        if(findPath(root.right, target, path)){
            return true; 
        }
        //backtracking
        path.setLength(path.length()-1);
        
        return false; 
        
    }
    public String getDirections(TreeNode root, int startValue, int destValue) {
        // TreeNode lca = lca(root, startValue, destValue);
        StringBuilder sourceLca = new StringBuilder();
        StringBuilder lcaDest = new StringBuilder();
        findPath(root, startValue, sourceLca);        
        findPath(root, destValue, lcaDest);
    
        int p1 = 0; 
        int p2 = 0; 
        while(p1< sourceLca.length() && p2<lcaDest.length()){
            if(sourceLca.charAt(p1) == lcaDest.charAt(p2)){
                p1++; 
                p2++;
            }else{
                break;
            }
        }
        
        StringBuilder res = new StringBuilder();
        for(int i =p1; i<sourceLca.length();i++){
            res.append("U");
        }
         for(int i =p2; i<lcaDest.length();i++){
            res.append(lcaDest.charAt(i));
        }
        
        return res.toString(); 
    }
}