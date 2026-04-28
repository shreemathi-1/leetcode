// Last updated: 4/28/2026, 7:33:30 PM
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
13    public ListNode removeNthFromEnd(ListNode head, int n) 
14    {
15        
16        ListNode dummy = new ListNode(0);
17        dummy.next = head;
18        ListNode slow = dummy,fast = dummy;
19        
20
21        for(int i=0;i<=n;i++)
22        {
23            fast = fast.next;
24        }
25        while(fast != null)
26        {
27            
28            fast = fast.next;
29            slow = slow.next;
30        }
31        slow.next = slow.next.next;
32
33        return dummy.next;
34    }
35}