// Last updated: 4/27/2026, 11:47:49 AM
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
15        ListNode h1 = list1 , h2 = list2;
16        ListNode dummy = new ListNode(0);
17        ListNode temp = dummy;
18        if(h1 == null && h2 == null) 
19            return null;
20        while(h1 != null || h2 != null)
21        {
22            if(h1 == null)
23            {
24                temp.next = h2;
25                break;
26            }
27            else if(h2 == null)
28            {
29                temp.next = h1;
30                break;
31            }
32            else if(h1.val <= h2.val)
33            {
34                temp.next = h1;
35                h1 = h1.next;
36            }
37            else
38            {
39                temp.next = h2;
40                h2 = h2.next;
41            }
42            temp = temp.next;
43        }  
44        return dummy.next;  
45    }
46}