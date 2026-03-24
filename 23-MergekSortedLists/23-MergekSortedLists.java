// Last updated: 3/24/2026, 9:38:11 PM
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
12    public ListNode mergeKLists(ListNode[] lists) {
13        ListNode dummyHead = new ListNode(-1);
14        var pq = new PriorityQueue<ListNode>((a, b) ->  a.val - b.val);
15
16        
17        for(int i = 0; i<lists.length; i++) {
18            if (lists[i] != null) pq.add(lists[i]);
19        }
20        ListNode ptr = dummyHead;
21
22        while(!pq.isEmpty()) {
23            var nextNode = pq.poll();
24            if (nextNode.next != null) {pq.add(nextNode.next);}
25            ptr.next = nextNode;
26            ptr = nextNode;
27            ptr.next = null;
28        }
29
30        return dummyHead.next;
31    }
32}