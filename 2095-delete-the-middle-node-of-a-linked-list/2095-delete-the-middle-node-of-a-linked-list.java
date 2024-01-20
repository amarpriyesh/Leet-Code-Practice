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
    public ListNode deleteMiddle(ListNode head) {
        
        if (head == null || head.next == null) {
            return null;
        }
        if (head.next.next == null) {
            head.next = null;
            return  head;
        }
        
        ListNode fast = head;
        ListNode slow = head;
        ListNode prev = head;
        
        while (fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            prev = slow;
            slow = slow.next;
            
        }
        
        if (fast.next == null) {
            prev.next = slow.next;
            return head;
        }
        
         
            slow.next = slow.next.next;
            return head;
        
        
    
        
    }
}