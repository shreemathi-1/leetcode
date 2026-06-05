// Last updated: 6/5/2026, 12:16:31 PM
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
13    public void reorderList(ListNode head) 
14    {
15        ListNode slow = head , fast = head;
16        while(fast != null && fast.next != null)
17        {
18            slow = slow.next;
19            fast = fast.next.next;
20        }
21
22        ListNode cur = slow.next , next = null , prev = null;
23        slow.next = null;
24        while(cur != null)
25        {
26            next = cur.next ;
27            cur.next = prev;
28            prev = cur;
29            cur = next;
30        }
31        ListNode secHead = prev;
32        ListNode firHead = head;
33        
34        while(secHead != null )
35        {
36            ListNode t1 = firHead.next;
37            ListNode t2 = secHead.next;
38            firHead.next = secHead;
39            secHead.next = t1;
40            firHead = t1;
41            secHead = t2;
42        }
43    }
44}