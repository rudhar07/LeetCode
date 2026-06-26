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
        ListNode dum = l1;
        ListNode prev = null;
        int mover = 0;
        while(l1!=null && l2!=null){
            int sum = l1.val+ l2.val+ mover;
            l1.val = sum%10;
            mover = sum/10;
            prev = l1;
            l1=l1.next;
            l2=l2.next;

        }
        if(l1==null){
            prev.next = l2;
            l1 = l2;
        }

        while(mover>0 && l1!=null){
            int sum = l1.val+ mover;
            l1.val = sum%10;
            mover = sum/10;
            prev = l1;
            l1 = l1.next;

        }
        if(mover>0){
            l1 = new ListNode(mover);
            prev.next = new ListNode(mover);
        }

        return dum;
        
    }
}