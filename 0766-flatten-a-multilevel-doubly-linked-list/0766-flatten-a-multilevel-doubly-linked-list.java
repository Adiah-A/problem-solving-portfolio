/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class Solution {
    public Node flatten(Node head) {
       Node curr = head;

       while(curr != null){
           if(curr.child != null){
               Node childTail = tail(curr.child); //end of child

               if(curr.next != null){
                   curr.next.prev = childTail;
               }

               childTail.next = curr.next;
               curr.next = curr.child;
               curr.child.prev = curr;
               curr.child = null;
           }

           curr = curr.next;
       }

       return head;
    }

    private Node tail(Node child){
        Node curr = child;

        while(curr.next != null){
            curr = curr.next;
        }

        return curr;
    }
}