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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode prevNodeA = list1; 
        ListNode nodeB = list1; 
        
        //find a-1 & bth node 
        for(int index = 0; index<b; index++ ){
            if(index == a-1){
                prevNodeA = nodeB; 
            }
            nodeB = nodeB.next;
        }
        
        //find list2 end
        ListNode list2End = list2; 
        while(list2End.next!=null){
            list2End = list2End.next; 
        }
        prevNodeA.next = list2; 
        list2End.next = nodeB.next; 
        nodeB.next = null;
        
        return list1;
    }
}