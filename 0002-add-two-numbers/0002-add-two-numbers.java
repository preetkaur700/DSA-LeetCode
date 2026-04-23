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
        
        // ListNode temp1 = reverse(l1);
        // ListNode temp2 = reverse(l2);
        ListNode dummy = new ListNode(0);
        ListNode a = l1;
        ListNode b = l2;
        ListNode temp = dummy;
        int carry = 0;
        while(a!=null || b!=null || carry!=0){
            int sum=carry;
            if(a!=null){
                sum+=a.val;
                a=a.next;
            }
            if(b!=null){
                sum+=b.val;
                b=b.next;
            }

            carry = sum/10;
            int digit = sum%10;
            temp.next = new ListNode(digit);
            temp=temp.next;
        }
        return dummy.next;
    }
    public ListNode reverse(ListNode head){

        ListNode temp=head;
        ListNode prev=null;
        ListNode next=null;
        while(temp!=null){
            next=temp.next;
            temp.next=prev;
            prev=temp;
            temp=next;
        }
        return head;
    }
}