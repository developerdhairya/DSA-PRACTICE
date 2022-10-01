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
        if(head==null || head.next==null){
            return head;
        }
        // int k=2;
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode prev=dummy,curr=head;
        while(curr!=null){
            ListNode prevTemp=prev;
            ListNode currTemp=curr;
            prevTemp.next=null;
            int i=1;
            while(i<k+1 && curr!=null){
                ListNode temp=curr.next;
                curr.next=prev;
                prev=curr;
                curr=temp;
                i++;
            }
            if(curr==null && i<k+1){
                curr=prev;
                prev=null;
                while(curr!=prevTemp){
                    ListNode temp=curr.next;
                    curr.next=prev;
                    prev=curr;
                    curr=temp;
                }
                prevTemp.next=prev;
                return dummy.next;
            }
            prevTemp.next=prev;
            currTemp.next=curr;
            prev=currTemp;
        }
        return dummy.next;
        
    }
}