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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode newHead = new ListNode();
        ListNode current = newHead; 
        
        while(list1 != null && list2 != null){
            
            //comparing both list and merging both on new list 
            if(list1.val < list2.val){
                current.next = list1;
                list1 = list1.next; 
                
            }else {
                current.next = list2;
                list2 = list2.next; 
            }
            
            current = current.next;
        }
        
        if(list1 != null){
            current.next = list1; 
        }else {
            current.next = list2; 
        }
        
        return newHead.next; 
    }
}