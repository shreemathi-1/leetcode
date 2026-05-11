// Last updated: 5/11/2026, 9:23:26 AM
1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode() {}
7 *     ListNode(int val) { this.val = val; }
8 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
9 * }
10 */
11class Solution {
12    public ListNode swapPairs(ListNode head) {    
13        ListNode dummy = new ListNode(0, head);
14        ListNode prev = dummy, cur = head;
15        while (cur != null && cur.next != null) {
16            ListNode npn = cur.next.next;
17            ListNode second = cur.next;
18
19            second.next = cur;
20            cur.next = npn;
21            prev.next = second;
22
23            prev = cur;
24            cur = npn;
25        }
26        return dummy.next;        
27    }
28}