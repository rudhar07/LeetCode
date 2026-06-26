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
    public ListNode modifiedList(int[] nums, ListNode head) {
        HashSet<Integer> st = new HashSet<Integer>();
        for(int i=0; i<nums.length; i++){
            st.add(nums[i]);
        }

        ListNode tem = head;
        while(tem!=null && tem.next!=null){
            if(st.contains(tem.next.val)){
                tem.next = tem.next.next;
            } else tem = tem.next;
        }
        if(head!=null && st.contains(head.val)){
            return head.next;
        }

        return head;        

    }
}