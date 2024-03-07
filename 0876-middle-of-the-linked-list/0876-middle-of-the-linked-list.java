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
    public ListNode middleNode(ListNode head) {
        ListNode dummy = head; 
        int count = 0; 
        if(dummy == null || dummy.next == null){
            return dummy;
        }
        while(dummy!=null){
            count++;
            dummy = dummy.next;
        }
        count = count/2;
        // count = Math.ceil(count);
        System.out.println(count);
        int i = 0; 

        while(i<count && head!=null){
            head = head.next; 
            i++;
        }

        return head;

    }
}