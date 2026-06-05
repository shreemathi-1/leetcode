// Last updated: 6/5/2026, 9:27:44 AM
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
12    public ListNode reverseKGroup(ListNode head, int k) {
13        ListNode temp = head;
14        int c =0;
15        while(temp != null)
16        {
17            temp = temp.next;
18           c++;
19        }
20        if(c < k)
21        {
22            return head;
23        }
24        int i=0;
25        ListNode cur = head , prev = null,next = null;
26        while(i<k )
27        {
28            next = cur.next;
29            cur.next = prev;
30            prev = cur;
31            cur = next;
32            i++;
33        }
34        head.next = reverseKGroup(cur,k);
35        return prev;
36    }
37}