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
    public boolean isPalindrome(ListNode head) {
        ArrayList<Integer> li = new ArrayList<Integer>();
        ListNode dum = head;
        while(dum!=null){
            li.add(dum.val);
            dum  = dum.next;
        }
        
        int si = li.size();
        for(int i=0; i<si/2; i++){
            int x = li.get(i);
            int y = li.get(si-1-i);
            if(x!=y)return false;
        }
        return true;
        
    }
}