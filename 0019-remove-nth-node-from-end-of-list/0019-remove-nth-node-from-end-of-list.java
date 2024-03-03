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
// class Solution {
//     public ListNode removeNthFromEnd(ListNode head, int n) {
//         ListNode newNode = head; 
//         while(head != null){
//             if(head.val == n){
//                 continue; 
//             }
//             newNode.val= head.val; 
//             newNode.next = head.next;
//             head = head.next; 
//             newNode = newNode.next; 
//         }
//         return newNode; 
//     }
// }

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode first = head;
        ListNode second = dummy;

        // Move first pointer to the n+1th node
        for (int i = 0; i < n; i++) {
            first = first.next;
        }

        // Move both pointers until the first pointer reaches the end
        while (first != null) {
            first = first.next;
            second = second.next;
        }

        // Remove the nth node from the end
        second.next = second.next.next;

        return dummy.next;
    }
}
