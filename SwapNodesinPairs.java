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
    public ListNode swapPairs(ListNode head) {
        if(head==null || head.next==null)
           return head;
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode curr=dummy.next,prev=dummy;
        while(curr!=null && curr.next != null){
            ListNode temp1=curr.next;
            curr.next=temp1.next;
            temp1.next=curr;
            prev.next=temp1;
            prev=curr;
            curr=curr.next;
        }   
        return dummy.next;
    }
}
