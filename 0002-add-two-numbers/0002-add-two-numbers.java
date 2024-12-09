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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head1=l1;
        ListNode head2=l2;
        ListNode curr=new ListNode(-1);
        ListNode dummy=curr;
        int carry=0;
        int sum=0;
        while(head1!=null || head2!=null)
        {
            sum=carry;
            if(head1!=null)
            {
                sum+=head1.val;
                head1=head1.next;
             }
            if(head2!=null)
            {
                sum+=head2.val;
                head2=head2.next;
            }
            ListNode n=new ListNode(sum%10);
            dummy.next=n;
            dummy=dummy.next;
            carry=sum/10;
            }
        if(carry==0)
        {
            return curr.next;
        }
        ListNode n=new ListNode(1);
        dummy.next=n;
        return curr.next;
    }
}