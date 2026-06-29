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
        ListNode tem = head;
        while(tem!=null && tem.next!=null){
            if(tem.val==tem.next.val){
                tem.next = tem.next.next;
            }else {
                tem = tem.next;
            }

        }
        return head;
    }
}