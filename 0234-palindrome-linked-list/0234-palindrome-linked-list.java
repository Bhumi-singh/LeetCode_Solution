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
    public boolean isPalindrome(ListNode head) {
        // Stack<ListNode> st=new Stack<>();
        // ListNode temp=head;
        // while(temp!=null){
        //     st.push(temp);
        //     temp=temp.next;
        // }
        // temp=head;
        // while(temp!=null){
        //     if(temp.val != st.peek().val) return false;
        //     temp=temp.next;
        //     st.pop();
        // }
        // return true;
        if(head==null || head.next==null) return true;
        ListNode slow=head;
        ListNode fast=head;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode secondHalf=reverse(slow.next);
        ListNode firstHalf=head;
        ListNode temp=secondHalf;
        while(temp!=null){
            if(firstHalf.val != temp.val) return false;
            temp=temp.next;
            firstHalf=firstHalf.next;
        }
        return true;
    }
    private ListNode reverse(ListNode head){
        ListNode prev=null;
        while(head!=null){
            ListNode temp=head.next;
            head.next=prev;
            prev=head;
            head=temp;
        }
        return prev;
    }
}