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
    public ListNode reverseKGroup(ListNode head, int k) {
        
        ListNode temp=head;
        int len=0;
        while(temp!=null && len<k){
           
            temp=temp.next;
            len++;
        }
        if(len==k){
            ListNode newHead = reverse(head,k);
            head.next=reverseKGroup(temp,k);
            return newHead;
        }
        return head;
    }
    public ListNode reverse(ListNode head,int k){
        ListNode next=null;
        ListNode prev=null;
        ListNode temp=head;

        while(k>0){
            next=temp.next;
            temp.next=prev;
            prev=temp;
            temp=next;
            k--;
        }
        return prev;
    }
}