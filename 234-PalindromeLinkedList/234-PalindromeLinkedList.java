// Last updated: 6/8/2026, 12:44:24 PM
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
12    public ListNode reverse(ListNode head)
13    {
14        ListNode cur = head, prev = null , next = null;
15        while(cur != null)
16        {
17            next = cur.next;
18            cur.next = prev;
19            prev = cur ;
20            cur = next;
21        }
22        return prev;
23    }
24    public boolean isPalindrome(ListNode head) {
25        if(head == null || head.next == null) return true;
26        ListNode slow = head, fast = head;
27        while(fast != null && fast.next != null)
28        {
29            slow = slow.next;
30            fast = fast.next.next;
31        }
32        ListNode mid= slow;
33        
34
35        ListNode rHead = reverse(mid);
36        ListNode rTemp = rHead;
37        ListNode temp = head;
38        while(rTemp != null )
39        {
40            if(temp.val != rTemp.val)
41            {
42                return false;
43            }
44            temp = temp.next;
45            rTemp = rTemp.next;
46        }
47        return true;
48    }
49}