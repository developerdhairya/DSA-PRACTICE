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
    public ListNode swapPairs(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        int k=2;
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode prev=dummy,curr=head;
        while(curr!=null && curr.next!=null){
            ListNode prevTemp=prev;
            ListNode currTemp=curr;
            prevTemp.next=null;
            int i=1;
            while(i<k+1){
                ListNode temp=curr.next;
                curr.next=prev;
                prev=curr;
                curr=temp;
                i++;
            }
            prevTemp.next=prev;
            currTemp.next=curr;
            prev=currTemp;
        }
        return dummy.next;
        
        
    }
}