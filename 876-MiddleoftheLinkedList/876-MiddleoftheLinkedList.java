// Last updated: 3/23/2026, 11:12:11 AM
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
13    public ListNode middleNode(ListNode head) 
14    {
15        ListNode slow = head;
16        ListNode fast = head;
17        while(fast != null && fast.next != null)
18        {
19            slow =slow.next;
20            fast = fast.next.next;
21        }
22        return slow;
23        
24    }
25}