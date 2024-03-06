/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head){
        if(head == null || head.next == null){
            return false;
        }
        
        ListNode lateCheck = head;
        ListNode fastCheck = head; 

        while(fastCheck.next != null && fastCheck.next.next != null){
            fastCheck = fastCheck.next.next; 
            lateCheck = lateCheck.next; 
            if(fastCheck == lateCheck){
                return true; 
            }
        }
        return false; 
    }
}