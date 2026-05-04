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
    public ListNode split(ListNode head){
        ListNode slow=head;
        ListNode fast=head.next;

        while(fast!=null && fast.next!=null){
            fast=fast.next.next;

            slow=slow.next;
        }
        ListNode temp = slow.next;
        slow.next=null;
        return temp;
    }

    public ListNode merge(ListNode a,ListNode b){
        if(a==null)return b;
        if(b==null)return a;

        
        if(a.val<b.val){
           a.next=merge(a.next,b);
                return a;
        }else{
            b.next=merge(a,b.next);
             return b;
        }
        
    }
    public ListNode sortList(ListNode head) {
        if(head==null || head.next==null)return head;

        ListNode second = split(head);
        head = sortList(head);
        second=sortList(second);
        
        return merge(head,second);
    }
}