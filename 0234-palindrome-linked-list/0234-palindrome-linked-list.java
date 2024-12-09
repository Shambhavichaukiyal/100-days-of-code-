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
    public boolean isPalindrome(ListNode head) 
    {
          if (head == null || head.next == null)
            return true;

        ListNode middle = middle(head);
        ListNode secondHalfReversed = reverse(middle);
        middle.next = null;

        while (head != null && secondHalfReversed != null) {
            if (head.val != secondHalfReversed.val)
                return false;
            head = head.next;
            secondHalfReversed = secondHalfReversed.next;
        }
        return true;
    }

        
    
    public ListNode middle(ListNode head)
    {
      ListNode slow=head;
        ListNode fast= head;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public ListNode reverse(ListNode head)
    {
        if(head==null)
        {
            return head;
        }
        ListNode prev=null;
        ListNode present = head;
        ListNode next= present.next;
        
        while(present!=null)
        {
            present.next=prev;
            prev=present;
            present = next;
            if(next!=null)
            {
                next=next.next;
            }
        }
        head=prev;
        return head;
    }
}