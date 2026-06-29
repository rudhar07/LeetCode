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
        HashMap<Integer,Integer> mp = new HashMap<Integer, Integer>();
        ListNode tem = head;
        while(tem!=null){
            if(mp.containsKey(tem.val)){
                mp.put(tem.val, mp.get(tem.val)+1);
            }else{
                mp.put(tem.val,1);
            }
            tem = tem.next;
        }
        tem = head;
        ListNode dummy = new ListNode(-1);
        ListNode ans = dummy;
        while(tem!=null){
            if(mp.get(tem.val)==1){
                ans.next = tem;
                ans = ans.next;
            }
            tem = tem.next;
        }
        ans.next = null;
        return dummy.next;
    }
}