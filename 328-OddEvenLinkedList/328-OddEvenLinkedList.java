// Last updated: 6/8/2026, 9:01:04 PM
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
11class Solution 
12{
13    public ListNode oddEvenList(ListNode head) 
14    {
15        if(head == null || head.next == null) return head;
16        ListNode oddHead = head , evenHead = head.next;
17        ListNode eTemp = evenHead;
18        while(eTemp != null && eTemp.next != null)
19        {
20            oddHead.next = eTemp.next;
21            oddHead = oddHead.next;
22            eTemp.next = oddHead.next;
23            eTemp = eTemp.next;
24        }
25        oddHead.next = evenHead;
26        return head;
27    }
28}