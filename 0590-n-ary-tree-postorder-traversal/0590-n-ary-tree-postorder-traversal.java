/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    private List<Integer> li = new ArrayList<>();

    public List<Integer> postorder(Node root) {
        if(root == null) return li; 
        postorderNarray(root);
        li.add(root.val);
        return li; 
    }
    public void postorderNarray(Node root){ 
        int size = root.children.size();
        for(int i=0; i<size; i++){
            postorderNarray(root.children.get(i));
            li.add(root.children.get(i).val);
        }
    }
    
}