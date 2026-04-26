// Last updated: 4/26/2026, 5:41:16 PM
1/**
2 * Definition for singly-linked list.
3 * class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode(int x) {
7 *         val = x;
8 *         next = null;
9 *     }
10 * }
11 */
12public class Solution 
13{
14    public boolean hasCycle(ListNode head) 
15    {
16        ListNode slow = head , fast = head;
17        while(fast!=null && fast.next != null)
18        {
19            
20            slow = slow.next;
21            fast = fast.next.next;
22            if(slow == fast)
23            {
24                return true;
25            }
26            
27        }
28        return false;   
29    }
30}