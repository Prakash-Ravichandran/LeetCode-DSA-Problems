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
        
           ListNode current_node_pointer = head;
           ListNode next_node_pointer = current_node_pointer.next;
        
     while( current_node_pointer.val == next_node_pointer.val && next_node_pointer.next != null ){
            next_node_pointer = next_node_pointer.next;
            current_node_pointer.next = next_node_pointer; 
        }
        return current_node_pointer;
    }
}