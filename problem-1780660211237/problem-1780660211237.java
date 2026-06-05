// Last updated: 6/5/2026, 5:20:11 PM
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
12    public ListNode deleteDuplicates(ListNode head) {
13        ListNode temp1 = head;
14      
15        while(temp1 != null && temp1.next != null)
16        {
17            ListNode temp2 = temp1.next;
18            if(temp1.val == temp2.val)
19            {
20                temp1.next = temp1.next.next;
21            }
22            else
23            {
24                 temp1 = temp1.next;
25            }
26           
27        }
28        return head;
29    }
30}