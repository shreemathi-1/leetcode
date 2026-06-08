// Last updated: 6/8/2026, 10:43:20 AM
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
12    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
13       ListNode h1 = list1;
14       ListNode h2 = list2;
15       ListNode dummy = new ListNode(0);
16       ListNode temp = dummy;
17       while(h1 != null && h2 != null)
18       {
19            if(h1.val <= h2.val)
20            {
21                temp.next = h1;
22                temp = temp.next;
23                h1 = h1.next;
24            }
25            else
26            {
27                temp.next = h2;
28                temp = temp.next;
29                h2 = h2.next;
30            }
31       }
32       if(h1 == null )
33       {
34        temp.next = h2;
35       } 
36       if(h2 == null)
37       {
38        temp.next = h1;
39       }
40       return dummy.next;
41    }
42}