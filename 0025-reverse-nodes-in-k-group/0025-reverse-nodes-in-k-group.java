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
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode prevGroup=dummy;
        while(true){
            ListNode Kth=prevGroup;
            for(int i=0;i<k && Kth!=null;i++){
                Kth=Kth.next;
            }

            if(Kth==null) break;
            ListNode nextGroup=Kth.next;
            ListNode prev=nextGroup;
            ListNode curr=prevGroup.next;

            while(curr!=nextGroup){
                ListNode temp=curr.next;
                curr.next=prev;
                prev=curr;
                curr=temp;
            }

            ListNode temp=prevGroup.next;
            prevGroup.next=Kth;
            prevGroup=temp;
        }
        return dummy.next;
    }
}