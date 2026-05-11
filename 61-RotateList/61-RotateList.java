// Last updated: 5/11/2026, 9:13:16 AM
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
13    public ListNode rotateRight(ListNode head, int k) 
14    {
15        if(head == null || head.next == null)
16        return head;
17        int len = 0;
18        ListNode temp = head;
19        while(temp != null)
20        {
21            len++;
22            temp = temp.next;
23        }
24        k = k%len;
25        if(k ==0) return head;
26        int move = len - k;
27        ListNode temp2 = head;
28        int c =0;
29        while(c < move-1)
30        {
31            c++;
32            temp2 = temp2.next;
33        }
34        
35        ListNode newHead = temp2.next;
36        temp2.next = null;
37        ListNode temp3 = newHead;
38        while(temp3.next != null)
39        {
40            temp3 = temp3.next;
41        }
42        
43        temp3.next = head;
44        return newHead;
45    }
46}