/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        // if(head==null) return null;
        // HashMap<Node,Node> map=new HashMap<>();
        // Node temp=head;
        // while(temp!=null){
        //     map.put(temp,new Node(temp.val));
        //     temp=temp.next;
        // }
        // temp=head;
        // while(temp!=null){
        //     Node copyNode=map.get(temp);
        //     copyNode.next=map.get(temp.next);
        //     copyNode.random=map.get(temp.random);
        //     temp=temp.next;
        // }
        // return map.get(head);
        if(head==null) return null;
        Node temp=head;
        while(temp!=null){
            Node copy=new Node(temp.val);
            copy.next=temp.next;
            temp.next=copy;
            temp=copy.next;
        }
        temp=head;
        while(temp!=null){
            if (temp.random != null) {
                temp.next.random = temp.random.next;
            }

            temp = temp.next.next;
        }
        Node dummy = new Node(0);
        Node copyTail = dummy;

        temp = head;

        while (temp != null) {

            Node copy = temp.next;

            temp.next = copy.next;

            copyTail.next = copy;
            copyTail = copy;

            temp = temp.next;
        }

        return dummy.next;
    }
}