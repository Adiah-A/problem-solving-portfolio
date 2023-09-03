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
    public ListNode rotateRight(ListNode head, int k) {
        ListNode lastNode = head;
        ListNode prevNode = null;
        ListNode newLastNode = head;
        int size = 0;

        if(head == null || head.next == null || k == 0){
            return head;
        }

        while(lastNode != null){
            prevNode = lastNode;
            lastNode = lastNode.next;
            size++;
        }

        int cutPoint = 0;
        if(size > k){
            cutPoint = size - k;
        }else if(size == k){
            return head;
        }else{
            cutPoint = size - (k % size);
        }

        for(int i = 1; i < cutPoint; i++){
            newLastNode = newLastNode.next;
        }

        prevNode.next = head;
        head = newLastNode.next;
        newLastNode.next = null;

        return head;
    }
}