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
        ListNode cur = head;
        int si = 1;
        while(cur.next != null){
            cur = cur.next;
            si++;
        }
        cur = head;

        if(si<=n){
            return head.next; 
        }

        for(int i=1; i<(si-n); i++){
            cur = cur.next;
        }

        if(cur.next.next!=null){
            cur.next = cur.next.next;
        }else{
            cur.next = null;
        }

        return head;
        
    }
}