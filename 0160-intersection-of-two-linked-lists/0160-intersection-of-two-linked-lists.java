/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB)
    {
      int lenA = len(headA);
    int lenB = len(headB);
    int diff = Math.abs(lenA - lenB); // Use Math.abs to get the absolute difference

    ListNode ca = headA;
    ListNode cb = headB;

    // Adjust pointers to have equal remaining lengths
    if (lenA > lenB) {
        while (diff > 0) {
            ca = ca.next;
            diff--;
        }
    } else {
        while (diff > 0) {
            cb = cb.next;
            diff--;
        }
    }

    // Iterate through both lists to find the intersection node
    while (ca != null && cb != null) {
        if (ca == cb) {
            return ca; // Intersection node found
        }
        ca = ca.next;
        cb = cb.next;
    }

    return null; // No intersection node found
}

// Method to calculate the length of a linked list
public int len(ListNode head) {
    int count = 0;
    while (head != null) {
        head = head.next;
        count++;
    }
    return count;
}
}