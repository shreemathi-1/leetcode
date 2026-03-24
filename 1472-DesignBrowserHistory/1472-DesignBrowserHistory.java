// Last updated: 3/24/2026, 2:45:21 PM
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
14        {
15            return head;
16        }
17        ListNode odd = head;
18        ListNode even = odd.next;
19        ListNode evenHead = even;
20        
21        while(odd !=null && odd.next != null && even != null && even.next != null)
22        {
23            odd.next = even.next;
24          odd = odd.next;
25          even.next = odd.next;
26          even = even.next;
27        }
28         odd.next = evenHead;
29          return head;
30    }
31}