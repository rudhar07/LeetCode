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
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next==null || k==0)return head;
        ListNode c=head;
        int si=1;
        while(c.next!=null){
            c=c.next;
            si++;
        }
        k=k%si;
        if(k==0)return head;
        ListNode A = head;
        c.next=A;
        int rot=si-k;
        while(rot-- > 1){
            A=A.next;
        }
        ListNode ans = A.next;
        A.next=null;
        return ans;
    }
}