/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        //brute force
        // ListNode temp1=headA;

        // while(temp1!=null){

        //     ListNode temp2=headB;

            

        //     while(temp2!=null){

        //         if(temp1==temp2)return temp1;

        //         temp2=temp2.next;
        //     }
        //     temp1=temp1.next;
        // }
        // return null;

        ////using Hashset

        // HashSet<ListNode> set = new HashSet<>();
        // ListNode temp1=headA;

        // while(temp1!=null){
        //     set.add(temp1);
        //     temp1=temp1.next;
        // }
        
        // ListNode temp2=headB;
        // while(temp2!=null){
            
        //     if(set.contains(temp2))return temp2;
        //     temp2=temp2.next;
        // }
        // return null;

///using to find length

        // int len1 = length(headA);
        // int len2 = length(headB);

        // ListNode p1 = headA;
        // ListNode p2 = headB;

        // int diff = Math.abs(len1-len2);
        // if(len1>len2){
        //     while(diff-- > 0){
        //         p1=p1.next;
        //     }
        // }else{
        //     while(diff-- > 0){
        //         p2=p2.next;
        //     }
        // }

        // while(p1!=null && p2!=null){
        //     if(p1==p2)return p1;

        //     p1 = p1.next;
        //     p2=p2.next;
        // }
        // return null; 

///using 2 pointer;
 
        if(headA == null || headB == null)return null;

        ListNode p1 = headA;
        ListNode p2 = headB;

        while(p1!=p2){

            p1 = (p1==null)?headA:p1.next;
            p2 = (p2==null)?headB:p2.next;
        }
        return p1;  
    }


    
    //   public int length(ListNode head){
    //         int len=0;
    //         while(head!=null){
    //             len++;
    //             head=head.next;
    //         }
    //         return len;
    //     }
}