// Last updated: 5/6/2026, 11:44:23 AM
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
13        if(head == null || head.next == null) 
14            return head;
15        ListNode odd = head,even = head.next;
16        ListNode evenHead = even;
17        while(even != null && even.next != null)
18        {
19            odd.next = even.next;
20            odd = odd.next;
21            even.next = odd.next;
22            even = even.next;
23        }
24        odd.next = evenHead;
25        return head;
26    }
27}