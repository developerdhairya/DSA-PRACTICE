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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head==null || left==right){
            return head;
        }
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode prev=dummy,curr=head;
        int i=1;
        while(i<left){
            prev=prev.next;
            curr=curr.next;
            i++;
        }
        ListNode tempPrev=prev;
        ListNode tempHead=curr;
        prev=null;
        while(i<right+1){
            ListNode temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
            i++;
        }
        tempPrev.next=prev;
        tempHead.next=curr;
        return dummy.next;
    }
}