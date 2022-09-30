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
    public ListNode reverseBetween(ListNode head, int k, int l) {
        // l=len(head)-l;
        if(k==l || head==null){
            return head;
        }
        ListNode dummy=new ListNode(0);  // dummy node
        dummy.next=head;
        ListNode p=dummy;     // left se ek pehli node
        
        int i=0;
        while(i<=k-2 && p!=null){
            p=p.next;
            i++;
        }
        if(p==null){
            return dummy.next;
        }
        ListNode curr=p.next;
        int total=l-k+1;
        int count=0;
        while(count<total-1 && curr!=null){
            if(curr.next!=null){
                ListNode temp=curr.next;
                curr.next=curr.next.next;
                ListNode temp1=p.next;
                p.next=temp;
                temp.next=temp1;
            }
            // curr=curr.next;
            count++;
        }
        return dummy.next;    
    }
    
    public int len(ListNode node){
        int i=1;
        while(node.next!=null){
            i++;
            node=node.next;
        }
        return i;
    }
    
}