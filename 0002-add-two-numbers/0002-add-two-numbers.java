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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode curr = dummyHead;
        int carryOver = 0;
        

        while(l1 != null || l2 != null){
            int val1 = l1 == null ? 0 : l1.val;
            int val2 = l2 == null ? 0 : l2.val;
            int sum = val1 + val2 + carryOver;

            carryOver = sum / 10;
            int lastDigit = sum % 10;

            ListNode newNode = new ListNode(lastDigit);
            curr.next = newNode;
            curr = curr.next;

            if(l1 != null){
                l1 = l1.next;
            }

            if(l2 != null){
                l2 = l2.next;
            }

        }

        if(carryOver > 0){
            ListNode newNode = new ListNode(carryOver);
            curr.next = newNode;
            curr = curr.next;
        }

        return dummyHead.next;
    }
}