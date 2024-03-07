# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def rotateRight(self, head: Optional[ListNode], k: int) -> Optional[ListNode]:
        size = 1
        ref = head
        if head == None or k == 0:
            return head
        while ref.next != None:
            size += 1
            ref = ref.next
            
        
        if size == 1 or size == k:
            return head
        
        if size < k:
            k = k % size
        if k == 0:
            return head
        last = ref
    
        
        ref = head
            
        
        
        node = None
        nodeVal = 1
        while nodeVal < size - k:
            nodeVal += 1
            ref = ref.next
        
        first = ref.next
        ref.next = None
        last.next = head
            
        
        return first
        