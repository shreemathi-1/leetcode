// Last updated: 3/24/2026, 8:38:57 PM
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
12
13    public ListNode reverseList(ListNode head){
14        ListNode curr = head;
15        ListNode prev = null;
16        ListNode nxt = head;
17        while(curr != null){
18            nxt = curr.next;
19            curr.next = prev;
20            prev = curr;
21            curr = nxt;
22        }
23
24        return prev;
25    }
26
27    public ListNode reverseKGroup(ListNode head, int k) {
28        
29        ListNode temp = head;
30        ListNode KthNode = head;
31        ListNode dummy = new ListNode();
32        ListNode prev = dummy;
33        ListNode nxtNode = head;
34
35        while( KthNode != null){
36            int i=0;
37            KthNode = temp;
38
39            while(KthNode != null && i<k-1){
40                KthNode = KthNode.next;
41                i++;
42            }
43
44            if(KthNode == null){
45                prev.next = temp;
46            }
47            else{
48                nxtNode = KthNode.next;
49                KthNode.next = null;
50                prev.next = reverseList(temp);
51                prev = temp;
52                temp = nxtNode;
53            }
54        }
55
56        return dummy.next;
57
58    }
59}