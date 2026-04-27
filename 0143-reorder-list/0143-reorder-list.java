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
    public void reorderList(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while(fast.next!=null && fast.next.next!= null){
            slow=slow.next;
            fast = fast.next.next;
        }
        ListNode second = slow.next;
        slow.next = null;

        ListNode temp = second;
        ListNode prev = null;
        while(temp!=null){
            ListNode next = temp.next;
            temp.next=prev;

            prev=temp;
            temp=next;
        }
        ListNode first = head;
        ListNode secRev = prev;

        while(secRev!=null){
            ListNode tempA =  first.next;
            ListNode tempB = secRev.next;


            first.next = secRev;
            secRev.next = tempA;
    
            first = tempA;
            secRev = tempB;
        }            
                

    }
}