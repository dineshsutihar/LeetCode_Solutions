/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

/*
class Solution {
    public ListNode removeNodes(ListNode head) {
        Stack<ListNode> stack = new Stack<>();
        ListNode current = head; 
        
        // Adding elements to stack 
        while(current != null){
            stack.push(current);
            current = current.next;
        }
        
        current = stack.pop();
        int maximum = current.val;
        
        ListNode resultList = new ListNode(maximum);
        
        
        while(!stack.isEmpty()){
            current = stack.pop();
            
            if(current.val <maximum){
                continue;
            }else{
                ListNode newNode = new ListNode(current.val);
                newNode.next = resultList; 
                resultList = newNode; 
                maximum = current.val;
            }
        }
        
        return resultList;
    }
}

*/


 class Solution {   
    public ListNode removeNodes(ListNode head) {
        // Base case, reached end of the list
        if (head == null || head.next == null) {
            return head;
        }

        // Recursive call
        ListNode nextNode = removeNodes(head.next);

        // If the next node has greater value than head, delete the head
        // Return next node, which removes the current head and makes next the new head
        if (head.val < nextNode.val) {
            return nextNode;
        }

        // Keep the head
        head.next = nextNode;
        return head;
    }
}