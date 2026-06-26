class ListNode{
    int val;
    ListNode next;
    ListNode(int val){
        this.val=val;
        this.next=null;
    }
}

class MyLinkedList {
    ListNode head;
    ListNode tail;
    int size;

    public MyLinkedList() {
        head = null;
        tail = null;
        size=0;
    }

    public ListNode getNode(int k){
        if(k>=size || k<0){
            return null;
        }
        ListNode tem = head;
        for(int i=0; i<k; i++){
            tem = tem.next;
        }
        return tem;
    }

    
    public int get(int index) {
        if(index>=size) return -1;
        return getNode(index).val;        
    }
    
    public void addAtHead(int val) {
        ListNode naya = new ListNode(val);
        naya.next = head;
        head = naya;
        if(size==0) tail = head;
        size++;
    }
    
    public void addAtTail(int val) {
        if(size==0){
            addAtHead(val);
            return;
        }
        ListNode na = new ListNode(val);
        tail.next = na;
        tail = na;
        size++;
    }
    
    public void addAtIndex(int index, int val) {
        if(index==0){
            addAtHead(val);
            return;
        }
        if(index==size){
            addAtTail(val);
            return;
        }
        if(index>size){
            return;
        }
        ListNode na = new ListNode(val);
        ListNode pre = getNode(index-1);
        na.next=pre.next;
        pre.next=na;
        size++;
        
    }
    
    public void deleteAtIndex(int index) {
        if(index>=size)return;
        if(index==0){
            head = head.next;
        }else if(index==size-1){
            ListNode na = getNode(index-1);
            na.next = null;
            tail = na;
        }else{
            ListNode na = getNode(index-1);
            // ListNode nay = getNode(index+1);
            na.next = na.next.next;
        }
        size--;
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */