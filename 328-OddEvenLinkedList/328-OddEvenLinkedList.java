// Last updated: 6/5/2026, 11:44:50 AM
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
12    public ListNode oddEvenList(ListNode head) {
13        if(head == null) return null;
14        ListNode odd = head, even = head.next;
15        ListNode evenHead = even;
16        while(even != null && even.next != null)
17        {
18            odd.next = even.next;
19            odd = odd.next;
20            even.next = odd.next;
21            even = even.next;
22        }
23        odd.next = evenHead;
24        return head;
25    }
26}