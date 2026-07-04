// Last updated: 7/4/2026, 10:26:42 PM
1class Solution {
2    public ListNode deleteMiddle(ListNode head) {
3        if(head == null || head.next == null) return null;
4        ListNode prev=null,slow=head,fast=head;
5        while(fast != null && fast.next != null){
6            prev = slow;
7            slow = slow.next;
8            fast = fast.next.next;
9        }
10        if(prev == null) return null;
11        prev.next = slow.next;
12        return head;
13    }
14}