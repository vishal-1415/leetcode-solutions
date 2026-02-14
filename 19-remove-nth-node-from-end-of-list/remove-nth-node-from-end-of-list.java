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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = head;
        int length = 0;
        // find length
        while (temp != null) {
            temp = temp.next;
            length++;
        }
        if (length == n) {// remove head case
            return head.next;
        }                                                 //TC:O(n)  SC:O(1)
        temp = head;
        // move to node before target
        for (int i = 0; i < length - n - 1; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;// delete node 

        return head;
    }
}