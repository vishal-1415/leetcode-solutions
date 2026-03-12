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
    public ListNode mergeKLists(ListNode[] lists) {
    if(lists == null||lists.length == 0){
        return null;
    }
    return mergeKListsHelper(lists,0,lists.length-1);
    }
    public ListNode mergeKListsHelper(ListNode[] list,int start,int end) {
        if(start == end){
            return list[start];
        }
        if(start+1 == end){
            return mergeTwoLists(list[start] ,list[end]);    //TC :O(N log K)   SC:O(K)
        }

        int mid = start + (end - start)/2;
        ListNode left = mergeKListsHelper(list,start,mid);
        ListNode right = mergeKListsHelper(list,mid+1,end);
        return mergeTwoLists(left,right);
    }
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;

        while(list1 != null && list2 != null){
            if(list1.val <= list2.val){
                temp.next = list1;
                list1 = list1.next;
            }else{
                temp.next = list2;
                list2 = list2.next;
            }
            temp = temp.next; // Move forward in merged list
        }
        // Attach remaining nodes (only one list will have nodes)
        if(list1 != null) temp.next = list1;        
        if(list2 != null) temp.next = list2;
        
    return dummy.next;                          
    } 
}