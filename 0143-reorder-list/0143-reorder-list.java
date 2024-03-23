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
class Solution {
    public void reorderList(ListNode head) {
        if( head ==null || head.next ==null || head.next.next ==null)
         return;
        //find the middle 
        ListNode slow = head, fast = head; 
        while(fast!=null && fast.next !=null){
            slow = slow.next; 
            fast = fast.next.next; 
        }

        ListNode secondHead = slow.next; 
        //detach the two ll
        slow.next =null;
        //reverse the second ll
        ListNode cur= secondHead;
        ListNode prev = null; 
        while(cur!=null){
            ListNode nextNode = cur.next;
            cur.next = prev;
            prev = cur; 
            cur = nextNode; 

        }

        //insert nodes of second list into the first list
        ListNode t1=head, t2 = prev; 
        while(t2!=null){
            ListNode m1 = t1.next; 
            ListNode m2 = t2.next; 
            t1.next = t2; 
            t2.next = m1; 
            t1 = m1; 
            t2 = m2;
        }
    }
}