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
    public ListNode partition(ListNode head, int x) {
        ListNode smallDummy = new ListNode(0);
        ListNode greaterDummy = new ListNode(0);

        ListNode small = smallDummy;
        ListNode greater = greaterDummy;
        ListNode temp=head;
        while(temp!=null){

            if(temp.val<x){
                small.next = temp;  
                small = small.next;
            }
            else{
                greater.next = temp;
                greater = greater.next;
            }
            temp=temp.next;
        }
        greater.next=null;
        small.next = greaterDummy.next;
        return smallDummy.next;
        

    }
}