class Solution {
    public ListNode deleteMiddle(ListNode head) {

        if (head == null || head.next == null) {
            return null;
        }

        ListNode temp = head;
        int n = 0;

        while (temp != null) {
            n++;
            temp = temp.next;
        }

        int res = n / 2;

        temp = head;

        
        for (int i = 0; i < res - 1; i++) {
            temp = temp.next;
        }

        
        temp.next = temp.next.next;

        return head;
    }
}