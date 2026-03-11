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
        ListNode Dummy = new ListNode();
        Dummy.next = head;

        ListNode prev = Dummy;
        ListNode curr = head;

        while (curr != null) {
            // if current node is duplicate
            if (curr.next != null && curr.val == curr.next.val) {
                //move to last dupicate node
                while (curr.next != null && curr.val == curr.next.val) {
                    curr = curr.next;
                }
                //skip the duplicate node
                prev.next = curr.next;
            } else { 
                prev = prev.next;//found of unqiue node
            }
            curr = curr.next;// move curr node
        }
        return Dummy.next;
    }
}