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
    public ListNode deleteDuplicates(ListNode head) {
        
        if(head == null){
        return null;
        }
        
        ListNode curr = head;

        while(curr != null ){
        if((curr.next != null) && (curr.next.val == curr.val)){
        curr.next = curr.next.next; // if both are equal change the pointer to new node.
        }else{
        curr = curr.next;  // else just point to next node
        }
        }
        return head;
        }
}