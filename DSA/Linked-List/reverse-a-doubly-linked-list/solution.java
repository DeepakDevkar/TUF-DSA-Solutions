/*
class ListNode {
    int data;
    ListNode prev, next;
    ListNode(int val) {
        this.data = val;
        this.prev = null;
        this.next = null;
    }
}
*/

class Solution {
    public ListNode reverseDLL(ListNode head) {
        


         ListNode current = head;
       
        ListNode temp = null;
 
       
        while (current != null) 
        {
            temp = current.prev;
            current.prev = current.next;
            current.next = temp;
            current = current.prev;
        }
 
      
        if (temp != null)
            head = temp.prev;
 
        return head;


    }
}
