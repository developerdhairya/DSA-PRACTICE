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
    public ListNode swapNodes(ListNode head, int k) {
        if(head==null){
            return head;
        }
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode curr=head,prev=dummy;
        int i=1;
        while(i<k && curr!=null){
            curr=curr.next;
            prev=prev.next;
            i++;
        }
        if(curr==null){
            return head;
        }
        ListNode tempPrev=prev;
        ListNode tempCurr=curr;
        ListNode start=head,startPrev=dummy;
        while(curr.next!=null){
            curr=curr.next;
            start=start.next;
            startPrev=startPrev.next;
        }
        
        ListNode t1=tempCurr.next;
        ListNode t2=start.next;
        
        if(start==tempCurr){
            return head;
        }else if(start.next==tempCurr){
            startPrev.next=tempCurr;
            tempCurr.next=start;
            start.next=t1;
        }else if(tempCurr.next==start){
            tempPrev.next=start;
            start.next=tempCurr;
            tempCurr.next=t2;
        }else{
            tempPrev.next=start;
            start.next=t1;
            startPrev.next=tempCurr;
            tempCurr.next=t2;
        }
        
       
        
        return dummy.next;
        
        
        
    }
}