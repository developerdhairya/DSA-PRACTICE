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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null){
            return head;
        }
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode curr=head,start=head,startPrev=dummy;
        int i=1;
        while(i<n && curr!=null){
            curr=curr.next;
            i++;
        }
        if(curr==null){
            return head;
        }
        while(curr.next!=null){
            curr=curr.next;
            start=start.next;
            startPrev=startPrev.next;
        }
        startPrev.next=startPrev.next.next;
        return dummy.next;
        
    }
}