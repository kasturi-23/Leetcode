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
    public ListNode removeNthFromEnd(ListNode head, int n) {
     ListNode temp = head;
int index = 0;
int count=0, count1=0;
 
if(temp == null) {
    return null;
}
 
if(temp.next == null) {
    if (n == 1) {
        return null;
    } else {
        return temp;
    }
}
 
while (temp != null) {
    count++;
    temp = temp.next;
}
if(count == n){
    return head.next;
}
 
index = count - n-1;
 
ListNode prev = head;
ListNode current =head.next;
for(int i=0;i<count;i++){
    if(i==index){
        if(current.next==null){
            prev.next=null;
            break;
        }
        else{
            prev.next=current.next;
        }
    }
    else{
        prev=current;
        current= current.next;
    }
}
return head;
    }
}