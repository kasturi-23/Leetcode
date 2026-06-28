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
        if(head==null || head.next == null || k==0){
            return head;
        }
        int length =1;
        ListNode lastnode = head;
        while(lastnode.next!=null){
            lastnode= lastnode.next;
            length++;
        }

        k=k%length;
        if(k==0){
            return head;
        }
        lastnode.next=head;
        int stepsToNewTail = length - k;
        ListNode newTail = head;

        for (int i = 1; i < stepsToNewTail; i++) {
            newTail = newTail.next;
        }
        ListNode newHead = newTail.next;

        newTail.next=null;

        return newHead;
    }
}