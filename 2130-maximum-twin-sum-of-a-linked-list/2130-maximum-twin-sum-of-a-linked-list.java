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
    public int pairSum(ListNode head) {
        ArrayList<Integer> arr = new ArrayList<>();
        ListNode temp =head;
        int maxsum=0,sum =0;
        while(temp!=null){
            arr.add(temp.val);
            temp=temp.next;
        }
        int len= arr.size();
        for(int i=0;i<len;i++){
            int end = arr.get(len-1-i);
            int n= arr.get(i);
            sum = n+end;            
            maxsum = Math.max(sum,maxsum);
        }
        return maxsum;
    }
}