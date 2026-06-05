// Last updated: 6/5/2026, 11:18:20 AM
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
12    public ListNode merge(ListNode l1 , ListNode l2)
13    {
14        if(l1 == null && l2==null) return null;
15        if(l1 == null) return l2;
16        if(l2 == null) return l1;
17
18        ListNode dummy = new ListNode(0);
19        ListNode temp = dummy;
20
21        while(l1 != null && l2 != null)
22        {
23            if(l1.val < l2.val)
24            {
25                temp.next = new ListNode(l1.val);
26                temp = temp.next;
27                l1 = l1.next;
28            }
29            else
30            {
31                temp.next = new ListNode(l2.val);
32                temp = temp.next;
33                l2 = l2.next;
34            }
35
36        }
37        if(l1 == null)
38        {
39            temp.next = l2;
40         }
41        else if(l2 == null)
42         {
43             temp.next = l1;
44         }
45        return dummy.next;
46    }
47    public ListNode mergeKLists(ListNode[] lists) {
48        if(lists.length ==0)
49        {
50            return null;
51        }
52        ListNode res = lists[0];
53        for(int i =1;i<lists.length;i++)
54        {
55            res = merge(res , lists[i]);
56        }
57        return res;
58    }
59}