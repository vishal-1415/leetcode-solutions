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
        ListNode temp = head;
        if(head == null) return head;
        while (temp.next != null) {//run untill null

            if (temp.val == temp.next.val) {//check if the curr element and next ele are same 
                temp.next = temp.next.next;//if yes,point the curr node to next after element
            } else {
                temp = temp.next; // or move the pointer
            }
        }
        
        return head;
    }
}