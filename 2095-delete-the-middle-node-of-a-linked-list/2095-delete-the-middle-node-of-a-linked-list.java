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
        ListNode c=head;
        if(head==null)return null;
        int si=1;

        while(c.next!=null){
            c=c.next;
            si++;
        }
        if(si==1)return null;
        c=head;
        for(int i=1;i<si/2;i++){
            c=c.next;
        }
        c.next=c.next.next;
        return head;
        
    }
}