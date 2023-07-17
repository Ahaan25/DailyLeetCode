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
    private ListNode addNode(ListNode ans, int digit){
        ListNode newNode=new ListNode(digit);
        if(ans==null) {
            ans=newNode;
            return ans;
        }
        newNode.next=ans;
        ans=newNode;
        return ans;
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode ans=null;
        Stack<Integer> s1=new Stack<>();
        Stack<Integer> s2=new Stack<>();
        while(l1!=null){
            s1.push(l1.val);
            l1=l1.next;
        }
        while(l2!=null){
            s2.push(l2.val);
            l2=l2.next;
        }
        int carry=0;
        while(!s1.isEmpty() && !s2.isEmpty()){
            int sum=s1.pop()+s2.pop()+carry;
            ans=addNode(ans,sum%10);
            carry=sum/10;
        }
        while(!s1.isEmpty()){
            int sum=s1.pop()+carry;
            ans=addNode(ans,sum%10);
            carry=sum/10;
        }
        while(!s2.isEmpty()){
            int sum=s2.pop()+carry;
            ans=addNode(ans,sum%10);
            carry=sum/10;
        }
        if(carry!=0){
            ans=addNode(ans, carry);
        }
        return ans;
    }
}
