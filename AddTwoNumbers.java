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
    public ListNode addTwoNumbers(ListNode ll1, ListNode ll2) {
        ListNode temp=new ListNode(0);
        ListNode curr=temp;
        int carry=0;

        while(ll1!=null || ll2!=null || carry>0){
            if(ll1!=null){
                carry+=ll1.val;
                ll1=ll1.next;
            }
            if(ll2!=null){
                carry+=ll2.val;
                ll2=ll2.next;
            }
            curr.next=new ListNode(carry%10);
            carry/=10;
            curr=curr.next;
        }
        return temp.next;
    }
}
