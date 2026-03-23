// Last updated: 3/23/2026, 12:02:12 PM
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
13    public ListNode mergeTwoLists(ListNode list1, ListNode list2) 
14    {
15        ListNode c1 = list1;
16        ListNode c2 = list2;
17        if(c1 == null && c2 == null) return null;
18        ListNode dummy = new ListNode(0);
19      ListNode temp = dummy;
20    while(c1 != null && c2 != null)
21    {
22          
23        if(c1.val < c2.val)
24        {
25            temp.next = c1;
26            c1 = c1.next;
27        }
28        else
29        {
30            temp.next = c2;
31            c2 = c2.next;
32        }
33        temp = temp.next;
34    }
35    if(c2 ==null)
36    {
37        temp.next = c1;
38    }
39    if(c1 == null)
40    {
41        temp.next = c2;
42    }
43    return dummy.next;
44    }
45}