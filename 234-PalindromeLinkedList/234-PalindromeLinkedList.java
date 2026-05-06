// Last updated: 5/6/2026, 11:08:57 AM
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
13    public static ListNode reverse(ListNode head)
14    {
15        ListNode prev = null,next = null;
16        while(head != null)
17        {
18            next = head.next;
19            head.next = prev;
20            prev = head;
21            head = next;
22        }
23        return prev;
24    }
25    public boolean isPalindrome(ListNode head) 
26    {
27        if(head == null || head.next == null)
28        {
29            return true;
30        }
31        ListNode fast = head,slow = head;
32        while(fast != null && fast.next != null)
33        {
34            slow = slow.next;
35            fast = fast.next.next;
36        }
37        ListNode fh = head;
38        ListNode sh = reverse(slow);
39        while(sh != null)
40        {
41            if(fh.val != sh.val)
42            {
43                return false;
44            }
45            fh = fh.next;
46            sh= sh.next;
47        }
48        return true;
49    }
50}