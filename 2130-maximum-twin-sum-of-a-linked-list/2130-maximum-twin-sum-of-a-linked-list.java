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
    public int pairSum(ListNode head) {
        if(head==null)return 0;
        ListNode cur = head;
        int si=1;
        while(cur.next!=null){
            si++;
            cur=cur.next;
        }
        int[] l = new int[si];
        int k=0;
        cur=head;
        while(cur!=null){
            l[k++] = cur.val;
            cur=cur.next;
        }
        int ans=0;
        for(int i=0;i<(si/2);i++){
            ans = Math.max(ans, l[i]+l[si-1-i]);
        }

        return ans;
    }
}