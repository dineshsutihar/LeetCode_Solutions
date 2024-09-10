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
    private int findGcd(int a, int b){
        // if(a==0) return b; 

        // return findGcd(b%a, a); 
        if(a == 1 || b==1){
            return 1;
        }
        while(b !=0){
            int rem = a % b;
            a = b;
            b= rem;
        }
        return a;
    }

    public ListNode insertGreatestCommonDivisors(ListNode head) {
        if(head.next == null) return head; 
        ListNode cur = head; 

        while(cur.next != null){
            int gcd = findGcd(cur.val, cur.next.val);
            ListNode gcdNode = new ListNode(gcd); 
            gcdNode.next = cur.next; 
            cur.next = gcdNode; 
            cur = gcdNode.next; 
        }

        return head; 
    }
}