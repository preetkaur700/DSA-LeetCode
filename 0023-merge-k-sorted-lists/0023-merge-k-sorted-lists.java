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
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists==null || lists.length == 0)return null;
        int interval = 1;
        while(interval<lists.length){
            for(int i=0;i+interval<lists.length;i+=interval*2){
                lists[i]=merge2Lists(lists[i],lists[i+interval]);
            }
            interval*=2;
        }
        return lists[0];
    }
     public ListNode merge2Lists(ListNode l1,ListNode l2) {
        ListNode dummy = new ListNode (0);
         ListNode tep =  dummy ;
        if(l1==null)return l2;
        if(l2==null)return l1;

        while(l1!=null && l2!=null ){
            if(l1.val<=l2.val){
                tep.next=l1;
                l1=l1.next;
            }else{
                tep.next=l2;
                l2=l2.next;
            }
            tep=tep.next;
        }

            if(l1!=null){
                tep.next=l1;  
            }
            if(l2!=null){
                tep.next=l2;
            }
            return dummy.next;
        }
}
